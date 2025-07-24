package Day3.Constructor;

public class Customer {
	private String name, city;
	private int id;
	Customer(){
		
	}
	Customer(String name, int id, String city){
		this.name=name;
		this.id=id;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
