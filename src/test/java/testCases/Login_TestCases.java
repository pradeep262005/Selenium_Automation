package testCases;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import pageObjects.Camu_Login;

public class Login_TestCases extends Camu_Login {

	@Test(priority = 1, groups = { "functions" })
	public void login() throws IOException, InterruptedException {
		String userinput = properties.getProperty("username");
		String passwordinput = properties.getProperty("password");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(userinput);
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(passwordinput, Keys.ENTER);
		Thread.sleep(1500);

		File loginsuccess = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/pass/img.png");
		FileHandler.copy(loginsuccess, dest);
		Thread.sleep(1000);
	}

}
