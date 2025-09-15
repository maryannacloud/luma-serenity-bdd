package com.luma.ecommerce.tests.accounts;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.Checkbox;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.ui.Link;
import org.junit.jupiter.api.Test;

public class CreateAccountTest extends UIInteractions {

    @Test
    public void shouldCreateNewCustomerAccount(){
        openUrl("https://magento.softwaretestingboard.com/");

        find(Link.withText("Create An Account")).click();

        find(InputField.withLabel("First Name")).type("Sarah-Jane");
        find(InputField.withLabel("Last Name")).type("Smith");

        find(Checkbox.withLabel("Sign Up For Newsletter")).click();

        String email = randomEmail();

        find(InputField.withLabel("Email")).type(email);
        find(InputField.withLabel("Password")).type("Secret123");
        find(InputField.withLabel("Confirm Password")).type("Secret123");

        find(Button.withText("Create an Account")).click();
    }

    private String randomEmail(){
        return "sarah-jane.smith" + System.currentTimeMillis() + "@example.com";
    }
}
