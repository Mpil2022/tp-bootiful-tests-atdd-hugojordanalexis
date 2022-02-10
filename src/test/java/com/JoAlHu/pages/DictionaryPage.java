package com.JoAlHu.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.containers.startupcheck.*;

import java.time.Duration;

import java.util.List;

@DefaultUrl("http://localhost:4200")
public class DictionaryPage extends PageObject {

    public static final DockerImageName FRONT_IMAGE = DockerImageName.parse("scherringj/angular_front:latest");
  public static final DockerImageName BACK_IMAGE = DockerImageName.parse("scherringj/test-api:latest");

    public DictionaryPage()  {
        /*
         GenericContainer<?> front = new GenericContainer<>(FRONT_IMAGE).withExposedPorts(4200);
         GenericContainer<?> back = new GenericContainer<>(BACK_IMAGE).withExposedPorts(8080);
         String address = front.getHost();
         System.out.println("----------------------" + address + "---------------------------"); */
    }

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
        /*
        WebElementFacade definition = find(By.name("currentValue"));
        System.out.println(definition.getText());
        return definition.getText();*/
        return "";
    }
}