package day2.assignments;

import java.util.Scanner;

public class Palindrome {
	
	public void reverse(String word1, String word2)
	{
	
	 if(word1.equals(word2))
	 {
		 System.out.println("Given word is Palindrome");
	 }
	 else
	 {
		 System.out.println("Given word is not a Palindrome");
	 }
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="madam";
		String rev="";
		char ch;
		 		 
		for (int i = word.length() - 1; i >= 0; i--)
		{
            ch=(word.charAt(i));
            rev=ch+rev;
		            
        }
		System.out.println("Reversed word: "+ rev);
	

	Palindrome getvalue=new Palindrome();
	getvalue.reverse(word,rev);
	}	
	
}