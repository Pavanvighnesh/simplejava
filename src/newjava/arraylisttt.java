package newjava;

import java.util.ArrayList;

public class arraylisttt {

	public static void main(String[] args) {
		ArrayList<Integer> alist= new ArrayList();
		alist.add(1);
		alist.add(3);
		alist.add(7);
		   for(int i=0;i<alist.size();i++) {
			   System.out.println(alist.get(i));
			   System.out.println("The size of arraylist is"+" "+alist.size());
			  
			   
		   }
		   for(Integer i:alist) {
			   System.out.println(i);
		   }
		  
	}
		}

	


