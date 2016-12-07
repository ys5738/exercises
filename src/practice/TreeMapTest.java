package practice;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, String> tmp = new TreeMap<>(); 
		tmp.put("z", "aaa"); 
		tmp.put("a", "ccc"); 
		tmp.put("c", "cdc"); 
		tmp.put("9", "bbb"); 
		System.out.println(tmp.firstKey() );
		Iterator<String> iterator_2 = tmp.keySet().iterator(); 
		while (iterator_2.hasNext()) { 
			Object key = iterator_2.next(); 
			System.out.println(key.toString()+"tmp.get(key) is :" + tmp.get(key)); 
		} 
		
		
	}

}
