package ThreadP;

import java.util.ArrayList;
import java.util.List;

public class ThreadLern {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(31);
		list.add(21);
		list.add(3333);
		list.add(4);
		list.add(675);
		
		list.forEach(System.out::println);
		list.sort((x,y) -> -x.compareTo(y));
		System.out.println();
		System.out.println("sorted in assending");
		list.forEach(x -> System.out.println(x));
	}
}
