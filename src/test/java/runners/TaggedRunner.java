package runners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
				publish = true,
		features = "src//test//resources//taggedfeatures//",
		glue = {"stepDefs"},
		dryRun=false,                  // check the steps of feature and step def file
		monochrome=true,
//		tags="@RegressionTest",
//		tags="@SmokeTest",
//		tags="@RegressionTest or @SmokeTest",
//		tags="@RegressionTest and @SmokeTest",
//		tags="not @RegressionTest and not @SmokeTest",
//		
//				tags = "@PhaseOne and @RegressionTest " 
//				tags = "@PhaseOne and @RegressionTest or @SmokeTest" 
//				tags="@RegressionTest and not @PhaseOne"
//				tags="@PhaseOne and @RegressionTest or @PhaseTwo and @SmokeTest"
				tags="@PhaseTwo"
		
//		plugin= {"pretty",                                     //preety plugin will Give detail report
//		"usage:target/reports/usageReports",
//			"json:target/reports/jsonReport.json",
//				"junit:target/reports/junitReport.xml",
//				"html:target/reports/htmlReport.html",
//				"rerun:target/failed_scenarios.txt"                                //rerun is a plugin which gen file in case of failure it will record location of reports
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				}             
		)

public class TaggedRunner {

}
