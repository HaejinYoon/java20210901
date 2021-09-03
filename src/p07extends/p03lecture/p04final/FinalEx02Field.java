package p07extends.p03lecture.p04final;

public class FinalEx02Field {
	public static void main(String[] args) {
		Person p1 = new Person();
		//p1.setId(333);
		System.out.println(p1.getId());
		
		Person p2 = new Person(99);
		System.out.println(p2.getId());
		Person p3 = new Person("888");
		System.out.println(p3.getId());
	}
}


class Person {
final private int id;

public Person() {
	this.id = 3;
}

public Person(int id) {
	this.id = id;
}

public Person(String id) {
	this.id = Integer.parseInt(id);
}
	
//		this.id = id;
//		public void setId(int id) {
//	}
	
	public int getId() {
		return id;
	}
}