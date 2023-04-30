package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=197;
		boolean isPrime=false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=true;
				break;	
			}
		}
		if(isPrime==false) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
	}

}
