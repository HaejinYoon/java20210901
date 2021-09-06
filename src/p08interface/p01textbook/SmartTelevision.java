package p08interface.p01textbook;

public class SmartTelevision implements RemoteControl, Searchable{

	public void search(String url) {
		System.out.println(url + "를 검색합니다.");
		
	} 
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	
	

}
