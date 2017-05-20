//package pl.edu.pjatk.poj.java.markt;

import java.util.List;

public class CartTest {
	
	public static void main(String[] args) {
		
		Product product1 = new Product("001", "Truskawki", 250.0, 2);
		Product product2 = new Product("002", "Maliny", 120.99, 2);
		Poduct product3 = new Product("003", "Zimniok", 10.0, 15);
		
		Cart cart1 = new Cart();
		cart1.addProduct(product1);
		cart1.addProduct(product2);
		cart1.addProduct(product3);
		
		Product cheapest = cart1.findCheapest();
		System.out.println("Cheapest product: " + cheapest);
		Product mostExpensive = cart1.findMostExpensive();
		System.out.println("Most productsexpensive product: " + mostExpensive);
		
		cart1.sortProducts();
		
		System.out.println("Two cheapest products: ");
		List<Product> twoCheapest = cart1.findNCheapest(2);
		for (Product p : twoCheapest) {
			System.out.println(p);
		}
		
		cart1.apply300Plus();
		cart1.printCart();

		Customer customer1 = new Customer("Cyryl", "ul. Mila, 78-987 Koszalin", "1234567890","11112222333344445555666677");
		customer1.printCustomer();
		Vendor vendor1 = new Vendor("Saliki.com", "ul. Buraczana 13, 13-209 Osteoporoza", "0987654321", "77666655554444333322221111");
		vendor1.printVendor();
	}

}
