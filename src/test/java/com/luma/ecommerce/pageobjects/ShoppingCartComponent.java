package com.luma.ecommerce.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCartComponent extends PageComponent {

    public static final String MINI_CART_PRODUCT_ITEM_NAME = "#mini-cart .product-item-name";
    @FindBy(css = ".showcart")
    WebElementFacade cartIcon;

    public void showCartSummary() {
        cartIcon.click();
    }

    public List<String> getItemsInCart() {
        return $$(MINI_CART_PRODUCT_ITEM_NAME).texts();
    }
}
