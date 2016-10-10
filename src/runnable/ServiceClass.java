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
import hr.Manufacturer;
import hr.Product;
import hr.SalaryEmployee;

public class ServiceClass
{
	public static String choice = "main";
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	public static ArrayList<Manufacturer> companies = new ArrayList<Manufacturer>();
	public static ArrayList<Product> products = new ArrayList<Product>();

	public static void getInitialMessage()
	{
		System.out.println("Welcome to Georgian!\n" 
				+ "Please select an option (number)\n" 
				+ "1. Add Employee\n" 
				+ "2. List Employees\n"
				+ "3. Search Employees" 
				+ "4. Add Manufacturer\n" 
				+ "5. List Manufacturers\n"
				+ "6. Add Product\n"
				+ "7. List Products\n" 
				+ "8. Exit");
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
				choice = "listEmployees";
			} else if (selection == 3)
			{
				choice = "seacrchEmployees";
			} else if (selection == 4)
			{
				choice = "addManufacturer";
			} else if (selection == 5)
			{
				choice = "listManufacturers";
			}else if(selection == 6){
				choice = "addProduct";
			}else if(selection == 7){
				choice = "listProducts";
			}else if(selection == 8){
				choice = "exit";
			}
			else
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
		} else
		{

		}
	}

	public static Manufacturer getManufacturerByID(int id)
	{
		for (Manufacturer manufacturer : companies)
		{
			if (manufacturer.getID() == id)
			{
				return manufacturer;
			}
		}
		System.out.println("Invalid manufacturer ID, setting to default.");
		return companies.get(0);
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

	public static void listEmployees()
	{
		for (Employee employee : employees)
		{
			System.out.println(employee.toString() + "\n");
		}

	}

	public static void listManufacturers()
	{
		for (Manufacturer manufacturer : companies)
		{
			System.out.println(manufacturer.toString() + "\n");
		}
	}

	public static void listProducts()
	{
		for (Product product : products)
		{
			System.out.println(product.toString() + "\n");
		}
	}

	public static void addEmployee()
	{
		// TODO Auto-generated method stub
		System.out.println("Adding an employee\n" + "1. Hourly employee\n" + "2. Comission employee\n" + "3. Salary employee\n" + "4. Back");
	}

	public static void addComissionEmployee() throws ParseException
	{
		// add new comission employee
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
		// add new salary employee
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
		Scanner manufacturerInfo = new Scanner(System.in);

		System.out.println("Company name: ");
		String companyName = manufacturerInfo.nextLine();
		System.out.println("Street: ");
		String companyStreet = manufacturerInfo.nextLine();
		System.out.println("City: ");
		String companyCity = manufacturerInfo.nextLine();
		System.out.println("Postal code: ");
		String companyPostal = manufacturerInfo.nextLine();

		companies.add(new Manufacturer(companyName, companyStreet, companyCity, companyPostal));
		System.out.println("Successfully added new Manufacturer\n");
		choice = "main";
		getInitialMessage();
	}

	public static void addProduct()
	{
		Scanner productInfo = new Scanner(System.in);
		System.out.println("Product name: ");
		String productName = productInfo.nextLine();
		System.out.println("Price ($x.xx)");
		double productPrice = productInfo.nextDouble();
		System.out.println("SKU #: ");
		int productSKU = productInfo.nextInt();
		for (Manufacturer manufacturer : companies)
		{
			System.out.println(manufacturer.toString() + "\n");
		}
		System.out.println("Enter ID of manufacturer of product");
		Manufacturer productManufacturer = getManufacturerByID(productInfo.nextInt());

		products.add(new Product(productName, productPrice, productSKU, productManufacturer));
		System.out.println("Successfully added a new product\n");
		choice = "main";
		getInitialMessage();
	}

}
