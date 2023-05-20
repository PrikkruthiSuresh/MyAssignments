package week3.day2assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="prikkruthi";
		char[] charArray = name.toCharArray();
		Set<Character> uniqueCharacter=new HashSet<>();
		for (int i = 0; i < charArray.length; i++) {
			int temp=0;
			for(int j=0;j<charArray.length;j++) {
				if(charArray[i]==charArray[j] && i!=j) {
					 temp=1;
					 break;
				}
			}
			if(temp==0) {
				uniqueCharacter.add(charArray[i]);
			}
			/*uniqueCharacter.remove(newcharArry);
			uniqueCharacter.remove(sec);
			boolean add = uniqueCharacter.add(charArray[i]);
			if(!add) {
				 uniqueCharacter.add(charArray[i]);
			}
			uniqueCharacter.remove(newcharArry);*/
		}
		for(Character c:uniqueCharacter) {
			System.out.print(c);		
		}
	}

}
