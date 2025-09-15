package com.luma.ecommerce.tests.navigation;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DisplayYogaShopTest extends UIInteractions {

    @Test
    public void shouldDisplayYogaShop(){
        openUrl("https://magento.softwaretestingboard.com/");
        elementWithText("Shop New Yoga").click();

        String pageTitle = find(By.xpath("//h1[@id='page-title-heading]")).getText();

        assertThat(pageTitle).isEqualTo("New Luma Yoga Collection");

    }

    @Test
    public void shouldDisplayEcoFriendlySection(){
        openUrl("https://magento.softwaretestingboard.com/");
        elementWithText("Eco Friendly").click();

        String pageTitle = find(By.xpath("//h1[@id='page-title-heading]")).getText();

        assertThat(pageTitle).isEqualTo("Eco Friendly");

    }

    private WebElementFacade elementWithText(String text) {
        return findBy("//span[contains(.,'{0}}')]", text);
    }
}
