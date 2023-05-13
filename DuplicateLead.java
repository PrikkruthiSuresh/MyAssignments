package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("(//label[text()='Email Address:']/following::input)[1]")).sendKeys("gokul.hariharan2@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		String text = findElement2.getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//String text = findElement.getText();
		//findElement.click();
		driver.findElement(By.xpath("//a[text()='Qualify Lead']/preceding-sibling::a")).click();
		String title = driver.getTitle();
		if(title.contains("Duplicate Lead | opentaps CRM")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		Thread.sleep(3000);
		//(//span[text()='First name']/following::input)[1]
		//WebElement findElement = driver.findElement(By.id("createLeadForm_firstName"));
		String text2 = driver.findElement(By.id("createLeadForm_firstName")).getText();
		if(text.contains(text2)) {
			System.out.println("Verified");
		}else {
			System.out.println("Not Verified");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
