package p10exception.p03lecture.p06throws;

public class Example3ClassNotFoundException {
	public static void main(String[] args) {
		try {
			Class.forName("aaaa");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
