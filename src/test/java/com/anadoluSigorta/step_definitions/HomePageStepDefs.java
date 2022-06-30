package com.anadoluSigorta.step_definitions;

import com.anadoluSigorta.pages.HomePage;
import com.anadoluSigorta.utilities.*;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;


public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @Given("user on the home page")
    public void user_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.checkPageTitleForRefresh();
    }

    @When("user click the sign-in button")
    public void user_clik_the_sign_in_button() {
        BrowserUtils.checkPageTitleForRefresh();
        BrowserUtils.waitForPageToLoad(15);
        homePage.goToLoginPage();
    }

    @Then("user verifies the successfully login")
    public void user_verifies_the_successfully_login() {
        BrowserUtils.checkPageTitleForRefresh();
        BrowserUtils.waitForPageToLoad(15);
        assertEquals(homePage.getUsername(),ConfigurationReader.get("username"));
    }

    @When("user clicks the WOMEN tab")
    public void user_clicks_the_tab() {
        homePage.clickTheWomenTab();
    }
}
