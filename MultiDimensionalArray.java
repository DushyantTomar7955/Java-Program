package com.jspider;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Rows: ");
		int n=sc.nextInt();
		System.out.print("Enter the Number of Columns: ");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" Row");
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
       for(int i=0;i<n;i++) {
    	   for(int j=0;j<m;j++) {
    		   System.out.print(a[i][j]+" ");
    	   }
    	   System.out.println();
       }
       System.out.println("==============");
       for(int[]i:a) {
    	   for(int j:i) {
    		   System.out.print(j+" ");
    	   }
    	   System.out.println();
       }
	}

}
