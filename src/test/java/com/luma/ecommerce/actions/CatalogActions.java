package com.luma.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class CatalogActions  extends UIInteractions {

    @Step("Show product details for {0}")
    public void showProductDetails(String productName){
        $(By.linkText(productName)).click();
    }
}
