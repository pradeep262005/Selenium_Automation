package testCases;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.Camu_Login;

public class leave_TestCases extends Camu_Login {
	@Test(priority = 3, groups = { "functions" })
	public void leave() throws IOException, InterruptedException {
		String homeurl = properties.getProperty("homeurl");
		driver.navigate().to(homeurl + "leaveManagement");
		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"LvFrm\"]/div[1]/div[2]/div/button")));
		btn.click();
		Thread.sleep(1000);

		WebElement dropdown = driver.findElement(By.id("lvty"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("On Duty");
		Thread.sleep(1000);

		WebElement startdate = driver.findElement(By.id("start"));
		startdate.sendKeys("2025-07-03", Keys.TAB);
		Thread.sleep(1000);

		WebElement enddate = driver.findElement(By.id("finish"));
		enddate.sendKeys("2025-07-04", Keys.ENTER);
		Thread.sleep(1000);

		File dateerror = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/fail/error.png");
		FileHandler.copy(dateerror, dest);
		Thread.sleep(1000);

		WebElement reason = driver.findElement(By.name("info"));
		reason.sendKeys("Fever");
		Thread.sleep(1000);

		WebElement applybtn = driver.findElement(By.name("sbmtBtn"));
		applybtn.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
	}
}
