package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonFunctions 
{

    WebDriver driver;
    XMLReader xmlReader;

    public CommonFunctions(WebDriver driver) 
    {
        this.driver = driver;
        xmlReader = new XMLReader();
    }
    
    public String getObjectLocator(String objectName) 
    {
        String[] arr = objectName.split("##");
        String moduleName = arr[0];
        String objectKey = arr[1];
        return xmlReader.getLocator(moduleName, objectKey);        
    }

    public void openApplication(String url) 
    {
        driver.get(url);
    }
    
    public void openApplicationAs(String value)
    {
    	    driver.get(value);
    }

    public void enter(String objectName, String value) 
    {
        String xpath = getObjectLocator(objectName);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.sendKeys(value);
    }

    public void click(String objectName) 
    {
        String xpath = getObjectLocator(objectName);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        element.click();
    }
    
    public String getText(String objectName)
    {
    	    String xpath = getObjectLocator(objectName);
		return driver.findElement(By.xpath(xpath)).getText().trim();    	
    }

    public void waitForElementPresent(String objectName) 
    {
        String xpath = getObjectLocator(objectName);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
}
