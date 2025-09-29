package com.luma.ecommerce.tests.accounts;

import com.luma.ecommerce.actions.LoginActions;
import com.luma.ecommerce.actions.NavigationActions;
import com.luma.ecommerce.actions.RegisterAccountActions;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.jupiter.api.Test;

public class CreateAccountTest extends UIInteractions {

    @Steps
    RegisterAccountActions registerAccount;

    @Steps
    LoginActions login;

    @Steps
    NavigationActions navigate;


    @Test
    public void shouldCreateNewCustomerAccount(){

        registerAccount.forNewCustomer("Sarah-Jane", "Smith", randomEmail(), "Secret123");
        waitForTextToAppear("Thank you for registering with Main Website Store");
    }

    @Test
    void shouldBeAbleToLoginWithRegisteredAccount(){
        String email = randomEmail();
        registerAccount.forNewCustomer("Amelia", "Pond", email, "Secret123");
        login.signOut();
        navigate.toTheApplication();
        login.usingEmailAndPassword(email, "Secret123");
        waitForTextToAppear("Welcome, Amelia Pond!");
    }

    private String randomEmail(){
        return "some_random_email" + System.currentTimeMillis() + "@example.com";
    }
}
