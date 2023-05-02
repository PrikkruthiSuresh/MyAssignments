package week1.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] split = str.split("\\s+");
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equalsIgnoreCase(split[j])) {
					count+=1;
					if(count>1) {
						split[i]="";
					}
				}
			}
			System.out.println(split[i]);
			}	
	}

}
