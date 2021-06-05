package entities;

public class Product_Exercicie {

	private String name;
	private Double price;
	
	public Product_Exercicie() {
	}

	public Product_Exercicie(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return name
				+ " $ " 
				+ String.format("%.2f", price);
	}
}
