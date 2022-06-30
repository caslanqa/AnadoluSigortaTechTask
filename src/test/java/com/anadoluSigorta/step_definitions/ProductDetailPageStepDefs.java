package com.anadoluSigorta.step_definitions;

import com.anadoluSigorta.pages.ProductDetailPage;
import com.anadoluSigorta.utilities.BrowserUtils;
import com.anadoluSigorta.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ProductDetailPageStepDefs {

    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Then("user verifies the product detail page opened")
    public void user_verifies_the_product_detail_page_opened() {
        BrowserUtils.checkPageTitleForRefresh();
        BrowserUtils.waitForVisibility(productDetailPage.cartDDMenu,15);
        Assert.assertEquals(Driver.get().getTitle(),"Printed Summer Dress - My Store");
    }

    @Then("user sets the product count {string}")
    public void user_sets_the_product_count(String productCount) {
        productDetailPage.setProductCount(productCount);
    }

    @Then("user adds the product to shopping cart")
    public void user_adds_the_product_to_shopping_cart() {
        productDetailPage.addProductsToCart();
    }

    @When("user click the shopping cart button")
    public void user_click_the_shopping_cart_button() {
        productDetailPage.goToShoppingCart();
    }
}
