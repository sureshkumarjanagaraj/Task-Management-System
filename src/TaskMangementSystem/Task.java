package TaskMangementSystem;

import java.util.Date;

public class Task {

	 private int taskId;
	 private String taskName;
	 private String taskDescription;
	 Date dueDate;
	 private String priority;
	 

	 public Task(int taskId, String taskName, String taskDescription , Date dueDate, String priority) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.dueDate = dueDate;
		this.priority = priority;
	}

	 public String getTaskName() {
		 return taskName;
	 }

	 public String getTaskDescription() {
		 return taskDescription;
	 }
	 
	 public Date getDueDate() {
		 return dueDate;
	 }

	 public String getPriority() {
		 return priority;
	 }

	 
}
