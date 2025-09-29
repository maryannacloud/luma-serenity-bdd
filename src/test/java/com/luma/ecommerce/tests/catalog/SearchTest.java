package com.luma.ecommerce.tests.catalog;

import com.luma.ecommerce.actions.NavigationActions;
import com.luma.ecommerce.actions.SearchActions;
import com.luma.ecommerce.actions.SearchResultsPage;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchTest extends UIInteractions {

    @Steps
    NavigationActions navigate;

    @Steps
    SearchActions search;

    SearchResultsPage searchResultsPage;

    @Test
    public void shouldDisplaySearchResults(){
        navigate.toTheApplication();

        search.forProduct("Hero Hoodie");

        String resultTitle = searchResultsPage.getSearchResultsTitle();

        assertThat(resultTitle).isEqualTo("Search results for: 'Hero Hoodie'");
    }
}
