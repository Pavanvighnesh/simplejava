package newjava;

import java.util.HashSet;
import java.util.Iterator;

public class iteratorrr {

	public static void main(String[] args) {
		   HashSet<String> alist=new HashSet();
		      alist.add("Beeraka");
		      alist.add("Pavan");
		      alist.add("vighnesh");
		      alist.add("kumar");
		         Iterator<String> itr = alist.iterator();
		            while(itr.hasNext()) {
		            	System.out.println(itr.next());
		            }
		      
		   
	}

}
