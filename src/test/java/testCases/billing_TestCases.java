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
		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement paynowbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bill_filter_btn\"]/div/div[4]/button")));
		paynowbtn.click();
		Thread.sleep(1000);

		WebElement feeamount = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"bill-payment\"]/div/div[1]/div[2]/div[2]/div[1]/input")));
		feeamount.clear();
		feeamount.sendKeys("1000");
		Thread.sleep(1000);
		try {
			WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("payNowbtn")));
		    System.out.println("Button is clickable!");
		    button.click();
		} catch (TimeoutException e) {
		    System.out.println("Error.");
		}
		Thread.sleep(2000);
	}
}
