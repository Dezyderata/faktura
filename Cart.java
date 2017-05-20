//package pl.edu.pjatk.poj.java.markt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cart {

	private List<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public Product findCheapest() {
		if (products.isEmpty()) {
			return null;
		}
		Product cheapest = products.get(0);
		for (Product product : products) {
			if (product.getPrice() < cheapest.getPrice()) {
				cheapest = product;
			}	
		}
		return cheapest;
	}
	
	public List<Product> findNCheapest(int n) {
		List<Product> productsCopy = new ArrayList<>(products);
		sortProducts(productsCopy);
		if (productsCopy.size() < n) {
			return productsCopy;
		}
		List<Product> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			result.add(productsCopy.get(i));
		}
		return result;
	}
	
	public List<Product> findNMostExpensive(int n) {
		List<Product> productsCopy = new ArrayList<>(products);
		sortProducts(productsCopy);
		Collections.reverse(productsCopy);
		if (productsCopy.size() < n) {
			return productsCopy;
		}
		List<Product> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			result.add(productsCopy.get(i));
		}
		return result;
	}
	
	public Product findMostExpensive() {
		if (products.isEmpty()) {
			return null;
		}
		Product mostExpensive = products.get(0);
		for (Product product : products) {
			if (product.getPrice() > mostExpensive.getPrice()) {
				mostExpensive = product;
			}
		}
		return mostExpensive;
	}
	
	public double totalPrice() {
		double totalPrice = 0;
		for (Product product : products) {
			totalPrice += product.getPrice()*product.getQuantity();
		}
		return totalPrice;
	}
	
	public double totalPriceAfterDiscount() {
		double totalPriceAfterDiscount = 0;
		for (Product product : products) {
			totalPriceAfterDiscount += product.getDiscountPrice()*product.getQuantity();
		}
		return totalPriceAfterDiscount;
	}
	
	public void printCart() {
		System.out.println("===================C A R T=================");
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.printf("Total price: %.2f \n", totalPrice());
		System.out.printf("Total price after discount: %.2f \n", totalPriceAfterDiscount());
		System.out.println("===========================================");
	}
	
	public void sortProducts() {
		sortProducts(products);
	}
	
	public boolean canApply300Plus() {
		return totalPrice() > 300;
	}
	
	public void apply300Plus() {
		if (canApply300Plus()) {
			for (Product product : products) {
				product.setDiscountPrice(product.getPrice() * 0.95);
				product.setPriceTotal(product.getDiscountPrice()*product.getQuantity());
			}
		}
	}
	
	private void sortProducts(List<Product> productsToSort) {
		Collections.sort(productsToSort, new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				if (p1.getPrice() == p2.getPrice()) {
					return p1.getName().compareTo(p2.getName());
				} else if (p1.getPrice() - p2.getPrice() < 0) {
					return -1;
				} else {
					return 1;
				}
			}
			
		});
		
		//Collections.sort(products, new ProductComparator());
	}
}
