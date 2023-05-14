package week3.day2.assignments;

public class Automation extends MultipleLanguage{
	@Override
	public void Selenium() {
		System.out.println("Selenium testtool");
		}
    @Override
	public void Java() {
		System.out.println("Java Langauage");
	}
    @Override
	public void ruby() {
		System.out.println("Ruby is also a coding Language");
	}
    public void python() {
    	System.out.println("Overriding python");
    }
    public static void main(String[] args) {
		Automation auto=new Automation();
		auto.python();
		auto.ruby();
		auto.Java();
		auto.Selenium();
	}
}
