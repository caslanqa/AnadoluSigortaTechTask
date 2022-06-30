package com.anadoluSigorta.pages;

import com.anadoluSigorta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".login")
    private WebElement userInfo;

    @FindBy(css = ".account")
    private WebElement accountName;

    public void goToLoginPage() {
        userInfo.click();
    }

    public String getUsername() {
        return accountName.getText();
    }
}
