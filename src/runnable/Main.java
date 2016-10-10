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
		
		/**
		 * The application loop, runs until running = false
		 */
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
			case "listEmployees":
				//show employees
				ServiceClass.listEmployees();
				break;
			case "searchEmployees":
				ServiceClass.searchEmployees();
				break;
			case "addManufacturer":
				//add manufacturer
				ServiceClass.addManufacturer();
				break;
			case "listManufacturers":
				//list the manufacturers
				ServiceClass.listManufacturers();
				break;
			case "addProduct":
				//add product
				ServiceClass.addProduct();
				break;
			case "listProducts":
				//list the products
				ServiceClass.listProducts();
				break;
			case "exit":
				//close the application
				System.out.println("Bye!");
				running = false;
				break;
			default:
				//Throw error
				ServiceClass.inputError();
				break;
			}
		}
	}

}
