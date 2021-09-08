package p10exception.p01textbook.exercise.p07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws Exception{
	
		if(!id.equals("blue")) {
			//System.out.println("아이디가 존재하지 않습니다");
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
	
		if(!password.equals("12345"));{
			//System.out.println("패스워드가 틀립니다.");
			throw new NotExistIDException("패스워드가 틀립니다.");
			
		}
	}
}
