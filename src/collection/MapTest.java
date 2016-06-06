package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		
		map.put("1","p");
		
		for(String s:map.values()){
			System.out.println(s);
		}
		
	}
}