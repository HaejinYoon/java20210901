package p11api.p02quiz;

public class Ex02IndexOf {
	public static void main(String[] args) {
		String str = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다.";
		//			  0 1 2 34 5 67 8 9 0 123
		// "공장"이 있는 index들을 출력
		
		boolean run = true;
		
		int i = str.indexOf("공장");
	
		System.out.println(i);
		
		while(run) {
			i=str.indexOf("공장", i+1);
			if(i<0) {
				break;
			}
			System.out.println(i);
		}
	}
}
