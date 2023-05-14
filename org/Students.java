package week3.day2.assignments;

public class Students {
	public void getSudentInfo(int id) {
		System.out.println("The students id is"+id);
	}
	public void getSudentInfo(int id,String name) {
		System.out.println("The students id is"+id+" "+name);
	}
	public void getSudentInfo(String email,long phonenumber) {
		System.out.println(email+" "+phonenumber);
	}
	
	public static void main(String[] args) {
		Students stud=new Students();
		stud.getSudentInfo(14090);
		stud.getSudentInfo(1458,"Pranav");
		stud.getSudentInfo("pranav@gmail.com", 9944885577l);
	}
}
