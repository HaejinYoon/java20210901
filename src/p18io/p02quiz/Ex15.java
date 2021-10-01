package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) throws Exception{
		OutputStream os = getOutputStream("C:\\Users\\Haejin\\Desktop\\iotest\\OuttestI.txt");
		Writer writer = new OutputStreamWriter(os);
		Scanner scanner = new Scanner(System.in);
		
		String input = null;
		boolean run = true;
		while(run) {
			System.out.print("입력> ");
			input = scanner.nextLine();
			if(input.equals("exit")||input.equals("종료")) {
				break;
			}
			
			writer.write(input);
			writer.write('\n');
			// input을 outtestI.txt 파일에 쓰기
			// exit을 입력 받으면 loop종료
			
		}
		
		System.out.println("종료");
		scanner.close();
		writer.close();
		os.close();
		
	}
	
	public static OutputStream getOutputStream(String file) throws Exception {
		return new FileOutputStream(file);
	}
}
