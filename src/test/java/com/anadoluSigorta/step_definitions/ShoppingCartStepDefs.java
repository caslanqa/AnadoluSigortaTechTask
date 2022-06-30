package com.anadoluSigorta.step_definitions;

import com.anadoluSigorta.pages.ShoppingCartPage;
import com.anadoluSigorta.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class ShoppingCartStepDefs {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Then("user verifies the Product added to cart")
    public void user_verifies_the_Product_added_to_cart() {
        BrowserUtils.waitForPageToLoad(15);
        String expectedProduct = "Printed Summer Dress";
        String actualProduct = shoppingCartPage.getProductName();

        assertEquals(expectedProduct,actualProduct);
    }

    @Then("user verifies the following options is true Total, Total Price, Qty")
    public void user_verifies_the_following_options_is_true() {
        assertEquals(shoppingCartPage.getTotalProductPrice(),shoppingCartPage.totalProductsPrice(),0.0);
        assertEquals(shoppingCartPage.getProductQty(),"3");
        assertEquals(shoppingCartPage.getTotalPrice(),shoppingCartPage.totalPrice(),0.0);
    }

}
