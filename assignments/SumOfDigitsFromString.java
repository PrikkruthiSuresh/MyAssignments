package week1.day2.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int sum=0;
		String num=text.replaceAll("\\D","");
		char[] numArray=num.toCharArray();
		for(int i=0;i<numArray.length;i++) {
			int newval=Character.getNumericValue(numArray[i]);
			sum+=newval;
		}
		System.out.println(sum);	
		
	}

}
