package com.java.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setspractice {

	public static void main(String[] args) {
		 
		Set<Integer> num= new HashSet<Integer>();
		Set<String>  str= new LinkedHashSet<String>();
		
		
		  for (int i = 1; i < 6; i++) { 
			  num.add(i); 
			  }
	
		num.add(25);
		num.add(1);
		num.add(0);
		num.add(98); 
		
		for (Integer in : num) {
			System.out.println(in+" Integer Set");
		}
		
		str.add("ANU");
		str.add("SHA");
		str.add("BONI");
		
		for(String s:str) {
			System.out.println(s+" String Set");
		}
			
			String str1="aaabbbcccddd";
//			int len=str1.length();
			Set<String> s1 = new HashSet<String>();
//			for(int i=0;i<len;i++) {
//				s1.add(str1.substring(i,i+1))	;
//				
//			}
			
			
		char[] ch=str1.toCharArray();	
		for(char c:ch) {
			s1.add(String.valueOf(c));
			}
		
		System.out.println(s1);
			
			
		HashMap<String, String>  m = new HashMap<String, String>();
		
		for(char c:ch) {
//			s1.add(String.valueOf(c));
			System.out.println(String.valueOf(c));
			m.put(String.valueOf(c), String.valueOf(c));
			}
		System.out.println(m);
		for(String s:m.keySet()) {
			System.out.println(m.get(s));
		}
		
		
		}
	
	
	
	
	
	
	
	
	
	}


