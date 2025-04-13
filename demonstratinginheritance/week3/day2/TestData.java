package demonstratinginheritance.week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
 class TestData {
	 FirefoxDriver driver;
	public void enterCredentials() {
		driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	public void navigateToHomePage() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
}
