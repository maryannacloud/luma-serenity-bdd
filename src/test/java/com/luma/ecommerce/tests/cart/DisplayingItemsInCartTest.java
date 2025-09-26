package com.luma.ecommerce.tests.cart;

import com.luma.ecommerce.pageobjects.LumaHomePage;
import com.luma.ecommerce.pageobjects.ShoppingCartComponent;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayingItemsInCartTest extends UIInteractions {

    LumaHomePage lumaHomePage;

    ShoppingCartComponent shoppingCart;

    @Test
    void shouldDisplayNoItemsMessageIfCartIsEmpty(){

        lumaHomePage.open();
        shoppingCart.showCartSummary();
        waitForTextToAppear( "You have no items in your shopping cart.");
    }

    @Test
    void shouldBeAbleToAddSingleItemToCart(){
        lumaHomePage.open();
    }


}
