package toolsqa;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Basetest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01_Priya_UpdAndDownload extends Basetest {
	@Test
	public void testcase() throws InterruptedException {
		// Launching the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser launched successfully",true);
		Thread.sleep(2000);

		// Maximising the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		Reporter.log("Browser maximised successfully",true);
		Thread.sleep(2000);

		// Launching the application
		driver.get("https://demoqa.com/links");
		Reporter.log("Application launched successfully",true);
		Thread.sleep(2000);
		

		// Clicking on elements
		driver.findElement(By.xpath("//div[@class='element-group']")).click();
		Reporter.log("Clicked on Element button successfully",true);
		Thread.sleep(2000);
		
		

		// Performing action
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Reporter.log("Action performed succesfully",true);
		Thread.sleep(5000);

		// Clicking on upload and download option
		driver.findElement(By.xpath("//span[text()='Upload and Download']")).click();
		Reporter.log("Clicked on Upload and Download",true);

		// Closing the application
		driver.close();
		Reporter.log("Application is closed successfully",true);

	}

}
