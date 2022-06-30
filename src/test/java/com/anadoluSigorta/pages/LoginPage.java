package com.anadoluSigorta.pages;

import com.anadoluSigorta.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = ".page-heading")
    private WebElement pageSubTitle;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;

    public String getPageSubTitle() {
        return pageSubTitle.getText();
    }

    public void login() {
        emailInput.sendKeys(ConfigurationReader.get("email"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        submitButton.click();
    }
}
