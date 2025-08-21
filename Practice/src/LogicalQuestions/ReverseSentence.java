package LogicalQuestions;
import java.util.*;

public class ReverseSentence {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Sentence");
		String str = sc.nextLine();
		
		System.out.println(reverseWord(str));
	}

	public static String reverseWord(String s) {
		String [] arr = s.split(" ");
		String [] newArr = new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			String reverse = " ";
			for(int j=0;j<arr[i].length();j++) {
				
				reverse = arr[i].charAt(j)+reverse;
				
			}
			newArr[i]=reverse;
		}
		String news =String.join(" ", newArr);
		return news;
	}
}
