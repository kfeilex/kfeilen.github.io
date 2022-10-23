# Kenny Feilen's Portfolio
Welcome to my Portfolio for the Computer Science Capstone course, CS 499. My name is Kenny Feilen. I have created this website on GitHub to showcase my journey at Southern New Hampshire University and the skills I gained along the way. I have included a professional self-assessment and a code review to highlight and analyze three projects I created at SNHU. The remaining three sections are dedicated to each project. Every project has its original code, my updated code, and an overview of the update or enhancements performed. This website will demonstrate how I met all the course outcomes and requirements for CS 499, Computer Science Capstone. Thank you for visiting.

## Table of contents:
1.	Professional Self-assessment
2.	Code Review
3.	Software Design and Engineering – Python Testing 
4.	Algorithm and Data Structures – C++ Binary Search Tree
5.	Databases – MySQL Triggers

## Professional Self-assessment:
I enrolled at Southern New Hampshire University back in 2019 in the computer science program. Throughout my journey in the program, I have learned valuable industry skills and best practices while having the ability to work on diverse projects from different subject matters. Working with many languages like Java, C++, Python, and SQL as well as taking classes like Cyber Security 200, IT 255 introduction to Linux, and IT 365 Operating Environments all helped to provide me with a rich baseline of capabilities and an insight into how the computer science industry works. I have highlighted some classes below that stood out and helped me along my journey.

Working in CS 310, Collaboration and Team Project, provided me with the experience of working on a development team. The class worked on a single project that each student edited locally and then pushed to the working repository. Allowing for the rest of the team to review our work before submitting the changes we made to the master branch and finalizing it. This was my first-time experiencing code reviews and the benefit they have when working as a team. Before pushing code to the main repository, we had to ensure that there were no errors, the code was readable, and would function correctly for the given task. This class is where I learned the importance of writing readable code with logical comments as well as the importance of code reviews. This was a great experience and I learned what it was like to function as a team member in a production environment. While using version control tools to positively affect the team’s production through reviewing and approving changes. 

Object Oriented Analysis, IT 315 provided me the opportunity to work on a project using object-oriented design principles. For this class, I used the requirements of the stakeholders to create an entire project outline with a timeline. I learned about functional, structural, and behavioral models and how to create and read them. As well as how to implement changes in a project while accounting for the added time these changes are going to add. This required collaboration with the stakeholders to see if the requested change would out weight the time addition to the project. Accounting for how changes will affect an overall timeline and how to approach those changes is something that I learned during this class. In the end, I was able to plan and design a project from the stakeholder requirements, into a functional outline, ensuring the requirements are met when the project is complete. 

One last class that was very influential on my career path was CS 200: Cybersecurity Foundations. This class opened my eyes to the world of cyber security. I learned about threat actors and different ways they will attempt to compromise networks and data. I saw the implications of not securing passwords and not configuring networks correctly. I was given the opportunity to compromise a remote system in a lab environment to exploit those types of vulnerabilities and provide a recap of what vulnerabilities were found on the network. This experience exposed me to a real-world use case of why the CIA triad, confidentiality, integrity, and availability, is so important. I always ensure that passwords are complex, after this class I learned to never leave passwords hardcoded into leftover test files or where they can be easily found on the system. I also make sure to restrict access when I write code so that users can only have the required data they need while making sure that data is available when they need it. This will make sure data is not removed by someone who should not be able to, keeping with a security mindset and data integrity. I talk more about security in the final part of this portfolio when I review my SQL project. 

Additionally, I have included three projects in this portfolio that I will review below. Software Design and Engineering, where I implement testing in Python. Algorithms and data structures, where I update my C++ Binary Search Tree, and Databases, where I implement MySQL Triggers. The first project below takes a JAVA program and implements sections of that program in Python to utilizing testing in Python. This project relates to the importance of testing code and how to write tests. The second project is my binary search tree which will showcase algorithms and how they can be used to quickly search data. Finally, this portfolio will conclude with a MySQL demonstration of how triggers can be utilized in the real world for both time savings and security use cases.


## Code Review:
This section of my portfolio consists of my code review which I have linked below. This code review as well as the comments throughout my projects and examples given in the professional self-assessment will show how I met the requirements for CS-499-01. Employ strategies for building collaborative environments that enable diverse audiences to support organizational decision making in the field of computer science. For each of my three projects I reviewed their functionality before any enhancements, performed an analysis of its code and then made decisions on updates or changes that would enhance the overall project. Taking a deeper look into the projects I have created line by line allowed me to look at what each project currently does and how it preforms those tasks. This allowed me to see other ways that I could improve the overall functionality in the future. This was a vital step to ensuring that my code met the needs of stakeholders and that it was written to be as efficient as possible. Preforming code reviews are a necessary step in the software development lifecycle (SDL). Looking for functionality, readability, formatting style, testing and so much more allows for a second set of eyes to ensure the deliverable will meet the stakeholder’s requirements. When transitioning into team environments, understanding the importance of code reviews and the collaboration they build among a team is vital. My code review is linked below.

#### [Code Review]( https://youtu.be/AKVDHKq740c)


## Software Design and Engineering – Python Testing:
The first project in my portfolio is from CS 320: Software Testing, Automation, and Quality Assurance. In this project I created a Java program with a contact class and service class to update the contact class. I also created test classes for each to ensure that the information stored in the variables was within set guidelines. This project and the class in general, focused mainly on the importance of testing code and the role that plays in the overall software development lifecycle. Making this a great project to expand on. I created this project in June 2021.

I expanded on this project and rewrote a section of it into Python to show testing in a different language. Testing is one of the most important parts of the SDL and cannot be overlooked. Writing good tests is the key to ensuring your code will accomplish the required task, while not breaking when given bad data. Additionally, this allows for updates to be written into a project and quickly be ran against prewritten tests to ensure functionality is retained. 


### List of Enhancements Preformed
1.	Created new Project in Python
2.	Created Contact Class
3.	Implemented constraints on variables with raise ValueError
4.	Created Test Class
5.	Wrote tests for each function to ensure ValueError was raised

#### [Original Code]( https://github.com/kfeilex/kfeilen.github.io/tree/main/Projects/1%20Artifact%20One/Original)
#### [Updated Code]( https://github.com/kfeilex/kfeilen.github.io/tree/main/Projects/1%20Artifact%20One/Updated/PythonTestProject)

This projects demonstrates how I met the requirements for CS-499-04. Demonstrating an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals. I took my original project and rewrote the contact class in Python. I set constraints on each of the variables based on the requirements. Then I successfully implemented ten tests on the contact class to ensure that the variables provided were within the bounds of the requirements. 

Working with this program was fun yet I had some challenges along the way, mainly with overthinking the problem. This is one thing that I struggled with occasionally in development, overthinking what I am trying to accomplish. I found once I took a step back, I could look at the problem from a different angle and move forward. I was able to enhance my project by writing tests in Python. Writing tests in Python instead of Java was more straight forward for me and ended up with cleaner looking code. I did struggle to get pytest working on my local machine and ended up utilizing unit tests in Python instead.


## Algorithm and Data Structures – C++ Binary Search Tree:
My second project is from CS 260: Data Structures and Algorithms. In this project I implemented a binary search tree using C++ to search for and delete a specific entry in a CSV file. This project sets the framework for a binary search tree, imports an excel document, then provides search and delete functionality on a hard-coded key. This project was created in October 2020 and was fun to work on again. 

I included this example in my portfolio for a few reasons. Binary search trees are powerful algorithms that allows for data to be searchable through a key. Making them a fast and efficient way of navigating large datasets and valuable to understand how they work due to their real-world use cases. My original project set the framework for a binary search tree and demonstrated how they work. However, this framework did not allow user input when searching the tree, as the key was hard-coded into the program. I saw that as an opportunity to expand the project to allow user input and showcase a more real-world example of how to use algorithms.

### List of Enhancements Preformed
1.	Cleaned up existing comments.
2.	Added new comments for readability.
3.	Deleted unused code.
4.	Made file more readable – Spacing.
5.	Add a new selection on the menu – Search.
6.	Implemented and accounted for user input for Search.
7.	Added a second menu with upon user input to call Display or Delete.
8.	Added the ability to exit and return to the main menu.

#### [Original Code]( https://github.com/kfeilex/kfeilen.github.io/tree/main/Projects/2%20Artifact%20Two/Original/BST_2020)
#### [Updated Code]( https://github.com/kfeilex/kfeilen.github.io/tree/main/Projects/2%20Artifact%20Two/Updated/BinarySearchTree)

The original and enhanced projects demonstrate how I met the requirements for CS-499-03. Design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution, while managing the trade-offs involved in design choices. I did this by creating a binary search tree in C++ to take in data from a CSV file by a key. I then performed the enhancements where I added a way for the user to interact with the data using their own search key, in this case a bid Id. If the bid Id was valid, it would return a screen prompting the user to display or delete the returned entry permanently. Accounting for user input in this project shows how the foundation for how to utilize a binary search tree and how that can be scaled to the needs of the business or stakeholder. This project also relates to solving problems and finding appropriate solutions to problems while considering the use case, and speed in which data is retrieved. There are other methods of sorting and searching data, yet a utilizing an algorithm is more efficient and understanding how they work is relevant in today’s software industry.

Working with this program was a lot of fun and I had some challenges along the way. I was able to enhance my project by allowing user input, allowing user specific delete, cleaning up comments, as well as adding printouts that called specific data using the user’s key. I spent some time creating a second menu and print statements showing the user their options using switch and while loops. I had some trouble the first way I tried to implement a loop that checked for a correct input from the user. I wanted to check if the bid was correct and, in the system. However, I could not get that to work the ways I tried implementing it. I ended up initializing a while loop after the input as a second menu instead. This provided the usability I wanted by allowing the user to personally select an entry and then decided if that entry should be removed from the list.  


## Databases – MySQL Triggers:

The final project in my portfolio is from the class DAD 220: Introduction to Structural Database Environments. Where I used MySQL to navigate SQL databases and extract relevant information for stakeholders. This project used joins in complex select statements to pinpoint the companies most returned items and the state that had the most retuned products. Providing stakeholders, the information needed to make relevant business decisions. I created this project in May of 2020.

I included this project in my portfolio because I found the class a lot of fun and relevant to my skill set. Learning MySQL and how to navigate through a large database quickly was exciting. As the class progressed and the queries and concepts got more advanced, I realized how beneficial understanding SQL will be in a future career path. The original project demonstrates some of the required skills and techniques needed to navigate a database using SQL. I knew I could use this project as a starting point to show more advance concepts of SQL like triggers and how they can be deployed. In this project I showed a few different ways triggers can be used; to backup deleted entries, to keep a running total of a database without needed to search it every time as well as adding security by recording the date time and user ID of the person making the change. 

### List of Enhancements 
1.	Implemented a new project to use triggers.
2.	Created a table to hold customer data.
3.	Created a table to hold order data.
4.	Created a table named Order Tracker to hold a running total of orders in the system.
5.	Created a table to hold trigger output.
6.	Created a trigger on insert to add one to the Order Tracker table.
7.	Created a trigger on delete to do two things when activated.
    1.	Remove one from the Order Tracker table.
    2.	Create a backup of the deleted file in a table with the order information, user ID and timestamp of when the action was performed.

#### [Original Code]( https://github.com/kfeilex/kfeilen.github.io/tree/main/Projects/3%20Artifact%20Three/Original)
#### [Updated Code]( https://github.com/kfeilex/kfeilen.github.io/tree/main/Projects/3%20Artifact%20Three/Updated)

Utilizing MySQL to create, modify and use triggers to monitor tables in this project and enhancements shows my ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals, meeting the CS-499-04 requirements. I created a setup environment with tables and data to serve as a baseline environment. I then setup two different triggers that each perform a different task. One that backs-up deleted entries, the second keeps a running total of a database without needing to search it every time. By using a trigger to have a table keep a running total of orders in the system, I have accounted for different industry needs like time constraints on obtaining information. 

This project also shows how I developed a security mindset that anticipates adversarial exploits in software architecture and designs to expose potential vulnerabilities, mitigate design flaws, and ensure privacy and enhanced security of data and resources, meeting CS-499-05 requirements. The second trigger I added accomplishes two things, it creates a backup of the data that's been deleted and records pertinent information on who performed the delete and when it was done. This covering two different business needs, data retention, and always having a security mindset. Understanding what has been done to a system and at what time it started is one of the first steps in finding out what happened after an attack or loss of data. While a trigger will not stop a treat actor from gaining access to the system, like creating a complex password for the main database and users accounts will. Having logs on who performed a delete on the system with user ID and system time is beneficial in having a security mindset. In the end, the more information you have, the more prepared you are to detect malicious activity as well as recover from after an attack.

Working through this project and learning how triggers operate was interesting and different to what I had done before in MySQL. Triggers operate automatically in the background when they are activated. This is what makes them so useful, yet also more challenging to setup and debug. My first struggles were with Oracle and getting triggers to work correctly. My main issue was not being able to easily debug my code, while this was most likely user error, I had more success when I installed MySQL Workbench locally. While working through this project I started to see how powerful triggers can be. With the ability to keep track of total entries, without needing to query the entire database for the number can be time saving. The ability to add timestamps and user ID stamps to modifications and store those entries in log files can be very beneficial in troubleshooting and security monitoring. There is a lot that can be accomplished by setting up a trigger on a table. I also learned that triggers can be hard to monitor and troubleshoot. This can lead to situations where a trigger can loop or break your code without having an obvious failure point, making it difficult to troubleshoot. 

Below is a link to this project once everything has been setup. I show Orders and OrderTracker as well as DeletedOrders before I run a delete query on the database. I will then rerun the same queries on those tables again to see the results of the trigger live. 

#### [Trigger]( https://www.youtube.com/watch?v=X6vDXJVg-nw)


Published 10/23/2022
