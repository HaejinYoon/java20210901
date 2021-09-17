package p15collection.p03lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Set<Integer> set;
		//set = new Set<>(); // interface여서 instance를 만들 수 없음
		set = new HashSet<>();
		
		set.add(3);
		set.add(33);
		set.add(6);
		
		int size = set.size();
		System.out.println(size);
		
		set.add(33);
		
		System.out.println(set.size());//사이즈 그대로, 중복된 값은 저장하지 않아서
		
		/*index로 아이템 접근 불가
		for(int i=0;i<set.size();i++) {
			set.get(i);
		}
		*/
		System.out.println("--------item browse--------");
		for( int item:set) {
			System.out.println(item);
		}
		
		System.out.println("--------item search--------");
		boolean b= set.contains(3);
		System.out.println(b);
		System.out.println(set.contains(5));
		
		System.out.println("--------item delete--------");
		set.remove(3);
		System.out.println(set.size());
		set.remove(5);
		System.out.println(set.size());
		
		
	}
}
