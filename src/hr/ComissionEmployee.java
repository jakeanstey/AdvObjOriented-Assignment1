package hr;

import java.util.GregorianCalendar;

public class ComissionEmployee extends Employee
{
	private double grossSales, comissionRate;

	public ComissionEmployee(String firstName, String lastName, GregorianCalendar dateOfBirth, String gender, int sin, double phone, String street, String city, String postal, double grossSales, double comissionRate)
	{
		super(firstName, lastName, dateOfBirth, gender, sin, phone, street, city, postal);
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}

	public double getGrossSales()
	{
		return grossSales;
	}

	public void setGrossSales(double grossSales)
	{
		this.grossSales = grossSales;
	}

	public double getComissionRate()
	{
		return comissionRate;
	}

	public void setComissionRate(double comissionRate)
	{
		this.comissionRate = comissionRate;
	}

	/**
	 * Returns the employees information including pay.
	 */
	@Override
	public String toString()
	{
		return super.toString() + 
				"Comission employee \n"
				+ "Gross sales: \t" + grossSales
				+ "Comission rate: \t" + comissionRate;
	}

	/**
	 * calculates the pay of a commissioned employee.
	 */
	@Override
	public double calculatePay()
	{
		return comissionRate * grossSales;
	}

}
