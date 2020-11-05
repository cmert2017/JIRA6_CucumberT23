package com.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/cucumber-rerun.txt",
        glue = "com/library/step_definitions"
)
public class FailedRunner {


}
