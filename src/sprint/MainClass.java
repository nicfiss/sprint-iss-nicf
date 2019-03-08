/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint;

/**
 *
 * @author issuser
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
                doList list = new doList();
		boolean exit = false;
		do {
			showMenu(list);
			int input = readInput(list);
			if (input==9) exit=true;
		} while (!exit);
	}
	
	public static void showMenu(doList list){
		System.out.println("Welcome to To Do List Application");
		System.out.println("Menu: ");
		System.out.println("1. List all to do list");
		System.out.println("2. Add new item");
		System.out.println("3. Delete an item");
		System.out.println("4. Mark an item as complete");
		System.out.println("9. Quit");
		System.out.print("Enter your choice: ");
                
	}
	
	public static int readInput(doList list){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();	
		int selection = 0;
		switch(input){
		case 1:
			System.out.println("1");
                        showCurrentList(list);
			break;
			
		case 2:
			System.out.println("2");
                        scanner.nextLine();
                        System.out.println("Please add the description");
                        String desc = scanner.nextLine();
                        System.out.println("Please set the priority");
                        int priority = scanner.nextInt();
                        System.out.println("Please add the date");
                        long date = scanner.nextLong();
                        System.out.println("Please add the status");
                        int status = scanner.nextInt();
                        
                        Item newItem = new Item(0,desc,priority,date,status);          
                        list.addItem(newItem);
			break;
			
		case 3:
			System.out.println("3");
                        showCurrentList(list);
                        System.out.println("Please choose the item to remove");
                        selection = scanner.nextInt();	
                        list.removeItem(selection);
			break;
                case 4:
                        System.out.println("4");
                        showCurrentList(list);
                        System.out.println("Please choose the item to mark complete");
                        selection = scanner.nextInt();	                                       
                        list.editStatus(selection,1);
                        break;
			
		case 9:

			break;
		default:
			System.out.println("Invalid choice");
		}
		
		
		return input;
	}
	
	public static void showCurrentList(doList list){
		int counter = 0;
		for (Item s : list.item){
			System.out.printf("the item %d is %s %d %s %d\n",counter,s.Date,s.Priority,s.description,s.Status);
                        counter +=1;
		}
		
	}
}
