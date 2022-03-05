package week3.day1;

public class Palindrome {

	 public static void main(String args[]){

	      String str1 = "madam";
	      StringBuffer buffer = new StringBuffer(str1);
	      buffer.reverse();
	      String str2 = buffer.toString();
	      if(str1.equals(str2)){
	         System.out.println("Given String "+ str1 + " is palindrome");
	      }
	      else
	      {
	         System.out.println("Given String "+ str1 + " is not palindrome");
	      }
	   }
}
