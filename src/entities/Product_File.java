package entities;

public class Product_File {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	public Product_File() {
	}

	public Product_File(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return price;
	}

	public void setValue(Double value) {
		this.price = value;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return price * quantity;
	}
}
