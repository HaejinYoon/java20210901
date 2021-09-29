package p18io.p02quiz;

import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Ex07 {
	public Map<Character, Integer> count(String fileName) throws Exception{
		
		Reader r = new FileReader(fileName);
		
		Map<Character, Integer> map = new HashMap<>();
		int data;
		while ((data=r.read())!=-1) {
//			if(map.containsKey((char)data)) {
//				map.put((char)data, (map.get((char)data))+1);
//			}else {
//				map.put((char)data, 1);
//			}
			
			map.merge((char)data, 1, (old, n) -> old+n);
		}
		r.close();
		return map;
	}
}

