package com.luma.ecommerce.tests.navigation;

import com.luma.ecommerce.actions.HomePageActions;
import com.luma.ecommerce.actions.MenuBarActions;
import com.luma.ecommerce.actions.NavigationActions;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class MenuBarTest extends UIInteractions {

    @Steps
    NavigationActions navigate;

    @Steps
    MenuBarActions menuBar;

    @Steps
    HomePageActions homePage;

    @Test
    public void shouldDisplayCorrectTitle(){
        navigate.toTheApplication();
        Assertions.assertThat(homePage.getTitle()).isEqualTo("Luma: An Adobe demo brand");
    }

    @Test
    public void shouldDisplayCorrectTopLevelMenuItemsOnHomePage(){
        navigate.toTheApplication();
        Assertions.assertThat(menuBar.topLevelMenuItems())
                .contains("BLOG", "MEN", "WOMEN", "EQUIPMENT", "ABOUT US", "PRODUCTS", "COMMUNITY");
    }

}
