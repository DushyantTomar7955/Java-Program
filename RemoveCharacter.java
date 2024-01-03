package com.jspider;

import java.util.*;
public class RemoveCharacter
{
    public static void removeCharacter(String s,char ch){
        int n=s.length();
        int count=2;
        char c[]=s.toCharArray();
        String s1="";
        for(int i=0;i<n;i++){
        	if(c[i]==ch && count>0) {
        		count--;
        	}
        	else {
        		s1+=c[i];
        	}
        }
        System.out.println(s1);
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the String: ");
	String s=sc.next();
	System.out.print("Enter the Character to remove: ");
	char ch=sc.next().charAt(0);
	removeCharacter(s,ch);
	}
}