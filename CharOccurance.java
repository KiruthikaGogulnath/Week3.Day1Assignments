package week3.day1;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		  char search = 'e';
		  
		  int count=0;
		  for(int i=0; i<str.length(); i++)
		  {
		      if(str.charAt(i) == search)
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");
	}

}
