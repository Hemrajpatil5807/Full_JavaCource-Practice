package LogicalQuestions;
import java.util.*;

public class VowelCheck {   // to check vowel in string
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		if(isVowel(str)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
     
	public static boolean isVowel(String str) {
		int i = 0;
		while(i<str.length()) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				return true;
			}
			i++;
		}
		return false;
	}
	
}
