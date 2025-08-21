package practiceQuestions;

public class Product {
        int productId;
        String productName;
        String quality;
        int quantity;
        String mdate;
        String exdate;
        float price;
        
        
		public Product(int productId, String productName, String quality, int quantity, String mdate, String exdate,float price) {
			
			this.productId = productId;
			this.productName = productName;
			this.quality = quality;
			this.quantity = quantity;
			this.mdate = mdate;
			this.exdate = exdate;
			this.price = price;
			
		}

		public Product() {
			
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getQuality() {
			return quality;
		}

		public void setQuality(String quality) {
			this.quality = quality;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public String getMdate() {
			return mdate;
		}

		public void setMdate(String mdate) {
			this.mdate = mdate;
		}

		public String getExdate() {
			return exdate;
		}

		public void setExdate(String exdate) {
			this.exdate = exdate;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "productId=" + productId + "  productName=" + productName + "  quality=" + quality
					+ "  quantity=" + quantity + "  mdate=" + mdate + "  exdate=" + exdate + "  price=" + price;
		}
        
   
        
//      public static void main(String[] args) {
//		
//    	 //Create 10 object and initialize it 
//    	  Product p1 = new Product();
//    	    p1.productId= 101;
//    	    p1.productName= "T-Shirt";
//    	    p1.productColor="Black";
//    	    p1.size="M";
//    	    p1.quantity=1;
//    	    p1.price=500f;
//    	    
//    	    Product p2 = new Product();
//    	    p2.productId= 102;
//    	    p2.productName= "Jeans";
//    	    p2.productColor="Grey";
//    	    p2.size="L";
//    	    p2.quantity=3;
//    	    p2.price=900f;
//    	    
//    	    Product p3 = new Product();
//    	    p3.productId= 103;
//    	    p3.productName= "Kurta";
//    	    p3.productColor="Yellow";
//    	    p3.size="XL";
//    	    p3.quantity=2;
//    	    p3.price=600f;
//    	    
//    	    Product p4 = new Product();
//    	    p4.productId= 104;
//    	    p4.productName= "Paijama";
//    	    p4.productColor="White";
//    	    p4.size="L";
//    	    p4.quantity=2;
//    	    p4.price=750f;
//    	    
//    	    Product p5 = new Product();
//    	    p5.productId= 105;
//    	    p5.productName= "Shoes";
//    	    p5.productColor="Black";
//    	    p5.size="9";
//    	    p5.quantity=1;
//    	    p5.price=1100f;
//    	    
//    	    Product p6 = new Product();
//    	    p6.productId= 106;
//    	    p6.productName= "Smart-Watch";
//    	    p6.productColor="Green";
//    	    p6.size="40mm";
//    	    p6.quantity=3;
//    	    p6.price=1500f;
//    	    
//    	    Product p7 = new Product();
//    	    p7.productId= 107;
//    	    p7.productName= "Girls T-shirt";
//    	    p7.productColor="White";
//    	    p7.size="L";
//    	    p7.quantity=1;
//    	    p7.price=700f;
//    	    
//    	    Product p8 = new Product();
//    	    p8.productId= 108;
//    	    p8.productName= "Sandal";
//    	    p8.productColor="Blue";
//    	    p8.size="8";
//    	    p8.quantity=1;
//    	    p8.price=800f;
//    	    
//    	    Product p9 = new Product();
//    	    p9.productId= 109;
//    	    p9.productName= "Girl's Top";
//    	    p9.productColor="Pink";
//    	    p9.size="L";
//    	    p9.quantity=2;
//    	    p9.price=500f;
//    	    
//    	    Product p10 = new Product();
//    	    p10.productId= 1010;
//    	    p10.productName= "Bracelate";
//    	    p10.productColor="Silver";
//    	    p10.size="45mm";
//    	    p10.quantity=1;
//    	    p10.price=850f;
//    	    
//    	   
//    	//Printing then values in the object through another class display() method 
//    	    ProductDisplay d = new ProductDisplay();
//    	    
//    	         d.display(p1);
//    	         d.display(p2);
//    	         d.display(p3);
//    	         d.display(p4);
//    	         d.display(p5);
//    	         d.display(p6);
//    	         d.display(p7);
//    	         d.display(p8);
//    	         d.display(p9);
//    	         d.display(p10);
//    	   
//	}
        
        
}
