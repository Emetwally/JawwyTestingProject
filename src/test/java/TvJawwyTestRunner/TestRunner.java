package TvJawwyTestRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Basem\\eclipse-workspace\\JawwyTestingProject\\src\\test\\java\\TvJawwyFeatures\\SampleFeature.feature", //the path of the feature files
		glue={"TvJawwyStepDefinition"}, //the path of the step definition files		
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting in better format JSON/HTML/XML
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false, //to check the mapping is proper between feature file and step def file
		tags = {"@bottomtest"}
		//tags = {"@toptest , @bottomtest"}
		//please Note below while using the tags based on the requirement 
		//OR: tags = {"@toptest , @bottomtest"} -- execute all tests tagged as @toptest OR @bottomtest
		//AND: tags = {"@toptest" , "@bottomtest"} -- execute all tests tagged as @toptest AND @bottomtest
		//tags = {"~@toptest" , "~@bottomtest"}			
		)

public class TestRunner {

}
