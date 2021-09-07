package p08interface.p01textbook.s080302;

import p08interface.p01textbook.RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
//		rc = new RemoteControl(); //x
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				
			}

			@Override
			public void turnOff() {
				
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};

	}

}
