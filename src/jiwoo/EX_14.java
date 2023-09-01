package jiwoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// 재귀 메소드 
public class EX_14 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add(123);
		list.remove(0);
		list.get(0);
		list.set(0, list);
		
		Set<String> set = new HashSet();
		
		set.add("a");
		set.remove("a");
		

		for (Object v : set) {
			System.out.println(v);
		}
		
		set.contains("foo");
		
		
		
		Map<Object, Object> map = new HashMap<>();
		
		map.put("key", "aa");
		map.remove("key");
		map.get("key");

		boolean b = map.containsKey("foo");
		map.containsValue("bar");
		
		for (Entry<Object, Object> entry : map.entrySet()) {
			
		}
	}
}
