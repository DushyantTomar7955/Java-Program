package com.jspider;
import java.util.*;

public class ReverseEveryWord {
    public static String reverseString(String s) {
    int n=s.length();
    String s2="";
    String s3[]=s.split(" ");
    for(int i=0;i<s3.length;i++) {
    	String s4=s3[i];
    	int j=s4.length()-1;
    	
    	while(j>=0) {
    		s2+=s4.charAt(j);
    		j--;
    	}
    	s2+=" ";
    	
    }
    return s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String k=reverseString(s);
        System.out.println(k);
    }
}







