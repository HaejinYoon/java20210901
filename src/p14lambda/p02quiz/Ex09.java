package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex09 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		// ArrayList.replaceAll
		
		list.replaceAll(i->2*i);
		
		
		System.out.println(list);//[2, 4, 6, 8]
	}
}
