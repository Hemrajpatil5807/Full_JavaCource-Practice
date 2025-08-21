package Test.Practice;

import java.util.HashSet;

public class Product {
    private String name;    //Always variables shoud be private
	private int price;
	private int quantity;
	
	public Product(String name, int price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		HashSet <Product> h = new HashSet();
		
		             h.add(new Product("Laptop",76000,6));
		             h.add(new Product("Desktop",60000,9));
		             h.add(new Product("MacBook",106000,5));
		             h.add(new Product("Projector",6000,6));
		             h.add(new Product("Pc",79000,3));
		             
		  for(Product p:h) {
			  System.out.println(p.getName()+" "+p.getPrice()+" "+p.getQuantity());
		  }
	}

}
