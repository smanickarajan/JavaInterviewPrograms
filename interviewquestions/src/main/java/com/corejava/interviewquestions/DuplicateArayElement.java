package com.corejava.interviewquestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArayElement {

	public static void main(String[] args) {
		String[] name= {"Java","C","Python","Javascript","Java"};
		
//using loop worst solution o(n*n)
		
		for (int i=0;i<name.length;i++) {
			for (int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println("Duplicate element is :" +name[i]);
				}
			}
		}
		
		//Using HashSet O(n)
		
		Set<String> nameset=new HashSet<>();
		for (String names:name) {
		if(nameset.add(names)==false)
			System.out.println("Duplicate element is :" +names);
		}
		
		//Using HaspMap O(2n)
		
		Map<String,Integer> namemap= new HashMap<>();
		for (String names:name) {
		Integer count=namemap.get(names);
		if (count==null) {
			namemap.put(names, 1);
		}
		else {
			namemap.put(names, ++count);
		}
			}
		
		Set<Entry<String, Integer>> entryset = namemap.entrySet();
		for (Entry<String, Integer> entry:entryset) {
			if (entry.getValue()>1) {
				System.out.println("Duplicate element is :" +entry.getKey());
			}
			
		}
	}

}
