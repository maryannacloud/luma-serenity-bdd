package com.luma.ecommerce.tests.catalog;

import com.luma.ecommerce.actions.CatalogActions;
import com.luma.ecommerce.actions.NavigationActions;
import com.luma.ecommerce.actions.ProductDetailsActions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class ViewProductDetailsTest {

    NavigationActions navigate;
    CatalogActions fromTheCatalog;
    ProductDetailsActions productDetails;

    @Test
    void shouldDisplayTheProductDetails(){
        navigate.openTheLumaApplication();
        fromTheCatalog.showProductDetails("Fusion Backpack");
        assertThat(productDetails.getProductTitle()).isEqualTo("Fusion Backpack");
    }
}
