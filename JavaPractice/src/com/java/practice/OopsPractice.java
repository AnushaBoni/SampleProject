package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class OopsPractice {

	public static void main(String[] args) {
		
		   String s="ANU"; 
		   String s1= new String("ANU"); 
		  String s2= new String("ANU");
		  System.out.println(s1==s2);//--Address comparision
		  System.out.println(s1.equals(s2));//--Content Comparision
		  System.out.println(s==s1);
		  System.out.println(s.equals(s2));
		 
/*
		String str="aaabbbcccddd";
		Set<String> s = new HashSet<String>();*/
		
	}

}
