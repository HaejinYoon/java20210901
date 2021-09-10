package p11api.p03lecture.p01string;

public class Ex10Replace {
	public static void main(String[] args) {
		//replace
		String s1 = "java spring";
		String r1 = s1.replace('a','z');
		
		System.out.println(s1);
		System.out.println(r1);
		
		String s2 = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다.";
		
		String r2 = s2.replace("공장", "factory");
		
		System.out.println(s2);
		System.out.println(r2);
		
		
	}
}
