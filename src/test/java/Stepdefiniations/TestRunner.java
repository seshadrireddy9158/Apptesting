package Stepdefiniations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"Stepdefiniations"},
monochrome=true,
plugin = {"pretty","html:target/HtmlReport.html"}
)
public class TestRunner {
	//plugin = {"pretty","json:target/JSONReports/report.json"}
	
	
	}


