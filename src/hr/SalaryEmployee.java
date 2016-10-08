package hr;

import java.util.GregorianCalendar;

public class SalaryEmployee extends Employee
{
	private double salary;

	public SalaryEmployee(String firstName, String lastName, GregorianCalendar dateOfBirth, String gender, int sin, double phone, String street, String city, String postal, double salary)
	{
		super(firstName, lastName, dateOfBirth, gender, sin, phone, street, city, postal);
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		return super.toString() + 
				"Salary Employee\n" +
				"Salary: \t\t" + salary;
	}

}
