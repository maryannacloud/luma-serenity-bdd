package com.luma.ecommerce.tests.cart;

import com.luma.ecommerce.pageobjects.CartActions;
import com.luma.ecommerce.actions.NavigationActions;
import com.luma.ecommerce.pageobjects.ProductItemActions;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayingItemsInCartTest extends UIInteractions{

    @Steps
    NavigationActions navigate;

    @Steps
    CartActions cart;

    @Steps
    ProductItemActions productItem; // these are actions that we perform on product items

    @Test
    void shouldDisplayNoItemsMessageIfCartIsEmpty(){
        navigate.toTheApplication();
        cart.showCartSummary();
        waitForTextToAppear( "You have no items in your shopping cart.");
    }

    @Test
    void shouldBeAbleToAddSingleItemToCart(){
        navigate.toTheApplication();

        productItem.addItemToCart("Push In Messenger Bag");

        assertThat(cart.itemsInCart()).contains("Push In Messenger Bag");
    }

    @Test
    void shouldBeAbleToAddMultipleItemsToCart(){
        navigate.toTheApplication();
        productItem.addItemToCart("Push In Messenger Bag");

        navigate.toTheApplication();
        productItem.addItemToCart("Hero Hoodie", "M", "Gray");

        assertThat(cart.itemsInCart()).contains("Hero Hoodie", "Push In Messenger Bag");
    }
}
