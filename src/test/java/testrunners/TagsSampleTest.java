package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/features/Tagspractice.feature","./src/test/resources/features/Tagspractice2.feature"),glue="stepdefinitions"

public class TagsSampleTest {

}
