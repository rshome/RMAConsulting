package com.RMAConsulting.steps;

import com.RMAConsulting.fixtures.Reference;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;


/**
 * Created by rshome on 20/02/2017.
 */
public class PagesSteps {

    Reference refClass = new Reference();

    @Before()
    public void setUp()
    {
        refClass.Initialize();
    }

    @After()
    public void tearDown()
    {
        refClass.Exit();
    }


    @Given("^I am on the RMA Homepage$")
    public void iAmOnTheRMAHomepage() {
        // Write code here that turns the phrase above into concrete actions
        refClass.Wait();
        refClass.GoToUrl();
        refClass.MaxWindow();
        refClass.ClearCookies();
    }

    @When("^I navigate to ([^\\\"]*)$")
    public void I_navigate_to_about_us(String section) throws Throwable {
        // Express the Regexp above with the code you wish you had

        refClass.driver.navigate().to(refClass.baseUrl + section);
    }

    @Then("^I see the Page ([^\\\"]*)$")
    public void I_see_the_Page_We_are_RMA(String page) throws Throwable {
        // Express the Regexp above with the code you wish you had
        refClass.Wait();
        Assert.assertEquals(page, Reference.driver.findElement(By.xpath("//html/body/div[1]/section/div/div[1]")).getText());
    }


}
