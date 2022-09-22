package toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Basetest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_06_Preeti_Button extends Basetest{

	@Test
	   public void testcase(){

		// Fetching the url
		driver.get("https://demoqa.com/buttons");
		System.out.println("Chrome driver launched successfully");

		// Creating instance of action class and passing the driver as sub instance
		Actions action = new Actions(driver);
		System.out.println("Created object of action class and passing the driver instance");

		// Find out the web element and store in reference variable and perform action
		// on it
		WebElement double_click = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(double_click).build().perform();
		System.out.println("Successfully double clicked ");

		// Find out the web element and store in reference variable and perform action
		// on it
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightClick).build().perform();
		System.out.println("Successfully right click ");

		// Find out the web element and store in reference variable and perform action
		// on it
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		System.out.println("Successfully clicked on click me ");

	}
}