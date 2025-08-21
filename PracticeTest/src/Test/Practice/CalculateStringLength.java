package Test.Practice;

public class CalculateStringLength {

	public static int calculateLength(String str) {
		int length=0;
		
		for(int i = 0;i<str.lastIndexOf("");i++) {
			length++;
		}
		
		return length;
	}
	
	public static void main(String[] args) {
		
		String str = "Hello how are you shyam?";
		
		int length = calculateLength(str);
		
		System.out.println(length);
	}
}
