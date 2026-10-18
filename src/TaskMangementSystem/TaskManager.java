package TaskMangementSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskManager {
	
	Scanner sc = null;
	
	private Map<Integer, Task> tasks = new HashMap<Integer, Task>();

	int idCount = 0;

	public void addTask() {
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter a Task Name");
		String taskName = sc.nextLine();
		
		System.out.println("Enter a task Description");
		String taskDescription = sc.nextLine();
		
		Date dueDate = getDate();
		
		String priority = setPriority();
		
		tasks.put(++idCount, new Task(idCount, taskName, taskDescription, dueDate, priority));
		System.out.println("Task Added");
		System.out.println();
	}
	
	private Date getDate() {
		
		System.out.println("Enter a  Date ? (DD-MM-YYYY)" );
		String date  = sc.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		  try {
			Date  dueDate = dateFormat.parse(date);
			return dueDate;
		} catch (Exception e) {
			System.out.println("Enter a Proper formate");
			getDate();
		}
		  return null;
	}

	public void viewTask() {
		
		for(int i : tasks.keySet()) {
			System.out.println("Task id : " + i +  " | Task Name : " + tasks.get(i).getTaskName() + " | Task Description : " + tasks.get(i).getTaskDescription());
			System.out.println("Due Date is : " +  dateToString(tasks.get(i).getDueDate()));
			System.out.println("Priority Range : " + tasks.get(i).getPriority());
		}
	}
	
	private String dateToString(Date dueDate) {
		
		SimpleDateFormat dateFormat =  new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat.format(dueDate);
	}

	private String setPriority() 
	{
		System.out.println("Enter a Priority (HIGH/ MEDIUM/ LOW)");
		String priority = sc.next().toUpperCase();
		
		if(!priority.equals("HIGH") && !priority.equals("LOW") && !priority.equals("MEDIUM")) {
			return "MEDIUM";
		}
		
		return priority;
	}
	
	
	
	
	
	
	
		
	
}
