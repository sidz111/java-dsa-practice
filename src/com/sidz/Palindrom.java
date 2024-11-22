package com.sidz;

public class Palindrom {

	//Palindrom Method using double point approach
	public static void isPalindrom(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (true) {
			for (int i = left; i < right; i++) {
				if (str.charAt(left) == str.charAt(right)) {
					left++;
					right--;
				}
			}
			if (left == right) {
				System.out.println(str + " is Palindrome");
				break;
			} else {
				System.out.println(str + " is NOT Palindrome");
				break;
			}
		}
	}

	public static void main(String[] args) {
		String s = new String("naman");
		isPalindrom(s);
	}
}
