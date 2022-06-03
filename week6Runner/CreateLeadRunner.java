package week6Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java/week6Feature/CreateLead.feature", 
				 glue = "week6StepDefinition",
				 monochrome = true,
				 publish = true)			

public class CreateLeadRunner  extends AbstractTestNGCucumberTests{

}
