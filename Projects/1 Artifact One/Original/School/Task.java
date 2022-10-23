package School;

public class Task {

	private String taskID;
	private String taskName;
	private String taskDescription;
	
	public Task(String taskID, String taskName, String taskDescription) {
		if(taskID == null || taskID.length()>10) {
			throw new IllegalArgumentException("Invalid Task ID");
		}
		
		if(taskName == null || taskName.length()>20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}
		
		if(taskDescription == null || taskDescription.length()>50) {
			throw new IllegalArgumentException("Invalid Task Description");
		}
		
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
	}
	

	public String gettaskID() {
		return taskID;
	}
	
	public String gettaskName() {
		return taskName;
	}

	public String gettaskDescription() {
		return taskDescription;
	}
	
	
	public void updateTaskName(String newTaskName) {
		 this.taskName = (newTaskName);
	}


	public void updateTaskDescription(String newTaskDescription) {
		this.taskDescription = (newTaskDescription);
	}
}
