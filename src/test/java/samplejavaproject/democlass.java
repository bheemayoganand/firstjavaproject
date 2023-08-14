package samplejavaproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class democlass {

	@Test
	public void testclass() {

		System.out.println("my testclass started...");

		

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement userId = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		userId.sendKeys("Admin");

		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123");

		WebElement btnLogin = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		btnLogin.click();
	}
}
