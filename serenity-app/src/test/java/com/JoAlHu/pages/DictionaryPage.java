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
        System.out.println("TEST");
        searchTerms.type(number);
        System.out.println("TEST"); 
    }

    public void lookup_terms() {
        /*
        lookupButton.click();
        */
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
}