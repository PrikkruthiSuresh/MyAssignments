package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		driver.findElement(By.xpath("(//div[@class='crmsfa']//ancestor::a)[2]")).click();
		driver.findElement(By.xpath("(//li[@class='sectionTabButtonUnselected']//ancestor::a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//label[text()='First name:']/following::input)[1]")).sendKeys("preethi");//{org.openqa.selenium.ElementNotInteractableException}
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("preethi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		String title = driver.getTitle();
		if(title.contains("View Lead | opentaps CRM")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is incorrect");
		}
		driver.findElement(By.xpath("(//a[text()='Delete']/preceding-sibling::a)[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.xpath("(//span[text()='Important Note']/following::input)[1]")).click();
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(text.contains("Google")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		Thread.sleep(5000);
		driver.close();

	}

}
