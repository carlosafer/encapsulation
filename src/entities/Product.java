package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String name;
	private double price;
	private int quantity;

	List<Product> list = new ArrayList<>();
	
	Product() {
	}

	public Product(String name, double price, int quantity) {
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

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double subtotal() {
		return quantity * price;
	}

	public String toString() {
				return "Product: " + getName() + " - price: $"
				+ String.format("%.2f", getPrice())
				+ "\nSubtotal: $"
				+ String.format("%.2f", subtotal()) + "\n";
	}
	
}
