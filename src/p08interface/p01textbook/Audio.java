package p08interface.p01textbook;

public class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
}
