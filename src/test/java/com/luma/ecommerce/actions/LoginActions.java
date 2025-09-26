package com.luma.ecommerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.InputField;

public class LoginActions extends UIInteractions {

    @Step("Login with email {0} and password {1}")
    public void usingEmailAndPassword(String email, String password) {
        $(InputField.withLabel("Email")).type(email);
        $(InputField.withLabel("Password")).type(password);
        $(Button.withText("Sign In")).click();

    }
}

