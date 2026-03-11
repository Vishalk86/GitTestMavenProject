package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory 
{
    public static WebDriver driver;

    public static WebDriver initDriver() 
    {

        ChromeOptions options = new ChromeOptions();

        String env = System.getenv("CI");

        if (env != null) 
          {
            // GitHub Actions / CI Environment
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");
           }

        driver = new ChromeDriver(options);
        return driver;
    }

}