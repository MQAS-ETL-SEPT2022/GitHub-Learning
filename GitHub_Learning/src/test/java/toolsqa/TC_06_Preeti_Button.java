package toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_06_Preeti_Button {

	public static void main(String[] args) {

		// launching the application
		WebDriverManager.chromedriver().setup();
		System.out.println("WebDriver Manager Setup Successfully");

		// Launching chrome browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome driver object created for launching browser");

		// Fetching the url
		driver.get("https://demoqa.com/buttons");
		System.out.println("Chrome driver launched successfully");

		// Creating instance of action class and passing the driver as sub instance
		Actions action = new Actions(driver);
		System.out.println("Created object of action class and passing the driver instance");

		// Find out the web element and store in reference variable and perform action
		// on it
		WebElement double_click = driver.findElement(By.id("doubleClickBtn"));
		System.out.println("Successfully written xpath for doubleclick ");
		action.doubleClick(double_click).build().perform();
		System.out.println("Successfully double click ");

		// Find out the web element and store in reference variable and perform action
		// on it
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		System.out.println("Successfully findout rightclick webelement ");
		action.contextClick(rightClick).perform();
		System.out.println("Successfully right click ");

		// Find out the web element and store in reference variable and perform action
		// on it
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		System.out.println("Successfully written xpath for click me ");

		// Finally closing the browser
		driver.quit();
		System.out.println("Chrome driver closed successfully");

	}
}