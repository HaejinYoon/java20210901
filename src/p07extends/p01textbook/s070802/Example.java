package p07extends.p01textbook.s070802;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Phone p1 = new Phone();
		Phone p2 = new Telephone();
		Phone p3 = new SmartPhone();
		
		p2.turnOn();
		//p2.autoAnswering();
		
		
		p3.turnOn();
		//p3.internetSearch();
		
		//p2변수의 값을 이용하여 autoAnswering 실행
		//p3변수의 값을 이용하여 internetSearch 실행
		System.out.println("------------------------------------");
		SmartPhone p4 = new SmartPhone();
		p4.internetSearch();
		
		Telephone t1 = (Telephone)p2;
		SmartPhone s1 = (SmartPhone)p3;
		
		t1.autoAnswering();
		s1.internetSearch();
		
		System.out.println("----------------------------");
		((Telephone) p2).autoAnswering();
		((SmartPhone)p3).internetSearch();
		
		
	}

}
