package week3.day2assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={2,1,3,4,3,5,4,6,7,1,3,9};
		Set<Integer> removeDuplicates=new TreeSet<>();
		for(int i=0;i<numbers.length;i++) {
			removeDuplicates.add(numbers[i]);
		}
		List<Integer> missingNumber=new ArrayList<>(removeDuplicates);
		for(int j=0;j<missingNumber.size();j++) {
			Integer data = missingNumber.get(j);
			int count=j+1;
			if(data==count) {
				continue;
			}
			else {
				System.out.println(count);
				break;
			}
		}
	}

}
