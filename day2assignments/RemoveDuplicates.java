package week3.day2assignments;


import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="PayPal India";
		char[] charArray = string.toCharArray();
		Set<Character> charSet=new TreeSet<Character>();
		Set<Character> dupCharSet=new TreeSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			//int temp=0;
			for(int j=i+1;j<charArray.length;j++) {
				charSet.add(charArray[i]);
				if(charArray[i]==charArray[j]) {
					dupCharSet.add(charArray[i]);
				}
			}
	}
			charSet.removeAll(dupCharSet);
			/*String string2 = charSet.toString();
			System.out.println(string2);
			string2.replaceAll("\\s", "");
			System.out.println(string2);*/
			for (Character character : charSet) {
				if(!charSet.isEmpty()) {
					System.out.println(character);
				}
			
			}
}
}
