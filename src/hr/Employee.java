package hr;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Employee
{
	private String firstName, lastName, gender, street, city, postal;
	int sin;
	double phone;
	GregorianCalendar dateOfBirth;

	public Employee(String firstName, String lastName, GregorianCalendar dateOfBirth, String gender, int sin, double phone, String street, String city, String postal)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.sin = sin;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.postal = postal;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getPostal()
	{
		return postal;
	}

	public void setPostal(String postal)
	{
		this.postal = postal;
	}

	public double getPhone()
	{
		return phone;
	}

	public void setPhone(double phone)
	{
		this.phone = phone;
	}

	public int getSin()
	{
		return sin;
	}

	public GregorianCalendar getDateOfBirth()
	{
		return dateOfBirth;
	}

	@Override
	public String toString()
	{
		return firstName + " " + lastName + "\n";
	}
	
	public abstract double calculatePay();

}
