package com.luma.ecommerce.actions;

import com.luma.ecommerce.pageobjects.LumaHomePage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigationActions extends UIInteractions {

    LumaHomePage lumaHomePage;

    @Step
    public void toTheApplication(){
        lumaHomePage.open();
    }
}
