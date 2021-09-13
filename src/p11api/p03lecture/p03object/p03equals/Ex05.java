package p11api.p03lecture.p03object.p03equals;

import java.util.HashSet;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {
		Person p1 =new Person("3", "son");
		Person p2 = new Person("13", "ji");
		Person p3 = new Person("3", "son");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	
		System.out.println(p1==p3);
		System.out.println(p1.equals(p3));
		
		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set.size());
	}
}

class Person {
	private String id;
	private String name;
	
	
	
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}