package TaskMangementSystem;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	System.out.println("Welcome to the Task Management System");
	
	Scanner sc =  new Scanner(System.in);
	
	TaskManager tasks =  new TaskManager();
	
	boolean isRunning = true;
	
	while(isRunning) {
		System.out.println("Select the Operations which to do?");
		System.out.println("1. Add Task");
		System.out.println("2. To view all Task");
		System.out.println("0. for Exit");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 :  tasks.addTask();
		break;
		case 2 :tasks.viewTask();
		break;
		case 0 :  isRunning = false;
		}
}
	
	sc.close();
}
}
