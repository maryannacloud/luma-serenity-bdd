package com.luma.ecommerce.tests.navigation;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.PageElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DisplayYogaShopTest extends UIInteractions {

    @Test
    public void shouldDisplayYogaShop(){
        openUrl("https://magento.softwaretestingboard.com/");
        find(Button.withText("Shop New Yoga")).click();

        String pageTitle = find(By.xpath("//h1[@id='page-title-heading]")).getText();

        assertThat(pageTitle).isEqualTo("New Luma Yoga Collection");
    }

    @Test
    public void shouldDisplayEcoFriendlySection(){
        openUrl("https://magento.softwaretestingboard.com/");

        find(PageElement.containingText("Eco Friendly")).click();

        String pageTitle = find(By.xpath("//h1[@id='page-title-heading]")).getText();

        assertThat(pageTitle).isEqualTo("Eco Friendly");
    }
}
