package testCases;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.Camu_Login;

public class attendance_TestCases extends Camu_Login {
	@Test(priority = 2, groups = { "functions" },invocationCount=4)
	public void attendance() throws InterruptedException {
		String homeurl = properties.getProperty("homeurl");
		driver.navigate().to(homeurl + "attendance");
		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement tab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='OVER ALL']")));
		tab.click();
		Thread.sleep(1000);

		WebElement att_data = driver.findElement(By.xpath("//*[@id=\"tab_4\"]/div/div/div[2]/div[1]/div[2]"));
		System.out.println("Attendance: " + att_data.getText());
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
	}

}
