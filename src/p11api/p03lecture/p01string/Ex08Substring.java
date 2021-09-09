package p11api.p03lecture.p01string;

public class Ex08Substring {
	public static void main(String[] args) {
		// substring
		//           1234567890
		String s1 = "javascript";
		
		String sub1 = s1.substring(4); //4번 인덱스부터 끝까지 부분 문자열 리턴
		
		System.out.println(sub1);
		
		String sub2 = s1.substring(0, 4); //0번 인덱스부터 3번 인덱스까지 부분 문자열 리턴
		
	}
}
