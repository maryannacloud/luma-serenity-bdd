package com.luma.ecommerce.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductDetailsPage extends PageObject {

    @FindBy(id = "product-addtocart-button")
    WebElementFacade addToCartButton;

    @FindBy(css = ".loader")
    WebElementFacade spinner;

    public void addToCart() {
        addToCartButton.click();
        spinner.waitUntilNotVisible();
        //alternative way, we can interact directly with the Web Elements here
        //$(".loader").waitUntilNotVisible();
    }
}