package com.jspider;

import java.util.*;
public class RemoveConsequitive
{
    public static void removeCharacter(String s){
        int n=s.length();
        char c[]=s.toCharArray();
        String s1="";
        int i=0,j=0;
        
        while(j<c.length){
            if(c[i]==c[j]){
                j++;
            }
            else if(c[j]!=c[i] || j==n-1){
                s1+=c[i];
                i=j;
                j++;
            }  
        }
        s1+=c[j-1];
        System.out.println(s1);
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String: ");
	String s=sc.next();
	removeCharacter(s);
	}
}

