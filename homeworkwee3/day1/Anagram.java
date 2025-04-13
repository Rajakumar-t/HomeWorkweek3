package homeworkwee3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "stops";
		String str2 = "potss";
		int lengtofArrays = str1.length();
		int lengtofArrtys1 = str2.length();
		System.out.println("Length of str1: " + lengtofArrays);
		System.out.println("Length of str2: " + lengtofArrtys1);
		System.out.println(lengtofArrays == lengtofArrtys1);
		if (lengtofArrays == lengtofArrtys1) {
			System.out.println("The given strings are Anagram");

		}

		else
			System.out.println("The given strings are not an Anagram");
		System.out.println("after converitn in to Char"+ "---------");
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (charArray1==charArray2) {
			System.out.println("The given strings are Anagram");
		}
		else
			System.out.println("The given strings are not an Anagram");
		
		

	}
}
