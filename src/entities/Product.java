package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {

	public String name;
	public double price;
	public int quantity;

	List<Product> list = new ArrayList<>();
	
	Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double subtotal() {
		return quantity * price;
	}

	public String toString() {
				return "Product: " + name + " - price: $"
				+ String.format("%.2f", price)
				+ "\n - subtotal: $"
				+ String.format("%.2f", subtotal()) + "\n";
	}
	
	
}
