package com.anadoluSigorta.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    @FindBy(css = ".cart_description>p>a")
    private WebElement productName;

    @FindBy(css = ".cart_unit>.price")
    private WebElement unitPrice;

    @FindBy(css = ".cart_quantity_input.form-control.grey")
    private WebElement productQuantity;

    @FindBy(id = "total_product")
    private WebElement productTotal;

    @FindBy(id = "total_shipping")
    private WebElement shipping;

    @FindBy(id = "total_tax")
    private WebElement tax;

    @FindBy(id = "total_price")
    private WebElement totalPrice;

    public String getProductName() {
        return productName.getText();
    }


    public double getTotalProductPrice() {
        return Double.parseDouble(unitPrice.getText().substring(1,6))*Double.parseDouble(productQuantity.getAttribute("value"));
    }

    public double totalProductsPrice() {
        return Double.parseDouble(productTotal.getText().substring(1));
    }

    public String getProductQty() {
        return productQuantity.getAttribute("value");
    }

    public double totalPrice() {
        return Double.parseDouble(totalPrice.getText().substring(1));
    }

    public double getTotalPrice() {
        double shippingPrice = Double.parseDouble(shipping.getText().substring(1));
        double taxPrice = Double.parseDouble(tax.getText().substring(1));
        return shippingPrice+taxPrice+getTotalProductPrice();
    }
}
