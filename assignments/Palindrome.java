package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String value="malayalam";
		String rev="";
		char[] orgstring=value.toCharArray();
		for(int i=orgstring.length-1;i>=0;i--) {
				rev=rev+Character.toString(orgstring[i]);
			}
		if(rev.equals(value)) {
			System.out.println("The given string "+value+" is a Palindrome");
		}
		else {
			System.out.println("The given string "+value+" is not a Palindrome");
		}
		
		
	}
}
