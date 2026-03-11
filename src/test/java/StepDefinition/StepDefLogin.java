package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefLogin 
{
    static WebDriver driver;
    
    
	@Given("Login to orangehrm")
	public void login_to_orangehrm() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("This Test Case is Passed 1.");
	}
	
	@Given("Logout to orangehrm")
	public void logout_to_orangehrm() throws Exception 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		System.out.println("This Test Case is Passed 2.");
		Assert.assertTrue(false);
	}
	
	@Given("Login to practice")
	public void login_to_practice() 
	{		
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("This Test Case is Passed 3.");
	}

	@Given("Logout to practice")
	public void logout_to_practice() 
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		System.out.println("This Test Case is Passed 4.");
	}
	
//	@After
//	public void teardown(Scenario sc)
//	{
//		if(sc.isFailed()==true)
//		{
//			String fileWithpath = "E:\\Eclipse\\TestMavenProject\\Screenshots\\failedScreenshot.png";
//			
//			TakesScreenshot scrshot = (TakesScreenshot) driver;
//			File src = scrshot.getScreenshotAs(OutputType.FILE);
//			File DestFile = new File(fileWithpath);
//			
//			try 
//			{
//				FileUtils.copyFile(src, DestFile);
//			} catch (IOException e) {e.printStackTrace();	}
//		}
//	}
	
	@AfterStep
	public void addScreenshotsToExtentReport(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}
}



//WebDriverManager.chromedriver().setup();
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("https://www.facebook.com/");
//driver.quit();

//WebDriverManager.chromedriver().setup();
//driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("https://admin-demo.nopcommerce.com/login");
//driver.findElement(By.xpath("//button[@type='submit']")).click();

//Thread.sleep(3000);
//driver.findElement(By.xpath("//a[text()='Logout']")).click();


//driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
//driver.findElement(By.xpath("//button[@id='submit']")).click();



//driver.findElement(By.xpath("//a[text()='Log out']")).click();



//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//Thread.sleep(3000);
//System.out.println("This Test Case is Passed.");
//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//driver.findElement(By.xpath("//button[@type='submit']")).click();

//System.out.println("This Test Case is Passed 2.");
//driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
//driver.findElement(By.xpath("//a[text()='Logout']")).click();		




