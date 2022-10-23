package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import School.Task;

class TaskTest {

//Testing that the program pulls correct data
	@Test
	void testTask() {
		Task Task = new Task("Task ID", "Task Name", "Task Description");
		assertTrue(Task.gettaskID().equals("Task ID"));
		assertTrue(Task.gettaskName().equals("Task Name"));
		assertTrue(Task.gettaskDescription().equals("Task Description"));
	}

//Testing each variable for being too long
	@Test
	void testTaskIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("123456789123", "Task Name", "Task Description");
		});     }
	
	@Test
	void testTaskNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task ID", "This Task Name Is Too Long", "Task Description");
		});     }
	
	@Test
	void testTaskDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task ID", "Task Name", "This Task Description Is Too Long, Must Be Under 50 Characters.");
		});     }
	
	
//Testing each variable for being null
			@Test
	void testTaskIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Task Name", "Task Description");
		});     }
		
	void testTaskNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task ID", null, "Task Description");
		});     }

	void testTaskDescriptionIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("Task ID", "Task Name", null);
		});     }	

}
