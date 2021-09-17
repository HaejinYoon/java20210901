package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		
		boolean run = true;
		while(run) {
			System.out.print("l:list, e:exit, r:remove 입력>");
			String s = scan.next();
			if(s.equals("l")) {
				for(int i=0;i<arr.size();i++) {
					System.out.println(arr.get(i));
				}
			} else if(s.equals("e")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(s.equals("r")) {
				//if(arr.size()>0) {
				if(!arr.isEmpty()) {
					System.out.println(arr.get(arr.size()-1)+" 정상적으로 삭제되었습니다");
					arr.remove(arr.size()-1);
				}else {
					System.out.println("아직 아무것도 없습니다");
				}
				
			}
			else {
				arr.add(s);		
				System.out.println("정상적으로 추가되었습니다.");
			}
		}
		scan.close();
	}
}
