package hr;

import java.util.GregorianCalendar;

public class HourlyEmployee extends Employee
{
	private double hourlyRate;
	
	public HourlyEmployee(String firstName, String lastName, GregorianCalendar dateOfBirth, String gender, int sin, double phone, String street, String city, String postal, double hourlyRate)
	{
		super(firstName, lastName, dateOfBirth, gender, sin, phone, street, city, postal);
		this.hourlyRate = hourlyRate;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public String toString(){
		return super.toString() + 
				"Hourly employee at $" + hourlyRate + "/hr";
	}

}
