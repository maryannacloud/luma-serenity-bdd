package com.luma.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.Checkbox;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.ui.Link;

public class RegisterAccountActions extends UIInteractions {

    @Step("Register a new account for {0} {1} with email {2} and password {3}")
    public void forNewCustomer(String firstName,
                               String lastName,
                               String email,
                               String password) {
        openUrl("https://magento.softwaretestingboard.com/");
        $(Link.withText("Create an Account")).click();

        $(InputField.withLabel("First Name")).type(firstName);
        $(InputField.withLabel("Last Name")).type(lastName);

        $(Checkbox.withLabel("Sign Up for Newsletter")).click();

        $(InputField.withLabel("Email")).type(email);
        $(InputField.withLabel("Password")).type(password);

    }
}
