package demonstratinginheritance.week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestData extends TestData{
	FirefoxDriver driver;
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

}
