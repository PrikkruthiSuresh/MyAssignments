package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Rocky");
		driver.findElement(By.id("lastNameField")).sendKeys("Roger");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Pikku");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Bikky");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Automation Testing");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Creating sample document for create contact");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("pikkubikky@gmail.com");
		WebElement findElement = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select option=new Select(findElement);
		option.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Important note to create lead");
		driver.findElement(By.xpath("(//textarea[@id='updateContactForm_importantNote']/following::input)[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Contact | opentaps CRM")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
