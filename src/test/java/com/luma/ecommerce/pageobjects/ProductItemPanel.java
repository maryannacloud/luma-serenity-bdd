package com.luma.ecommerce.pageobjects;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.screenplay.ui.Image;

public class ProductItemPanel extends PageComponent {

    public void selectItem(String itemName) {
        $(Image.withAltText(itemName)).click();
    }

    public void selectItem(String itemName, String size, String color) {
        $(Image.withAltText(itemName)).click();
        $(".search-option[option-label={0}]", size).click();
        $(".search-option[option-label={0}]", color).click();
    }
}
