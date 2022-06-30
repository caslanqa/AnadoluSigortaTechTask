package com.anadoluSigorta.pages;

import com.anadoluSigorta.utilities.BrowserUtils;
import com.anadoluSigorta.utilities.Driver;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class ProductSearchResultPage extends BasePage{

    @FindBy(css = ".subcategory-name")
    private List<WebElement> actualSubtitles;

    @FindBy(xpath="(//div[@class='product-container'])[5]")
    private WebElement product;

    @FindBy(xpath = "(//a[@title='View'])[5]")
    private WebElement selectedProduct;

    public List<String> getSubtitles() {
        return BrowserUtils.getElementsText(actualSubtitles);
    }

    public boolean isElementsDisplayed() {
        boolean flag = false;
        for (WebElement e : actualSubtitles){
            if (e.isDisplayed()){
                flag=true;
            }else {
                flag=false;
            }
        }
        return flag;
    }


    public void goToProductDetailPage() {
        BrowserUtils.scrollToElement(product);
        BrowserUtils.hover(product);
        selectedProduct.click();
    }
}
