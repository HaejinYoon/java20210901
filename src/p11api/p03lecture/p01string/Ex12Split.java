package p11api.p03lecture.p01string;

public class Ex12Split {
	public static void main(String[] args) {
		String str = "java,spring,html,css";
		
		String[] arr = str.split(",");
		
		for ( String item : arr) {
			System.out.println(item);
		}
		
		System.out.println("======================================");
		String str2 = "java spring html  css";
		String[] arr2 =  str2.split(" ");
		
		for (String item : arr2) {
		System.out.println(item);
		}
		
		System.out.println(arr2.length);
		
		System.out.println("=====================================");
		
		String str3 = "java spring html  css";
		String[] arr3 = str3.split(" +");
		
		for (String item : arr3) {
			System.out.println(item);
		}
		System.out.println(arr3.length);
	}
}
