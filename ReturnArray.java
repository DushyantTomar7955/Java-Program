package com.jspider; 
import java.util.Arrays;

public class ReturnArray {

	public static int[] m1() {
		int a[]= {10,20,4,20,1};
		return a;
	}

	public static void main(String[] args) {
		int b[]=m1();
      System.out.println(Arrays.toString(b));	
      System.out.print(Arrays.toString(m1()));
	}
}
