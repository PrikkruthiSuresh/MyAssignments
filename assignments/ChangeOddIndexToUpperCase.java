package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		int len = test.length();
		char[] changeodd=test.toCharArray();
		for(int i=0;i<len;i++) {
			if(i%2!=0) {
				System.out.println(Character.toUpperCase(changeodd[i]));
			}
		}

	}

}
