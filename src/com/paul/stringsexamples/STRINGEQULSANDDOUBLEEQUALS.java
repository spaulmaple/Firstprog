package com.paul.stringsexamples;

public class STRINGEQULSANDDOUBLEEQUALS {

	public static void main(String[] args) {
		
		String s1= new String("Paul");
		String s2= new String("Paul");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3="Paul";
		String s4="Paul";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		StringBuffer sb=new StringBuffer("Hello ");  
		StringBuffer sb1=new StringBuffer("Hello ");
		System.out.println(sb.equals(sb1));
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		

	}

}
