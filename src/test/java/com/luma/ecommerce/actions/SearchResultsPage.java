package com.luma.ecommerce.actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".page-title")
    WebElementFacade searchResultsTitle;

    public String getSearchResultsTitle() {
        return searchResultsTitle.getText();
        //return $(".page-title").getText();
    }


}
