package testCases;

import org.testng.annotations.Test;
import java.time.Duration;
<<<<<<< HEAD
=======

>>>>>>> d5334f1a1f2845d7f4f5d0c722385b1acf8c151c
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.Camu_Login;

public class attendance_TestCases extends Camu_Login {
<<<<<<< HEAD
	@Test(priority = 2, groups = { "functions" },invocationCount=4)
	public void attendance() throws InterruptedException {
		String homeurl = properties.getProperty("homeurl");
		driver.navigate().to(homeurl + "attendance");
		Thread.sleep(1000);
=======
	@Test(priority = 2, groups = { "functions" })
	public void attendance() {
		String homeurl = properties.getProperty("homeurl");
		driver.navigate().to(homeurl + "attendance");
		slowDown(1000);
>>>>>>> d5334f1a1f2845d7f4f5d0c722385b1acf8c151c

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement tab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='OVER ALL']")));
		tab.click();
<<<<<<< HEAD
		Thread.sleep(1000);

		WebElement att_data = driver.findElement(By.xpath("//*[@id=\"tab_4\"]/div/div/div[2]/div[1]/div[2]"));
		System.out.println("Attendance: " + att_data.getText());
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
=======
		slowDown(1000);

		WebElement att_data = driver.findElement(By.xpath("//*[@id=\"tab_4\"]/div/div/div[2]/div[1]/div[2]"));
		System.out.println("Attendance: " + att_data.getText());
		slowDown(1000);

		driver.navigate().back();
		slowDown(1000);
>>>>>>> d5334f1a1f2845d7f4f5d0c722385b1acf8c151c
	}

}
