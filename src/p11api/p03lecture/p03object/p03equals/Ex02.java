package p11api.p03lecture.p03object.p03equals;

public class Ex02 {
	public static void main(String[] args) {
		Book b1 = new Book("자바다", "신");
		Book b2 = new Book("python", "son");
		Book b3 = new Book("python", "son");
				
		System.out.println(b1==b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1.equals(b2));
		
		System.out.println("==========================");
		
		System.out.println(b2==b3);
		System.out.println(b2.hashCode());//같은값
		System.out.println(b3.hashCode());//같은값
		System.out.println(b2.equals(b3));//true
	}
}
class Book {
	private String title;
	private String writer;
	
	Book(String title, String writer){
		this.title=title;
		this.writer=writer;
	}

	public int hashCode() {
		return title.hashCode()+writer.hashCode();//field title과, field writer가 같으면 같은 hashcode 생성.
	}
	
	@Override
	public boolean equals(Object obj) {
		Book otherBook = (Book)obj;
		return title.equals(otherBook.title)&&writer.equals(otherBook.writer);
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + "]";
	}
	
	
}