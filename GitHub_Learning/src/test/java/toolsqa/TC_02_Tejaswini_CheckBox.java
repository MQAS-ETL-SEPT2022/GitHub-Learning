package toolsqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02_Tejaswini_CheckBox extends Basetest {

   @Test
   public void Testcase() {

		WebDriverManager.chromedriver().setup();
		System.out.println("webdriver setup is successfully");
		
        //Launching the Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        //Maximize the Browser
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
        //Launching the application
		driver.get("https://demoqa.com/checkbox");
		System.out.println("Application launched successfully");
		
        //Clicking the checkbox module
		driver.findElement(By.className("rct-checkbox")).click();
		System.out.println("successfully clicked on checkbox module");

		driver.close();
		System.out.println("Application closed successfully");

	}
}
