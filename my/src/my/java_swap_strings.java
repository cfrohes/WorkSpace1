package my;

import java.util.Scanner;

public class java_swap_strings {

    public static void main(String[] args) {
          String s="ABCDEF";
           int n=s.length();
           	String rev=" ";
           	//method 1================================================================================
        for(int i=n-1;i>=0;i--) {
        	rev=rev+s.charAt(i);
        	
        }
        System.out.print(rev);
           	//method 2=====================================================================================
//    	char a[]=s.toCharArray();
//    	for(int i=n-1;i>=0;i--) 
//    		rev=rev+a[i];
           	//method 3=====================================================================================
//           	StringBuilder sb=new StringBuilder(s);
//           	
//    	  System.out.println(sb.reverse());
        
    }
}
