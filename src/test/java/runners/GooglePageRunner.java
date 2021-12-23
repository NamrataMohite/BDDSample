package runners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
				publish = true,
		features = "src//test//resources//features//",
		glue = {"stepDefs"},
		dryRun=false,                  // check the steps of feature and step def file
		monochrome=true,
		plugin= {"pretty",                                     //preety plugin will Give detail report
//		"usage:target/reports/usageReports",
//			"json:target/reports/jsonReport.json",
//				"junit:target/reports/junitReport.xml",
				"html:target/reports/htmlReport.html",
//				"rerun:target/failed_scenarios.txt"                                //rerun is a plugin which gen file in case of failure it will record location of reports
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}             
		)
public class GooglePageRunner {

}
