package com.luma.ecommerce.tests.catalog;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.InputField;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchTest extends UIInteractions {

    @Test
    public void shouldDisplaySearchResults(){
        openUrl("https://magento.softwaretestingboard.com/");

        find(InputField.withPlaceholder("Search entire store here..."))
                .type("Hero Hoodie", Keys.ENTER);

        String resultTitle = find(".page-title").getText();

        assertThat(resultTitle).isEqualTo("Search results for: 'Hero Hoodie'");

    }
}
