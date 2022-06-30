package com.anadoluSigorta.pages;

import com.anadoluSigorta.utilities.BrowserUtils;
import com.anadoluSigorta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage{

    @FindBy(id = "quantity_wanted")
    private WebElement productQtyInput;

    @FindBy(name = "Submit")
    private WebElement addToCartBtn;

    @FindBy(id = "layer_cart")
    private WebElement popUpLayer;

    @FindBy(css = "[title='Close window']")
    private WebElement layerCloseBtn;

    @FindBy(css = "[title='View my shopping cart']")
    public WebElement cartDDMenu;

    @FindBy(id = "button_order_cart")
    private WebElement checkoutBtn;

    public void setProductCount(String productCount) {
        productQtyInput.clear();
        productQtyInput.sendKeys(productCount);
    }

    public void addProductsToCart() {
        addToCartBtn.click();
        BrowserUtils.waitForVisibility(popUpLayer,10);
        layerCloseBtn.click();
    }

    public void goToShoppingCart() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(cartDDMenu).perform();
        checkoutBtn.click();
    }
}
