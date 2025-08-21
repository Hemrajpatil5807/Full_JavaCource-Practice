package practiceQuestions;

public class ProductDisplay {

	public void display(Product t) {
		
		System.out.println("ID : "+t.productId);
		System.out.println("Name : "+t.productName);
		System.out.println("Quantity : "+t.quantity);
		System.out.println("Price : "+t.price);
		System.out.println("Total Price : "+t.price*t.quantity);
		
		System.out.println("--------------------------");
		
	}
	
}

