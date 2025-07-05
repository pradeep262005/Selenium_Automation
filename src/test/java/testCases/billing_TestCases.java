package testCases;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.Camu_Login;

public class billing_TestCases extends Camu_Login{
	@Test(priority = 4, groups = { "billing" })
	public void billing() throws InterruptedException {
		String homeurl = properties.getProperty("homeurl");
		driver.navigate().to(homeurl + "billing");
<<<<<<< HEAD
		Thread.sleep(1000);
=======
		slowDown(1000);
>>>>>>> d5334f1a1f2845d7f4f5d0c722385b1acf8c151c

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement paynowbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bill_filter_btn\"]/div/div[4]/button")));
		paynowbtn.click();
<<<<<<< HEAD
		Thread.sleep(1000);
=======
		slowDown(1000);
>>>>>>> d5334f1a1f2845d7f4f5d0c722385b1acf8c151c

		WebElement feeamount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bill-payment\"]/div/div[1]/div[2]/div[2]/div[1]/input")));
		feeamount.clear();
		feeamount.sendKeys("1000");
<<<<<<< HEAD
		Thread.sleep(1000);
=======
		slowDown(1000);
>>>>>>> d5334f1a1f2845d7f4f5d0c722385b1acf8c151c
		try {
			WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("payNowbtn")));
		    System.out.println("Button is clickable!");
		    button.click();
		} catch (TimeoutException e) {
		    System.out.println("Error.");
		}
<<<<<<< HEAD
		Thread.sleep(2000);
=======

		slowDown(2000);
>>>>>>> d5334f1a1f2845d7f4f5d0c722385b1acf8c151c
	}
}
