package p11api.p02quiz;



public class Ex10toString {
	public static void main(String[] args) {
		Car car1 = new Car("kia", 10000);
		
		System.out.println(car1.toString());
		
		Car car2 = new Car("tesla", 15000);
		
		System.out.println(car2.toString());
		
		car1.setPrice(20000);
		
		System.out.println(car1.toString());
		
		/*출력결과
		 * 회사:kia, 가격:10000원
		 * 회사:tesla, 가격:15000원
		 * 회사:kia, 가격:20000원
		 */
		
	}
}
