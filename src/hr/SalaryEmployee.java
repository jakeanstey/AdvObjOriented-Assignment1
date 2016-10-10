package hr;

import java.util.GregorianCalendar;

public class SalaryEmployee extends Employee
{
	private double salary;

	public SalaryEmployee(String firstName, String lastName, GregorianCalendar dateOfBirth, String gender, int sin, double phone, String street, String city, String postal, double salary)
	{
		super(firstName, lastName, dateOfBirth, gender, sin, phone, street, city, postal);
		this.salary = salary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	/**
	 * Returns the employees information including pay.
	 */
	@Override
	public String toString(){
		return super.toString() + 
				"Salary Employee\n" +
				"Salary: \t" + salary;
	}

	/**
	 * calculates the bi-weekly pay of the salary employee.
	 */
	@Override
	public double calculatePay()
	{
		return salary / 26;
	}

}
