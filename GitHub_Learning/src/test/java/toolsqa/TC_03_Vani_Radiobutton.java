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

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_03_Vani_Radiobutton extends Basetest {
	@Test
	public void testcase() throws InterruptedException {
		
		// browser launching
		driver.get("https://demoqa.com/dynamic-properties");
		Reporter.log("Browser successfully launched");
		WebElement text = driver.findElement(By.xpath("//span[text()='Text Box']"));
		assertTrue(text.isDisplayed(), "Url is not triggered");

		// To scroll page down
		Actions action1 = new Actions(driver);
		action1.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Radio Button']"));
		assertTrue(ele1.isDisplayed(), "Radiobutton is not displayed");

		// clicking on Radio button element
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		Reporter.log("Successfully clicked on Radio button Element");
		WebElement ele2 = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		assertTrue(ele2.isDisplayed(), "Radiobutton is not clicked");

		// clicking on yes Radio button
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		System.out.println("Successfully clicked on yes Radio button");
		Thread.sleep(2000);
		// driver.quit();

	}

}
