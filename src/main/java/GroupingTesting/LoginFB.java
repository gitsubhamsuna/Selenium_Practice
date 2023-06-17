package GroupingTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFB {
	@Test(groups= {"regression","sanity"})
	public void LoginWithEmail() {
		  
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions opt=new ChromeOptions();
		  opt.addArguments("remote-allow-igins=*");
		  WebDriver driver=new ChromeDriver(opt);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("papu.ajay17@gmail.com");
		  
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Subham26");
		  
		  driver.findElement(By.xpath("//button[@name='login']")).click();
		  
		  Assert.assertEquals(false, false);
		  driver.quit();
	  }
	
	
	@Test(groups= {"regression"})
	public void LoginWithNumber() {
		  
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions opt=new ChromeOptions();
		  opt.addArguments("remote-allow-igins=*");
		  WebDriver driver=new ChromeDriver(opt);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9658028870");
		  
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Subham26");
		  
		  driver.findElement(By.xpath("//button[@name='login']")).click();
		  
		  Assert.assertEquals(false, false);
		  driver.quit();
	  }
}
