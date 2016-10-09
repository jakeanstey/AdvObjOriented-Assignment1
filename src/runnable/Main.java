package runnable;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import hr.Employee;

public class Main
{
	public static void main(String[] args) throws ParseException{
		boolean running = true;
		Scanner input = new Scanner(System.in);
		int choice = 4;
		String stage = "main";
		
		ServiceClass.getInitialMessage();
		
		while(running){
			ServiceClass.handleCases(input.nextInt());
			switch(ServiceClass.choice){
			case "main":
				//doSomething
				ServiceClass.main();
				break;
			case "addEmployee":
				//add employee
				ServiceClass.addEmployee();
				break;
			case "addManufacturer":
				//add manufacturer
				ServiceClass.addManufacturer();
				break;
			case "addProduct":
				//add product
				ServiceClass.addProduct();
				break;
			default:
				//exit
				running = false;
				break;
			}
		}
	}

}
