package com.luma.ecommerce.pageobjects;

import com.luma.ecommerce.actions.ProductDetailsActions;
import net.serenitybdd.annotations.Step;

public class ProductItemActions {

    ProductItemPanel productItemPanel;
    ProductDetailsActions productDetails;

    @Step("Add {0} to cart")
    public void addItemToCart(String itemName) {
        productItemPanel.selectItem(itemName);
        productDetails.addToCart();
    }

    @Step("Add {0} to cart with size {1} and color {2}")
    public void addItemToCart(String itemName, String size, String color) {
        productItemPanel.selectItem(itemName, size, color);
        productDetails.addToCart();
    }
}
