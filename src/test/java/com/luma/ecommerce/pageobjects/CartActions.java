package com.luma.ecommerce.pageobjects;

import net.serenitybdd.annotations.Step;

import java.util.List;

public class CartActions {

    ShoppingCartComponent shoppingCartComponent;

    @Step("Show the shopping cart summary")
    public void showCartSummary() {
        shoppingCartComponent.showCartSummary();
    }

    @Step("View Items in the cart")
    public List<String> itemsInCart() {
        showCartSummary();
        return shoppingCartComponent.getItemsInCart();
    }

}
