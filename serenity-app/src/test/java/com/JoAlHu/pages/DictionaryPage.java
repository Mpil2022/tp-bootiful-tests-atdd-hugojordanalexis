package com.JoAlHu.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("http://localhost:4200")
public class DictionaryPage extends PageObject {

    @FindBy(name="addValue")
    private WebElementFacade searchTerms;

    @FindBy(name="add")
    private WebElementFacade lookupButton;

    public void enter_keywords(String number) {
        searchTerms.type(number);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public String getDefinition() {
        WebElementFacade definition = find(By.name("currentValue"));
        System.out.println(definition.getText());
        return definition.getText();
    }
}