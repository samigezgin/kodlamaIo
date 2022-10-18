package kodlama.io.entities;

public class Course {
	
	private int id ;
	private String name;
	private double unitPrice;
	private String category;
	
	
	public Course() {
	
	}
	
	public Course(int id, String name, double unitPrice,String category) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.category=category;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
