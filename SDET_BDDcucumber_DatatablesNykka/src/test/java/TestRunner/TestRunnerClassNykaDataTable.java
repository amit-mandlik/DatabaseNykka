package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features=".//FeatureNykkaFile/DataTablewithoutHeader.feature",
	glue="StepDefinitionsFile",
	dryRun=false,
	monochrome=true,
	format={"pretty","html:html report","json:json_report/cucumber.json","junit:junit_report/cucumber.xml"}
	
		
)



public class TestRunnerClassNykaDataTable 
{

}
