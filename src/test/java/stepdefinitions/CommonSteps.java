package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.BaseClass;
import utilities.CommonFunctions;

public class CommonSteps extends BaseClass 
{
    CommonFunctions cf;

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
}