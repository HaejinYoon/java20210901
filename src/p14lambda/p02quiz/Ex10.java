package p14lambda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Ex10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("java", "spring", "html", "a", "", "css"));
		
		//list.replaceAll
		list.replaceAll(new UnaryOperator<String>() {
			@Override
			public String apply(String s) {
				if(s.length()<3) {
					return s;
				}
				return s.substring(s.length()-2);
			}
		});
//		list.replaceAll(i -> i.substring(i.length()-2,i.length()));
		
		
		System.out.println(list); //[va, ng, ml, a, , ss]
	}
}
