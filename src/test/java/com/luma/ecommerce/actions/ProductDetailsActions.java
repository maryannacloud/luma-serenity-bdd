package com.luma.ecommerce.actions;

import com.luma.ecommerce.pageobjects.ProductDetailsPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class ProductDetailsActions extends UIInteractions {

    ProductDetailsPage productDetailsPage;

    public String getProductTitle(){
        return $(" .page-title").getText();
    }

    @Step
    public void addToCart() {
        productDetailsPage.addToCart();
    }
}
