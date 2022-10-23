//============================================================================
// Name        : BinarySearchTree.cpp
// Author      : Kenny Feilen
// Date        : 10/22/2022
// Version     : 2.5
// Copyright   : Copyright © 2017 SNHU COCE
// Description : This is a Bianary Search Tree application written in C++
//             : The program takes a CSV file and places it into a BST
//             : This application has two loops, one for the inital menu
//             : Followed by a second looped call after requesting input from the user
//             : This BST allowes for the user to search, display and delete any entry from the tree
//============================================================================

#include <iostream>
#include <time.h>
#include <algorithm>
#include "CSVparser.hpp"

using namespace std;

//============================================================================
// Global definitions visible to all methods and classes
//============================================================================

// Forward declarations
double strToDouble(string str, char ch);

// Defines the structure to hold bid information
struct Bid {
    string bidId; // unique identifier
    string title;
    string fund;
    double amount;
    Bid() {
        amount = 0.0;
    }
};

// Sets up the internal structure for tree node
struct Node {
    Bid bid;
    Node* left;
    Node* right;

    // Default constructor 
    Node() {
        left = nullptr;
        right = nullptr;
    }

    // Initializes a node with a given bid
    Node(Bid aBid) : Node() {
        this->bid = aBid;
    }
};

//============================================================================
// Binary Search Tree class definition
//============================================================================

/**
 * Define a class containing data members and methods to
 * implement a binary search tree
 */
class BinarySearchTree {

private:
    Node* root;

    void addNode(Node* node, Bid bid);
    void inOrder(Node* node);
    Node* removeNode(Node* node, string bidId);

public:
    BinarySearchTree();
    virtual ~BinarySearchTree();
    void InOrder();
    void Insert(Bid bid);
    void Remove(string bidId);
    Bid Search(string bidId);
};

/**
 * Default constructor
 */
BinarySearchTree::BinarySearchTree() {
    // Initialize housekeeping variables
    root = nullptr;
}

/**
 * Destructor
 * recurses from the root, deleting every node
 */
BinarySearchTree::~BinarySearchTree() {
}

/**
 * Traverse the tree in order
 */
void BinarySearchTree::InOrder() {
    this->inOrder(root);
}
/**
 * Insert a bid
 */
void BinarySearchTree::Insert(Bid bid) {
    // inserts a bid into the tree by finding the next empty node
    // this calls addNode to iterate through the tree
    if (root == nullptr) {
        root = new Node(bid);
    }
    else {
        this->addNode(root, bid);
    }
}

/**
 * Remove a bid
 */
void BinarySearchTree::Remove(string bidId) {
    // Removes the selected bid from the tree
    this->removeNode(root, bidId);
}

/**
 * Search for a bid
 */
Bid BinarySearchTree::Search(string bidId) {
    // Searches the tree for a bid

    // Start searching from root
    Node* current = root;

    // Keeps searching until bottom or bid is found
    while (current != nullptr) {
        // If current matches, return it
        if (current->bid.bidId.compare(bidId) == 0) {
            return current->bid;
        }
        // If bid is smaller than current, go left
        if (bidId.compare(current->bid.bidId) < 0) {
            current = current->left;
        }
        else {
            current = current->right;
        }
    }
    Bid bid;
    return bid;
}


/**
 * Add a bid to some node (recursive)
 *
 * @param node Current node in tree
 * @param bid Bid to be added
 */
void BinarySearchTree::addNode(Node* node, Bid bid) {
    // Inserts a bid into the tree
    // If node is larger than bid, add to left of tree
    if (node->bid.bidId.compare(bid.bidId) > 0) {
        if (node->left == nullptr) {
            node->left = new Node(bid);
        }
        else {
            this->addNode(node->left, bid);
        }
    }
    // Add right side of tree
    else {
        if (node->right == nullptr) {
            node->right = new Node(bid);
        }
        else {
            this->addNode(node->right, bid);
        }
    }
}

/**
 * Search for a bid
 */

void BinarySearchTree::inOrder(Node* node) {
    if (node != nullptr) {
        inOrder(node->left);
        cout << node->bid.bidId << ": "
            << node->bid.title << " | "
            << node->bid.amount << " | "
            << node->bid.fund << endl;
        inOrder(node->right);
    }
}
Node* BinarySearchTree::removeNode(Node* node, string bidId) {
    // If this node is null then return
    if (node == nullptr) {
        return node;
    }

    // Recursive down left of tree
    if (bidId.compare(node->bid.bidId) < 0) {
        node->left = removeNode(node->left, bidId);
    }
    else if (bidId.compare(node->bid.bidId) > 0) {
        node->right = removeNode(node->right, bidId);
    }
    else {
        // No children then a leaf node
        if (node->left == nullptr && node->right == nullptr) {
            delete node;
            node = nullptr;
        }
        // One child on left
        else if (node->left != nullptr && node->right == nullptr) {
            Node* temp = node;
            node = node->left;
            delete temp;
        }

        // One child on right
        else if (node->right != nullptr && node->left == nullptr) {
            Node* temp = node;
            node = node->right;
            delete temp;
        }
        // Two children
        else {
            Node* temp = node->right;
            while (temp->left != nullptr) {
                temp = temp->left;
            }
            node->bid = temp->bid;
            node->right = removeNode(node->right, temp->bid.bidId);
        }

    }
    return node;
}


/**
 * Display the bid information to the console (std::out)
 *
 * @param bid struct containing the bid info
 */
void displayBid(Bid bid) {
    cout << bid.bidId << ": " << bid.title << " | " << bid.amount << " | "
        << bid.fund << endl;
    return;
}

/**
 * Load a CSV file containing bids into a container
 *
 * @param csvPath the path to the CSV file to load
 * @return a container holding all the bids read
 */
void loadBids(string csvPath, BinarySearchTree* bst) {
    cout << "Loading CSV file " << csvPath << endl;

    // Initializes the CSV Parser using its path
    csv::Parser file = csv::Parser(csvPath);

    // Read and display header row - optional
    vector<string> header = file.getHeader();
    for (auto const& c : header) {
        cout << c << " | ";
    }
    cout << "" << endl;

    try {
        // Loop to read rows of a CSV file
        for (unsigned int i = 0; i < file.rowCount(); i++) {

            // Create a data structure and add to the collection of bids
            Bid bid;
            bid.bidId = file[i][1];
            bid.title = file[i][0];
            bid.fund = file[i][8];
            bid.amount = strToDouble(file[i][4], '$');

            // push this bid to the end
            bst->Insert(bid);
        }
    }
    catch (csv::Error& e) {
        std::cerr << e.what() << std::endl;
    }
}

/**
 * Simple C function to convert a string to a double
 * after stripping out unwanted char
 *
 * credit: http://stackoverflow.com/a/24875936
 *
 * @param ch The character to strip out
 */
double strToDouble(string str, char ch) {
    str.erase(remove(str.begin(), str.end(), ch), str.end());
    return atof(str.c_str());
}


//The one and only main() method
int main(int argc, char* argv[]) {

    // Printing out header
    cout << "Welcome to my Bianary Search Tree Example!" << endl;
    cout << "This program loads an Excel file into a Bianary Search Tree" << endl;
    cout << "Author : Kenny Feilen" << endl;
    cout << "Date: September 2022" << endl;

    // Process command line arguments
    string csvPath, bidKey;
    switch (argc) {
    case 2:
        csvPath = argv[1];
        bidKey = "98109";
        break;
    case 3:
        csvPath = argv[1];
        bidKey = argv[2];
        break;   
    default:
        csvPath = "eBid_Monthly_Sales_Dec_2016.csv";
        bidKey = "98109";
    }

    // Defines a timer variable
    clock_t ticks;

    // Define the binary search tree to hold all bids
    BinarySearchTree* bst;
    Bid bid;
    bst = new BinarySearchTree();


    // Menu selection
    // Option 5 enters a new menu 
    int choice = 0;
    while (choice != 9) {
        cout << "Menu:" << endl;
        cout << "  1. Load Bids" << endl;
        cout << "  2. Display All Bids" << endl;
        cout << "  3. Find Bid" << endl;
        cout << "  4. Remove Bid" << endl;
        cout << "  5. Search For A Bid ID to Delete" << endl;
        cout << "  9. Exit" << endl;
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {

        case 1:
            // Initialize a timer variable before loading bids
            ticks = clock();

            // Complete the method call to load the bids
            loadBids(csvPath, bst);

            // Calculate elapsed time and display result
            ticks = clock() - ticks; // Current clock ticks minus starting clock ticks
            cout << "time: " << ticks << " clock ticks" << endl;
            cout << "time: " << ticks * 1.0 / CLOCKS_PER_SEC << " seconds" << endl;
            break;

        case 2:
            // Initialize a timer variable before loading bids
            ticks = clock();

            // Displays bids in order
            bst->InOrder();

            // Calculate elapsed time and display result
            ticks = clock() - ticks; // Current clock ticks minus starting clock ticks
            cout << "time: " << ticks << " clock ticks" << endl;
            cout << "time: " << ticks * 1.0 / CLOCKS_PER_SEC << " seconds" << endl;
            break;

        case 3:
            // Initialize a timer variable before loading bids
            ticks = clock();

            // Displays specific bid 
            bid = bst->Search(bidKey);

            // Display bid or bid not found error 
            if (!bid.bidId.empty()) {
                displayBid(bid);
            }
            else {
                cout << "Bid Id " << bidKey << " not found." << endl;
            }

            // Calculate elapsed time and display result
            ticks = clock() - ticks; // Current clock ticks minus starting clock ticks
            cout << "time: " << ticks << " clock ticks" << endl;
            cout << "time: " << ticks * 1.0 / CLOCKS_PER_SEC << " seconds" << endl;
            break;

        case 4:

            bst->Remove(bidKey);
            break;


        case 5:
          
            // Setting placeholder for input and bid range
            string user_bid;
            int bid_min, bid_max;
            bid_min = 97946;
            bid_max = 98385;

            // Setting up for a user imput bid id
            cout << endl;
            cout << "Please enter a bid ID to select " << endl;
            cout << "This should be entered as an intiger and fall between " << bid_min << " and " << bid_max << endl;
            cout << "Use the 'Display All Bids' Selection to find a valid ID" << endl;
            cout << "Use 9 to exit to the main menu" << endl;
            cout << endl;
            cin >> user_bid;
            
            // Searches for a match between the user imput and bid Id's 
            bid = bst->Search(user_bid);

            // Displays the match if found or displays an error and exits
            if (!bid.bidId.empty()) {
                displayBid(bid);
            }
            else {
                cout << "Bid Id " << user_bid << " not found." << endl;
                cout << "Use the 'Display All Bids' Selection to find a valid ID" << endl;
                cout << "Returing to main menu..." << endl;
                break;
            }
            
            
            /*
            **  Enters a new loop with the user's selected bid
            **  A 9 will break the loop
            */
            int choice_two = 0;
            while (choice_two != 9) {
                cout << "Bid Selected: What Would You Like To Do???" << endl;
                cout << "  1. Display My Selected Bid" << endl;
                cout << "  2. Remove My Selected Bid" << endl;
                cout << "  9. Return to Main Menu" << endl;
                cout << "Enter choice: " << endl;
                cin >> choice_two;

                switch (choice_two) {

                case 1:

                    // Searches for the bid again and displays the results
                    bid = bst->Search(user_bid);
                    displayBid(bid);
                    break;

                case 2:

                    // Removes the bid that was selcted by the user
                    bst->Remove(user_bid);
                    // Displays output upon removal
                    cout << endl;
                    cout << "******************************************************************" << endl;
                    cout << "******************************************************************" << endl;
                    cout << "Your selection of " << bid.bidId << " Has been removed from the database !!!" << endl;
                    cout << "Entry Removed: " << bid.title << endl;
                    cout << "                      ***  COMPLETED  ***" << endl;
                    cout << "******************************************************************" << endl;
                    cout << "******************************************************************" << endl;
                    cout << endl;

                    break;

                }
            }
        }
    }

    cout << "Good bye." << endl;

    return 0;
}