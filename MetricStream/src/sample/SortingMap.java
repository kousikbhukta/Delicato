package sample;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMap {

	
	public static void main(String[] args) {

		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("One", 11);
		map.put("Two", 21);
		map.put("Three", 9);
		map.put("Four", 67);
		map.put("Five", 2);
		map.put("Six", 33);
		
		List<Entry<String, Integer>> list=new LinkedList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>(){

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());   // Sort by value
				
				//return o1.getKey().compareToIgnoreCase(o2.getKey());    // Sort by Key
			}
			
		});
		
		for(Entry<String, Integer> item:list){
			
			System.out.println(item);
		}
	}

}
