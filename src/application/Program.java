package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();		
		
		System.out.print("How many products will be registed? ");
		int n = input.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + ":");
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Price: ");
			double price = input.nextDouble();
			System.out.print("Quantity: ");
			int quantity = input.nextInt();
			list.add(new Product(name, price, quantity));
		}		
		System.out.println("-----PRODUCTS LIST-----");
		list.forEach(System.out::print);
		
		input.close();
	}

}
