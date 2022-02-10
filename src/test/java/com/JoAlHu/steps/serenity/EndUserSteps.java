package com.JoAlHu.steps.serenity;

import com.JoAlHu.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

import static org.junit.Assert.*;

public class EndUserSteps {

    DictionaryPage dictionaryPage;
  
    @Step
    public void enters(String number) {
        dictionaryPage.enter_keywords(number);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        dictionaryPage.getDefinition();
        //assertThat(dictionaryPage.getDefinition(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String number) {
        dictionaryPage.getDefinition();
        enters(number);
        starts_search();
    }
}