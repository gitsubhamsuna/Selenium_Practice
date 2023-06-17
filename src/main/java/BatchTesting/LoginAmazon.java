package BatchTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAmazon {
	
	@Test
	public void loginWithEmail() {
		 WebDriverManager.chromedriver().setup();
		  ChromeOptions opt=new ChromeOptions();
		  opt.addArguments("remote-allow-igins=*");
		  WebDriver driver=new ChromeDriver(opt);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.amazon.in/");
		  
		  Actions act=new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, sign in']"))).click().perform();
		  act.moveToElement(driver.findElement(By.xpath("//input[@id='ap_email']"))).sendKeys("papu.ajay17@gmail.com",Keys.ENTER).perform();
		  act.moveToElement(driver.findElement(By.xpath("//input[@id='ap_password']"))).sendKeys("Subham@26",Keys.ENTER).perform();
		  
		  driver.quit();
		  
	}
	
	@Test
	public void loginWithNumber() {
		 WebDriverManager.chromedriver().setup();
		  ChromeOptions opt=new ChromeOptions();
		  opt.addArguments("remote-allow-igins=*");
		  WebDriver driver=new ChromeDriver(opt);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.amazon.in/");
		  
		  Actions act=new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, sign in']"))).click().perform();
		  act.moveToElement(driver.findElement(By.xpath("//input[@id='ap_email']"))).sendKeys("9556444979",Keys.ENTER).perform();
		  act.moveToElement(driver.findElement(By.xpath("//input[@id='ap_password']"))).sendKeys("Subham@26",Keys.ENTER).perform();
		  
		  driver.quit();
		  
	}

}
