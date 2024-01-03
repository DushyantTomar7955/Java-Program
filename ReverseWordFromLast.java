package com.jspider;
import java.util.*;
public class ReverseWordFromLast {
	public static String reverseWord(String s) {
		int n=s.length();
		int i=n-1;
		String s1="";
		while(i>=0) {
			int j=i;
			while(j>=0 && s.charAt(j)!=' ') {
				j--;
			}
			int k=j;
			for(int m=k+1;m<=i;m++) {
				s1+=s.charAt(m);
			}
			if(j>0) {
				s1+=' ';
			}
			i=j-1;
		}
		return s1;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String: ");
	String s=sc.nextLine();
	String k=reverseWord(s);
	System.out.print("After Revesring String looks like: "+k);

	}

}
