package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.xml.stream.events.Characters;

import org.testng.annotations.Test;

public class MapSet {
	public void hashmap() {

		HashMap<Integer, String> h = new HashMap();

		h.put(2, "hi");
		Object o = h.put(2, "hello");
		System.out.println(o);
		System.out.println(h.get(2));
		h.put(null, null);
		h.put(2, null);
		h.put(3, null);
		Iterator<Integer> i = h.keySet().iterator();
		while (i.hasNext()) {
			System.out.println(i.hasNext());
		}
		Iterator<String> i2 = h.values().iterator();
		while (i2.hasNext()) {
			System.out.println(i2.hasNext());
		}

		Iterator<Entry<Integer, String>> i3 = h.entrySet().iterator();
		while (i3.hasNext())
			;
		Entry<Integer, String> e = i3.next();
		System.out.println(e.getKey());
		System.out.println(e.getValue());
	}
	
	@Test
	public void countCharacter() {
		String s="HELLO";
		HashMap<Character, Integer> h= new HashMap();
	char[]c	=s.toCharArray();
	for(Character x:c) {
		if( h.containsKey(x)) {
			h.put(x, h.get(x)+1);
			
		}else {
			h.put(x, 1);
		}
	}
	Iterator<Entry<Character,Integer>>e= h.entrySet().iterator();
	while(e.hasNext()) {
	}
	
	Entry<Character,Integer> en=e.next();
	System.out.println(en.getKey()+"occured"+en.getValue()+"times");
	
	}
	@Test
	public void eachcharcount() {
		int eachcharcount=1; 
		int hightcount=1;
		String s="hello";
		char[]c=s.toCharArray();
		char x=c[0];
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					eachcharcount ++;
				}
				if (eachcharcount>hightcount) {
					hightcount=eachcharcount;
					x=c[i];		
						
				}System.out.println(x+"is occured"+"highest"+"times");
			}
		
			
		}
		
	}
	
}