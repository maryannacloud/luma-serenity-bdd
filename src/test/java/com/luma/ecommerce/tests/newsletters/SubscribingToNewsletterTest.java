package com.luma.ecommerce.tests.newsletters;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ui.Button;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

@ExtendWith(SerenityJUnit5Extension.class)
public class SubscribingToNewsletterTest extends UIInteractions {

    @Test
    void shouldBeAbleToSubscribeWithValidEmail(){
        openUrl("https://magento.softwaretestingboard.com/");
        find("#newsletter").type("myemail@acme.com");
        find(Button.withText("Subscribe")).click();
    }

}
