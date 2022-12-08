package com.demoqa.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.demoqa.StepsDefinitions",
        features = "src/test/resources/Features/web_tables_delete.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class WebTablesDelete {
}
