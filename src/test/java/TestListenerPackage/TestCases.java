package TestListenerPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



//@Listeners(TestListenerPackage.ListenerClass.class)
public class TestCases 
{
	WebDriver driver;
	
	@Test
	public void login() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		System.out.println("This Test Case is Passed.");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void testFail()
	{
		System.out.println("This Test Case is Fail.");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testSkip()
	{
		System.out.println("This Test Case is Skip.");
		throw new SkipException("Skip Exception Throw....");
	}
}
