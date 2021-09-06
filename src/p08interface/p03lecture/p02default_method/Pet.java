package p08interface.p03lecture.p02default_method;

public interface Pet {

	void sit();
	
	public default void roll() { // 항상 public
		System.out.println("구릅니다.");
	}
}
