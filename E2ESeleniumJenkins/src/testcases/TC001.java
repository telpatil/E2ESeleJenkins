package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//bare minimum program, as the focus is on e2e linking till Jenkins.

import org.testng.annotations.*;

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

}
