package week3.day2assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> removeDuplicates=new LinkedHashSet<>();
		for (int i = 0; i < split.length; i++) {
			boolean add = removeDuplicates.add(split[i]);
			if(!add) {
				removeDuplicates.add(split[i]);
			}
		}
		for(String s:removeDuplicates) {
			System.out.print(s+" ");
		}
	}

}
