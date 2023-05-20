package week3.day2assignments;


import java.util.Arrays;


public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] companyNames= {"HCL","Wipro","Aspire Systems","CTS"};
		int length = companyNames.length;
		Arrays.sort(companyNames);
		for (int i = length-1; i >=0; i--) {
			String string = companyNames[i];
			char[] charArray = string.toCharArray();
			System.out.println(charArray);
		}
		
		
	}

}
