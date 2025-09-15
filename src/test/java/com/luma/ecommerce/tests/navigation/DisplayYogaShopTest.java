package com.luma.ecommerce.tests.navigation;

import net.serenitybdd.core.steps.UIInteractions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DisplayYogaShopTest extends UIInteractions {

    @Test
    public void shouldDisplayYogaShop(){
        openUrl("https://magento.softwaretestingboard.com/");
        findBy("//span[.='{0}}']", "Shop New Yoga").click();

        String pageTitle = find(By.xpath("//h1[@id='page-title-heading]")).getText();

        assertThat(pageTitle).isEqualTo("New Luma Yoga Collection");

    }
}
