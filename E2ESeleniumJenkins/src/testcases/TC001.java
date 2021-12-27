package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
//bare minimum program, as the focus is on e2e linking till Jenkins.


public class TC001 {
	
	@Test
	public void tc001() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Search this");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.quit();
	}
	
	//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

}
