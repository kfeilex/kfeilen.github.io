package School;

import java.util.List;
import java.util.ArrayList;


public class TaskService {
	

	private String taskName;
	private String taskDescription;

	//Initializing the array
	private List<Task> taskList = new ArrayList<>();
	
	//Using Math to create random numbers then using power to ensure it will be less than 9 digits
	//Converting back to String
	private String newTaskID() {
		int uniqueID  = (int)(Math.random()*Math.pow(10, 8));
		String newTaskID = new Integer(uniqueID).toString();
		return newTaskID;
	}
		
	// Find task by searching by task ID
	private Task findTaskbyID(String taskID) {
		int start = 0;
		while (start < taskList.size()) {
			if (taskID.equals(taskList.get(start).gettaskID())) {
				return taskList.get(start);
			}
			start++;
		}
		throw new IllegalArgumentException("Invalid Task ID, Try Again.");
	}

	//Create new unique id and assign it to the array, creating a new entry.
	public void newTask() {
		Task task = new Task(newTaskID(), taskName, taskDescription);
		taskList.add(task);
	}

	//Adding taskName to the array entry
	public void newTask(String taskName) {
		Task task = new Task(newTaskID(), taskName, taskDescription);
		taskList.add(task);
	}
	
	// Adding a description to the task item in the array.	
	public void newTask(String taskName, String taskDescription) {
		Task task = new Task(newTaskID(), taskName, taskDescription);
		taskList.add(task);
	}
	
	//Search for and delete task by task ID
	public void removeTask(String taskID) {
		taskList.remove(findTaskbyID(taskID));
	}
	
	//Update Task Name
	
	public void updateTaskName(String taskID, String taskName) {
		findTaskbyID(taskID).updateTaskName(taskName);
	
	}
	
	//Update Task Description
	
	public void updateTaskDescription(String taskID, String taskDescription) {
		findTaskbyID(taskID).updateTaskDescription(taskDescription);
	
	}
	
	
	
	public List<Task> getTaskList() {
		return taskList;
	}
}