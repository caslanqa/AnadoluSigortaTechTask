package com.anadoluSigorta.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*This page contains
* Locaters of Web Elements
* methods for relevant actions
* */
public class HomePage extends BasePage{

    @FindBy(css = ".sf-js-enabled.sf-arrows>li:nth-child(1)")
    private WebElement womenTab;


    public void clickTheWomenTab() {
        womenTab.click();
    }
}
