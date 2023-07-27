package day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String test = "changeme";
		char[] ch = new char[test.length()];
		
		for (int i = 0, len = test.length(); i < len; i++) {
		    char ch1 = test.charAt(i);
		    if (i % 2 == 0) {
		        System.out.print(Character.toLowerCase(ch1));
		    } else {
		        System.out.print(Character.toUpperCase(ch1));
		    }
		}
		
		//System.out.println(test.charAt(1));
		
		//toLowerCase

	}

}
