package com.luma.ecommerce.tests.cart;

import com.luma.ecommerce.pageobjects.HotSellersComponent;
import com.luma.ecommerce.pageobjects.LumaHomePage;
import com.luma.ecommerce.pageobjects.ProductDetailsPage;
import com.luma.ecommerce.pageobjects.ShoppingCartComponent;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayingItemsInCartTest extends UIInteractions {

    LumaHomePage lumaHomePage;
    ShoppingCartComponent shoppingCart;
    HotSellersComponent hotSellersComponent;
    ProductDetailsPage productDetailsPage;

    @Test
    void shouldDisplayNoItemsMessageIfCartIsEmpty(){
        lumaHomePage.open();
        shoppingCart.showCartSummary();
        waitForTextToAppear( "You have no items in your shopping cart.");
    }

    @Test
    void shouldBeAbleToAddSingleItemToCart(){
        lumaHomePage.open();
        hotSellersComponent.selectItem("Push In Messenger Bag");
        productDetailsPage.addToCart();

        lumaHomePage.open();
        hotSellersComponent.selectItem("Hero Hoodie", "M", "Gray");
        productDetailsPage.addToCart();

        shoppingCart.showCartSummary();

        List<String> itemsInCart = shoppingCart.getItemsInCart();
        assertThat(itemsInCart).contains("Hero Hoodie", "Push In Messenger Bag");
    }
}
