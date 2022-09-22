package toolsqa;

	import org.openqa.selenium.By;
	import org.testng.annotations.Test;

import baseclass.Basetest;



	public class TC_07_Anil_links extends Basetest {

		@Test
		public void testcase1() throws InterruptedException {
			//opening demoQA page
			driver.get("https://demoqa.com/");
			
			// opening links page
			driver.get("https://demoqa.com/links");
			System.out.println("Links page opened successfully");

			// clicking on "Home" link
			driver.findElement(By.id("simpleLink")).click();
			System.out.println("clicked on Home link susccessfully");
			
		}

}
