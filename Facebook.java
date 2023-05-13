package week2.day2.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pikku");
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Pranav");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9944993355");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("PikkuBikky123#");
		WebElement findElement = driver.findElement(By.xpath("//select[@id='day']"));
		Select option=new Select(findElement);
		option.selectByValue("24");
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select option1=new Select(findElement2);
		option1.selectByVisibleText("Oct");
		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select option2=new Select(findElement3);
		option2.selectByVisibleText("1997");
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
	}

}
