package practiceQuestions;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		System.out.println("Enter a First Number \n");
//		int a = in.nextInt();
//		
//		System.out.println("Enter the Second Number \n");
//		int b = in.nextInt();
		
		System.out.println("Enter a String \n");
		String s = in.nextLine();
		
		
			
			try {
				if(s=="") {
//				throw new MyException("Please does not Enter the Second as 0/zero ");
				throw new MyException("Do not Enter a empty String");
				}else {
//					int c = a/b;
//					System.out.println("C = "+c);
					System.out.println("That String you Entered = "+ s);
					
				}
			}catch(MyException e) {
				
				System.out.println(e.getMessage());
				
			}
			
		
		
		
	}
	
}
