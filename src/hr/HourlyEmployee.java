package hr;

import java.util.GregorianCalendar;

public class HourlyEmployee extends Employee
{
	private double hourlyRate;
	private int hoursPerWeek;
	
	public HourlyEmployee(String firstName, String lastName, GregorianCalendar dateOfBirth, String gender, int sin, double phone, String street, String city, String postal, double hourlyRate, int hoursPerWeek)
	{
		super(firstName, lastName, dateOfBirth, gender, sin, phone, street, city, postal);
		this.hourlyRate = hourlyRate;
		this.hoursPerWeek = hoursPerWeek;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	
	/**
	 * Returns the employees information including pay.
	 */
	@Override
	public String toString(){
		return super.toString() + 
				"Hourly employee\n"
				+ "$" + calculatePay() + " bi-weekly";
	}

	/**
	 * calculates the bi-weekly earnings of an employee.
	 */
	@Override
	public double calculatePay()
	{
		return (hourlyRate * hoursPerWeek) * 2;
	}

}
