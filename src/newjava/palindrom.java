package newjava;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		
		 Scanner scn=new Scanner(System.in);
		   System.out.println("Enter a number");
		   int num= scn.nextInt();
		  int onum= num;
		  int rev=0;
		  while(num!=0) {
			  rev=rev*10+num%10;
			  num=num/10;
			  
		  }
		  if(onum==rev)
		  {
			  System.out.println(onum+ " Is a palindrom");
		  }
		  else {
			  System.out.println(onum+ " Is not a palindrom");
		  }
	}

}
