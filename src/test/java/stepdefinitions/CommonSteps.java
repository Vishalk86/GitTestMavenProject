package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.BaseClass;
import utilities.CommonFunctions;

public class CommonSteps extends BaseClass 
{
    CommonFunctions cf;
    public static String storedValue;

    @Given("I launch browser")
    public void launchBrowser() 
    {
        setup();
        cf = new CommonFunctions(driver);
    }

    @And("I open application")
    public void openApplication() 
    {
        cf.openApplication(config.getProperty("url"));
    }
    
    @And("I open application as {string}")
    public void openApplicationAs(String value) 
    {
        cf.openApplicationAs(value);
    }

    @When("I enter on {string} as {string}")
    public void enterText(String objectName, String value) 
    {
        cf.enter(objectName, value);
    }

    @And("I click on {string}")
    public void clickElement(String objectName) 
    {
        cf.click(objectName);
    }

    @Then("I waitForElementPresent on {string}")
    public void waitForElement(String objectName) 
    {
        cf.waitForElementPresent(objectName);
        System.out.println("Login Successful");
        //driver.quit();
    }
    
    @When("I store text from {string}")
    public void storeText(String objectName) 
    {
        storedValue = cf.getText(objectName);
        System.out.println("Stored Value = " + storedValue);
    }
    
    @When("I enter stored value in {string}")
    public void enterStoredValue(String objectName) 
    {
        cf.enter(objectName, storedValue);
    }
    
    
    //===============================================For Testing Only=====================================================
    @And("I go to Table")
    public void Table() 
    {
        List <WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-body']/div"));
        System.out.println(rows.size());
        System.out.println("Testing");
        for(WebElement row : rows) 
        {

            if(row.getText().contains("aniket Ashok")) 
            {
                row.findElement(By.xpath(".//button[i[contains(@class,'bi-pencil')]]")).click();
                break;
            }
        }
    }
    
    @And("I get data")
    public void getData() 
    {
        String data = driver.findElement(By.xpath("//div[@class='oxd-table-filter-header-title']")).getText().trim();
      	System.out.println(data);
    }
        
}