package toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01_Priya_UpdAndDownload {

	public static void main(String[] args) throws InterruptedException {
		// Launching the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully");
		Thread.sleep(2000);

		// Maximising the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		System.out.println("Browser maximised successfully");
		Thread.sleep(2000);

		// Launching the application
		driver.get("https://demoqa.com/links");
		System.out.println("Application launched successfully");
		Thread.sleep(2000);

		// Clicking on elements
		driver.findElement(By.xpath("//div[@class='element-group']")).click();
		System.out.println("Clicked on Element button successfully");
		Thread.sleep(2000);

		// Performing action
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		System.out.println("Action performed succesfully");
		Thread.sleep(5000);

		// Clicking on upload and download option
		driver.findElement(By.xpath("//span[text()='Upload and Download']")).click();
		System.out.println("Clicked on Upload and Download");

		// Closing the application
		driver.close();
		System.out.println("Application is closed successfully");

	}

}
