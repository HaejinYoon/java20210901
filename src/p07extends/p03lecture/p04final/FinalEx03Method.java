package p07extends.p03lecture.p04final;

public class FinalEx03Method {
	
}

class Car{
	//final 메서드는 재정의 불가
	public final void start() {
		System.out.println("출발!!");
	}
}

//class Tesla extends Car{
//	public void start() {
//		System.out.println("테슬라 출발!!");
//	}
//}