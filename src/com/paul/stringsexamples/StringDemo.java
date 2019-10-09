package com.paul.stringsexamples;

public class StringDemo {
	
	public static void main(String[] args) {
		
		// two types to create a string
		//literal
		String a = "Paul sathyananda";
				//System.out.println(a);	
				
				System.out.println(a.length());
				System.out.println(a.substring(12));
				System.out.println(a.substring(10, 12));
				System.out.println(a.contains("Paul"));
				System.out.println(a.trim());
				
				String temp []=a.split(" ");
				System.out.println(temp [0]);
				System.out.println(temp [1]);
				int len=temp.length;
				
				for (int i=0; i < len; i++) {
					System.out.println(temp[i]);
					
				}
				//using new
				//String a1= new String();
				//a1="sathya";
				//System.out.println(a1);
								//
				
				String x= "Paul";
				String y="Paul";
				String z = "Paul";
				
				System.out.println(x+"::"+y+"::"+z);
				
				System.out.println(x.equals(y));
				System.out.println(x.compareTo(y));
				
				String x1="Paul";
				String x2="Paul";
				
				boolean x3=x1.equals(x2);
				System.out.println(x3);
				
				boolean x4= (x1==x2);
				System.out.println(x4);
				System.out.println(x1==x2);
				
	}
	
	
	
	

	
}
