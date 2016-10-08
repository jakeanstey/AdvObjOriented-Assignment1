package runnable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import hr.ComissionEmployee;
import hr.Employee;
import hr.HourlyEmployee;
import hr.SalaryEmployee;

public class ServiceClass
{
	public static String choice = "main";
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	public static void getInitialMessage()
	{
		System.out.println("Welcome to Georgian!\n" + "Please select an option (number)\n" + "1. Add Employee\n" + "2. Add Manufacturer\n" + "3. Add Product\n" + "4. Exit");
	}

	/**
	 * Driver for menu number selection
	 * 
	 * @param selection
	 * @throws ParseException 
	 */
	public static void handleCases(int selection) throws ParseException
	{
		if (choice == "main")
		{
			if (selection == 1)
			{
				choice = "addEmployee";
			} else if (selection == 2)
			{
				choice = "addManufacturer";
			} else if (selection == 3)
			{
				choice = "addProduct";
			} else if (selection == 4)
			{
				choice = "exit";
			} else
			{
				inputError();
			}
		} else if (choice == "addEmployee")
		{
			if (selection == 1)
			{
				// hourly employee
				addHourlyEmployee();
			} else if (selection == 2)
			{
				// comission employee
				addComissionEmployee();
			} else if (selection == 3)
			{
				// salary employee
				addSalaryEmployee();
			} else if (selection == 4)
			{
				// back
				choice = "main";
			} else
			{
				inputError();
			}
		} else if (choice == "addManufacturer")
		{

		} else if (choice == "addProduct")
		{

		} else
		{

		}
	}

	public static void inputError()
	{
		System.out.println("****Please check your input and try again.****\n");
	}

	public static void main()
	{
		// Generate welcome message
		getInitialMessage();

	}

	public static void addEmployee()
	{
		// TODO Auto-generated method stub
		System.out.println("Adding an employee\n" + "1. Hourly employee\n" + "2. Comission employee\n" + "3. Salary employee\n" + "4. Back");
	}

	public static void addComissionEmployee() throws ParseException
	{
		//add new comission employee
		Scanner employeeInfo = new Scanner(System.in);
		GregorianCalendar birthday = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date date;
		
		System.out.println("First Name:");
		String firstName = employeeInfo.nextLine();
		System.out.println("Last Name:");
		String lastName = employeeInfo.nextLine();
		System.out.println("Birthdate (yyyy-mm-dd):");
		date = sdf.parse(employeeInfo.nextLine());
		birthday.setTime(date);
		System.out.println("Gender (m / f):");
		String gender = employeeInfo.nextLine();
		System.out.println("SIN #:");
		int sin = employeeInfo.nextInt();
		System.out.println("Phone #:");
		double phone = employeeInfo.nextDouble();
		employeeInfo.nextLine();
		System.out.println("Street:");
		String street = employeeInfo.nextLine();
		System.out.println("City:");
		String city = employeeInfo.nextLine();
		System.out.println("Postal Code:");
		String postal = employeeInfo.nextLine();
		System.out.println("Gross sales:");
		int grossSales = employeeInfo.nextInt();
		System.out.println("Comission rate ($x.xx):");
		double comissionRate = employeeInfo.nextDouble();
		
		employees.add(new ComissionEmployee(firstName, lastName, birthday, gender, sin, phone, street, city, postal, grossSales, comissionRate));
		System.out.println("successfully added new employee\n");
	}

	public static void addHourlyEmployee() throws ParseException
	{
		// Adding an hourly employee
		Scanner employeeInfo = new Scanner(System.in);
		GregorianCalendar birthday = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date date;
		
		System.out.println("First Name:");
		String firstName = employeeInfo.nextLine();
		System.out.println("Last Name:");
		String lastName = employeeInfo.nextLine();
		System.out.println("Birthdate (yyyy-mm-dd):");
		date = sdf.parse(employeeInfo.nextLine());
		birthday.setTime(date);
		System.out.println("Gender (m / f):");
		String gender = employeeInfo.nextLine();
		System.out.println("SIN #:");
		int sin = employeeInfo.nextInt();
		System.out.println("Phone #:");
		double phone = employeeInfo.nextDouble();
		employeeInfo.nextLine();
		System.out.println("Street:");
		String street = employeeInfo.nextLine();
		System.out.println("City:");
		String city = employeeInfo.nextLine();
		System.out.println("Postal Code:");
		String postal = employeeInfo.nextLine();
		System.out.println("Hourly Rate ($x.xx):");
		double hourlyRate = employeeInfo.nextDouble();
		
		employees.add(new HourlyEmployee(firstName, lastName, birthday, gender, sin, phone, street, city, postal, hourlyRate));
		System.out.println("successfully added new employee\n");
	}

	public static void addSalaryEmployee() throws ParseException
	{
		//add new salary employee
		Scanner employeeInfo = new Scanner(System.in);
		GregorianCalendar birthday = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date date;
		
		System.out.println("First Name:");
		String firstName = employeeInfo.nextLine();
		System.out.println("Last Name:");
		String lastName = employeeInfo.nextLine();
		System.out.println("Birthdate (yyyy-mm-dd):");
		date = sdf.parse(employeeInfo.nextLine());
		birthday.setTime(date);
		System.out.println("Gender (m / f):");
		String gender = employeeInfo.nextLine();
		System.out.println("SIN #:");
		int sin = employeeInfo.nextInt();
		System.out.println("Phone #:");
		float phone = employeeInfo.nextFloat();
		employeeInfo.nextLine();
		System.out.println("Street:");
		String street = employeeInfo.nextLine();
		System.out.println("City:");
		String city = employeeInfo.nextLine();
		System.out.println("Postal Code:");
		String postal = employeeInfo.nextLine();
		System.out.println("Salary ($x.xx):");
		double salary = employeeInfo.nextDouble();
		
		employees.add(new SalaryEmployee(firstName, lastName, birthday, gender, sin, phone, street, city, postal, salary));
		System.out.println("successfully added new employee\n");

	}

	public static void addManufacturer()
	{
		// TODO Auto-generated method stub

	}

	public static void addProduct()
	{
		// TODO Auto-generated method stub

	}

}
