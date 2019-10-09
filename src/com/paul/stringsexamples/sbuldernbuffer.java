package com.paul.stringsexamples;

public class sbuldernbuffer {

	public static void main(String[] args) {
		
		StringBuilder sbr= new StringBuilder("Paul");
		
		sbr.append("Sathyananda");
		System.out.println(sbr);

		StringBuffer sbfr= new StringBuffer("Andrew");
		sbfr.append("Nirmal");
		System.out.println(sbfr);
		System.out.println(sbfr.reverse());
		
		
	}

}
