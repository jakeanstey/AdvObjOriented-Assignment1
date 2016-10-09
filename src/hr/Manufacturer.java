package hr;

public class Manufacturer {
	private String name, street, city, postal;
	private int id;

	public Manufacturer(String name, String street, String city, String postal) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.postal = postal;
		id++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}
	
	public int getID(){
		return id;
	}
	
	public String toString(){
		return name + "\n"
				+ "ID: " + id + "\n\t - "
				+ street + "\n\t - "
				+ city + "\n\t - "
				+ postal;
	}

}
