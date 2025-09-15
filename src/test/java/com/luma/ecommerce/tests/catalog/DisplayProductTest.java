package com.luma.ecommerce.tests.catalog;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ui.Image;
import net.serenitybdd.screenplay.ui.Link;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayProductTest extends UIInteractions {

    @Test
    public void shouldBeAbleToShowProductDetailsPageFromCatalog(){
        openUrl("https://magento.softwaretestingboard.com/");

        find(By.linkText("Hero Hoodie")).click();

        String productTitle = find(By.className("page-title")).getText();
        assertThat(productTitle).isEqualTo("Hero Hoodie");
    }

    @Test
    public void shouldShowPromoCollectionDetails(){
        openUrl("https://magento.softwaretestingboard.com/");

        find(Image.withAltText("Hero Hoodie")).shouldBeVisible();
        find(Image.withAltText("Hero Hoodie")).click();

        String productTitle = find(By.className("page-title")).getText();
        assertThat(productTitle).isEqualTo("New Luma Yoga Collection");
    }

}
