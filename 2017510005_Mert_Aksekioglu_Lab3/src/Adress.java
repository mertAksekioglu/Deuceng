
public class Adress {
	
	private String street_name;
	private String town;
	private String city;
	
	public Adress(String street_name, String town, String city) {
		this.street_name = street_name;
		this.town = town;
		this.city = city;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Adress [street_name=" + street_name + ", town=" + town + ", city=" + city + "]";
	}
	
	
}
