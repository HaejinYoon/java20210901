package p18io.p02quiz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		String src = "C:\\Users\\Haejin\\Desktop\\iotest\\outtest9.txt";
		String des = "C:\\Users\\Haejin\\Desktop\\iotest\\outtestB.txt";
		// 4칸씩 뒤집어서 쓰기
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);
		
		char[] datas = new char[4];
		int cnt = 0;
		
		while(rd.read(datas)!=-1) {
			// revers datas
			reverse(datas);
			wr.write(datas);
		}
		rd.close();
		wr.close();
		
		System.out.println("Program closed");
	}

	private static void reverse(char[] datas) {
		int left = 0;
		int right = datas.length-1;
		
		while(left < right) {
			char c = datas[left];
			datas[left] = datas[right];
			datas[right] = c;
			
			left++;
			right--;
					
		}
	}
}
