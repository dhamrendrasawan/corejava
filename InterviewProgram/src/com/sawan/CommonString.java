package com.sawan;
//Java program to print common characters
//of two Strings in alphabetical order
//import java.io.*;
//import java.util.*;
public class CommonString {

	
	    static final int MAX_CHAR = 26;
	   // String s1 = "geeksforgeeks", s2 = "practiceforgeeks";
	    static void printCommon(String s1, String s2)
	    {
	       // two arrays of length 26 to store occurrence
	        // of a letters alphabetically for each string
	        int[] a1 = new int[MAX_CHAR];
	        int[] a2 = new int[MAX_CHAR];
	 
	        int length1 = s1.length();
	        int length2 = s2.length();
	 
	        for (int i = 0 ; i < length1 ; i++)
	        {
	           a1[s1.charAt(i) - 'a']=a1[s1.charAt(i) - 'a']+ 1;
	           System.out.println("values1="+a1[s1.charAt(i) - 'a']+ 1);
	            //  System.out.println("a2="+a2);
	          //  System.out.println("a1="+a1);
	        }
	 
	        for (int i = 0 ; i < length2 ; i++)
	        {
	           a2[s2.charAt(i) - 'a']=a2[s2.charAt(i) - 'a']+ 1;
	           System.out.println("values2="+a2[s2.charAt(i) - 'a']+ 1);
              System.out.println("a2="+a2);
	        }
	 
	        // If a common index is non-zero, it means
	        // that the letter corresponding to that
	        // index is common to both strings
	        for (int i = 0 ; i < MAX_CHAR ; i++)
	        {
	            if (a1[i] != 0 && a2[i] != 0)
	            {
	                // Find the minimum of the occurrence
	                // of the character in both strings and print
	                // the letter that many number of times
	                for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++)
	                    System.out.print(((char)(i + 'a')));
	            }
	        }
	    }
	public static void main(String[] args) {
		
		 String s1 = "aap", s2 = "aay";
	        printCommon(s1, s2);
	}

}
