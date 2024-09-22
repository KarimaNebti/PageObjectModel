package run;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	tags="@Paiement",
	features="src/test/features",
	glue= {"hooks","stepdefinition"},
	publish = true,
	plugin= {"pretty","html:target/reportTest.html","json:target/reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class Runner {

}
