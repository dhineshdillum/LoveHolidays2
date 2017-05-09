package com.testerfeatures.tutorial.todos.features.steps;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by dhinesh.dillum on 09/05/17.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report"},
        features = "src/test/resources/features.loveholidays/"
)

public class runnerTest {
}
