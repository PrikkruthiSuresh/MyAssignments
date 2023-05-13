package week2.day2.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password:']/following-sibling::input")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.close();
		
	}

}
