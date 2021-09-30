package p18io.p02quiz;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\Haejin\\Desktop\\iotest\\outtestD.txt";
		
		// 사용자로부터 입력 받은 내용을 파일에 작성하기
		
		Scanner scan = new Scanner(System.in);
		Writer wr = new FileWriter(name);
		
		boolean run = true;
		while(run) {
			System.out.print("입력> ");
			String str=scan.nextLine();
			if(str.equals("exit")||str.equals("종료")) {
				break;
			}
			wr.write(str);
			wr.write("\n");
			wr.flush();
		}
		
		System.out.println("Done");
		scan.close();
		wr.close();
	}
}
