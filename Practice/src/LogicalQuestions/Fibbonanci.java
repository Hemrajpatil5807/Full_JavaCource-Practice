package LogicalQuestions;

import java.util.Arrays;

public class Fibbonanci {
	
	public static void main(String[] args) {
		int num = 2;
		
		int a = 0;
		int b = 1;
		int[] arr = new int[num];
		 arr[0]=a;
		 arr[1]=b;
		
		for(int i=2;i<num;i++) {
			int c = a+b;
			a=b;
			b=c;
			arr[i]=c;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
