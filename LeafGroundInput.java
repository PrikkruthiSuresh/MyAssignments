package week2.day2.assignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGroundInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//h5[text()='Type your name']/following::input)[1]")).sendKeys("PrikkruthiSuresh");
		driver.findElement(By.xpath("(//h5[text()='Append Country to this City.']/following::input)[1]")).sendKeys(" India");
		boolean enabled = driver.findElement(By.xpath("(//h5[text()='Verify if text box is disabled']/following::input)[1]")).isEnabled();
		if(enabled==true) {
			System.out.println("The box is not disabled");
		}else {
			System.out.println("The box is disabled");
		}
		driver.findElement(By.xpath("(//h5[text()='Clear the typed text.']/following::input)[1]")).clear();
		WebElement findElement = driver.findElement(By.xpath("(//h5[text()='Retrieve the typed text.']/following::input)[1]"));
		//String text = findElement.getText();
		String attribute = findElement.getAttribute("value");
		System.out.println(attribute);
		//System.out.println(text);
		driver.findElement(By.xpath("(//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::input)[1]")).sendKeys("prikkruthi@gmail.com");
		driver.findElement(By.xpath("(//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::input)[1]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//h5[text()='Text Editor']/preceding::textarea")).sendKeys("Automation Test Engineer, Avid Cyclist");
		driver.findElement(By.xpath("(//*[name()='svg']//*[local-name()='polygon'])[1]")).click();
		driver.findElement(By.xpath("(//span[@id='ql-picker-options-0']/span)[3]")).click();
		//doubt on Normal selection
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='ql-italic'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Learning Selenium through TestLeaf");
		driver.findElement(By.xpath("(//h5[text()='Just Press Enter and confirm error message*']/following::input)[2]")).sendKeys(Keys.ENTER);
		WebElement findElement2 = driver.findElement(By.className("ui-message-error-detail"));
		String attribute2 = findElement2.getText();
		System.out.println(attribute2);
		if(attribute2.contains("Age is mandatory")) {
			System.out.println("Error message is present");
		}else {
			System.out.println("Error message is not present");
		}
		driver.findElement(By.xpath("(//h5[text()='Click and Confirm Label Position Changes']/following::input)[1]")).click();
		//doubt on how to check position
		driver.findElement(By.xpath("//div[@class='ui-autocomplete ui-autocomplete-multiple']//input")).sendKeys("Prikkruthi");
		Thread.sleep(3000);//org.openqa.selenium.ElementNotInteractableException: element not interactable
		driver.findElement(By.xpath("(//span[@class='ui-autocomplete-panel ui-widget-content ui-corner-all ui-helper-hidden ui-shadow ui-input-overlay']//span)[3]")).click();
		driver.findElement(By.xpath("(//h5[text()='Type your DOB (mm/dd/yyyy) and confirm date chosen ']/following::input)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-datepicker-group ui-widget-content']//a)[2]")).click();//how to do multiple click
		driver.findElement(By.xpath("((//table[@class='ui-datepicker-calendar']//tr)[5]//a)[3]")).click();
		driver.findElement(By.xpath("//span[@class='ui-spinner ui-widget ui-corner-all ui-spinner-stacked']/input")).sendKeys("5");
		driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-down ui-corner-br ui-button ui-widget ui-state-default ui-button-text-only']/span")).click();
		driver.findElement(By.xpath("(//h5[text()='Type random number (1-100) and confirm slider moves correctly']/following-sibling::input)[1]")).sendKeys("96");
	}

}
