package com.Base;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonDriver extends BrowserDriver {
	public WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
	public void waitForImplicity() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}
	public void waitForXpath(String xpath) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
	public void waitForId(String id) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(id)));
	}
	public void waitForName(String name) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(name)));
	}
	
	public void failedTest(String filename) {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\USER\\eclipse-workspace_2\\SeleniumDemo\\FailedScreenshot\\"+filename+".jpg"));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
