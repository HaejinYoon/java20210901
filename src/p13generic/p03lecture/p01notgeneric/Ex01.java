package p13generic.p03lecture.p01notgeneric;

public class Ex01 {
	public static void main(String[] args) {
		Box b1 = new Box();
		
		b1.setItem("java");
		String s = (String)b1.getItem();
		
		System.out.println("아이템 길이 : "+ s.length());
		
		b1.setItem(3);//integer로 auto boxing되고 object로 변환
		int a = (int)b1.getItem();
		System.out.println("아이템 값:"+a);
		
		b1.setItem("html");
		
		Integer j = (Integer)b1.getItem();// classCastException occurs
		
		
	}
}

class Box {
	private Object item;
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return item;
	}
}