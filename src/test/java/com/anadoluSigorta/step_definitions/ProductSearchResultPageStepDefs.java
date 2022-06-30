package com.anadoluSigorta.step_definitions;

import com.anadoluSigorta.pages.ProductSearchResultPage;
import com.anadoluSigorta.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import java.util.List;

public class ProductSearchResultPageStepDefs {
    ProductSearchResultPage productSearchResultPage = new ProductSearchResultPage();

    @Then("user verifies Subcategories has following options")
    public void user_verifies_Subcategories_has_following_options(List<String> expectedSubTitles) {
        BrowserUtils.waitForPageToLoad(15);
        List<String> actualSubtitles = productSearchResultPage.getSubtitles();
        assertEquals(expectedSubTitles,actualSubtitles);
        assertTrue(productSearchResultPage.isElementsDisplayed());
    }

    @When("user click the 5nth product")
    public void user_click_the_nth_product() {
        productSearchResultPage.goToProductDetailPage();
    }
}
