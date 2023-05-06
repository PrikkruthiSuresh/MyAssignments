package week1.day2.assignments;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] splitwords=test.split(" ");
		//System.out.println(splitwords);
		//String[] lastsplit= {};
		for(int i=0;i<splitwords.length;i++) {
			if(i%2!=0) {
				char[] newSplit=splitwords[i].toCharArray();	
				String reverse="";
				for(int j=newSplit.length-1;j>=0;j--) {
					reverse=reverse+newSplit[j];
				}
				System.out.println(reverse);
				}else {
					System.out.println(splitwords[i]);
				}
			 
			
		}
		
	}

}
