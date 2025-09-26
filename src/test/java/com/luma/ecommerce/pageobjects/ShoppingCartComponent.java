package com.luma.ecommerce.pageobjects;

import net.serenitybdd.core.pages.PageComponent;
import net.thucydides.core.pages.PageObject;

public class ShoppingCartComponent extends PageComponent {

    public void showCartSummary() {
        $(".showcart").click();
    }
}
