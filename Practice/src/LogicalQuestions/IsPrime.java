package LogicalQuestions;
import java.util.*;

public class IsPrime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check prime ");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}
		
	}
	
	public static boolean isPrime(int num) {
		if(num == 1)
			return false;
		
		for(int i = 2; i<num; i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}

}
