package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.io.FileHandler;

public class Camu_Login {
	public static WebDriver driver=null;
	public static Properties properties=null;
	public static void loadproperty() throws IOException{
		properties=new Properties();
		FileInputStream fileInputStream=new FileInputStream("config.properties");
		properties.load(fileInputStream);
	}
	@BeforeSuite
	public void lauchbrowser() throws IOException{
		loadproperty();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void login() throws InterruptedException, IOException {
		String userinput=properties.getProperty("username");
		String passwordinput=properties.getProperty("password");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys(userinput);
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(passwordinput,Keys.ENTER);
		Thread.sleep(1000);
		File loginsuccess=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/img.png");
		FileHandler.copy(loginsuccess,dest);
	}
	@AfterSuite
	public void closeoff() {
		//driver.quit();
	}

}
