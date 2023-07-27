package day2.assignments;

public class Palindromesimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String word="madam";
		String rev="";
		char ch;
		 		 
		for (int i = word.length() - 1; i >= 0; i--)
		{
            ch=(word.charAt(i));
            
            rev = rev + ch;
		            
        }
		System.out.println("Reversed word: "+ rev);
	

		if(word.equals(rev))
		 {
			 System.out.println("Given word is Palindrome");
		 }
		 else
		 {
			 System.out.println("Given word is not a Palindrome");
		 }	


	}

}
