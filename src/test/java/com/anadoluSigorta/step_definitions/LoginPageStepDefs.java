package com.anadoluSigorta.step_definitions;

import com.anadoluSigorta.pages.LoginPage;
import com.anadoluSigorta.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class LoginPageStepDefs {
    LoginPage loginPage = new LoginPage();

    @Then("user verifies the login page title {string}")
    public void user_verifies_the_login_page_title(String pageSubTitle) {
        BrowserUtils.checkPageTitleForRefresh();
        BrowserUtils.waitForPageToLoad(15);
        assertEquals(pageSubTitle,loginPage.getPageSubTitle());
    }

    @Then("user signs in with valid credentials")
    public void user_signs_in_with_valid_credentials() {
        loginPage.login();
    }
}
