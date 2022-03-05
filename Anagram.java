package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops";
		String text2 = "potss"; 
		  // check if length are same
	    if(text1.length() == text2.length()) {

	      // convert both strings into character array
	      char[] charArray1 = text1.toCharArray();
	      char[] charArray2 = text2.toCharArray();

	      // sort both the arrays
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);

	      // Check both the arrays has same value
	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	        System.out.println(text1 + " and " + text2 + " are anagram.");
	      }
	      else {
	        System.out.println(text1 + " and " + text2 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(text1 + " and " + text2 + " are not anagram.");
	    }

	}

}
