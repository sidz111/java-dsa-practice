package com.sidz;

public class StringPractice {
	public static void main(String[] args) {
		System.out.println("I am starting my DSA Practice !!!");
//		String s1 = new String("Hello");
//		String s2 = new String("Hello");
//		String s3 = new String("hello");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s3));
		StringBuffer sb = new StringBuffer("Siddhu Surwade");
//		System.out.println(sb);
//		for (int i =0; i<sb.length(); i++) {
//			System.out.print(sb.charAt(i));
//			if(sb.charAt(i)==' ') {
//				sb.delete(i, i+1);
//			}
//		}
		System.out.println(sb);
		System.out.println(sb.reverse());        //reverse method to reverse the string in StringBuffer
	}

}
