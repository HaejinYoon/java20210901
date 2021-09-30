package p18io.p02quiz;

import java.io.FileReader;

public class Ex08 {
	public String split(int num) throws Exception {
		String file = "C:\\Users\\Haejin\\Desktop\\iotest\\test4.txt";
		FileReader fr = new FileReader(file);

		char[] arr = new char[num];
		int cnt;
		String str="";
		while((cnt=fr.read(arr))!=-1) {
			for(int i=0;i<cnt;i++) {
				str+=arr[i];
			}
			str+=",";
		}
		
		
		fr.close();
		return str.substring(0, str.length()-1);
	}
}
