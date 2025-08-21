package Lambda;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) { 
		
		Function<Integer,Integer> f = i->i*i;
		
		System.out.println("4*4 = "+f.apply(4));
		System.out.println("55="+f.apply(5));
	}
}
