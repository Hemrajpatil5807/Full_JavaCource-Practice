package practiceQuestions;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		try {
			
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			
//			e.printStackTrace ();//class name, description, location 
			System.out.println (e.toString ());//class name, description 
//			System.out.println (e.getMessage ());//description
		}
		
        try{  
        	
            int a[]=new int[5]; 
            
            a[5]=30/2;    // we dont no user is divide the number with 0 or other 
                                
            System.out.println(a[10]);  
            
           }    
           catch(ArithmeticException e){
        	   
   			e.printStackTrace ();//class name, description, location 
               
              }    
           catch(ArrayIndexOutOfBoundsException e){
        	   
   			e.printStackTrace ();//class name, description, location 
               
              }    
           catch(Exception e){  
        	   
    		e.printStackTrace ();//class name, description, location 
               
              }    
        
           System.out.println("rest of the code");  
		
	}

}

