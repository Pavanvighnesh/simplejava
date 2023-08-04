package newjava;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		  hmap.put("vighnsh",100);
		  hmap.put("prathyusha",200);
		  hmap.put("sravani",300);
		  hmap.put("Bhavya",400);
		   for(String s :hmap.keySet()) {
			   System.out.println(hmap.get(s));
		   }
		   
		
	}

}
