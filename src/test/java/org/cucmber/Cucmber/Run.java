package org.cucmber.Cucmber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/Feature/Multiple.feature",monochrome=true,dryRun=false,glue= {"org.cucmber.Cucmber"},plugin= {"html:target"})

public class Run {

}
