package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		
		boolean run = true;
		while(run) {
			System.out.print("l:list, e:exit 입력>");
			String s = scan.next();
			if(s.equals("l")) {
				for(int i=0;i<arr.size();i++) {
					System.out.println(arr.get(i));
				}
			} else if(s.equals("e")) {
				break;
			} else {
				arr.add(s);				
			}
		}
		scan.close();
	}
}
