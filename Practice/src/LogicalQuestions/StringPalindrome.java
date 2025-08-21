package LogicalQuestions;
import java.util.*;

public class StringPalindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		
		if(isPalindrome(s)) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Is not Palindrome");
		}
		
	}
	
	public static boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length()-1;
		
		char[] a = s.toCharArray();
		
		while(start < end) {
			if(a[start] != a[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
