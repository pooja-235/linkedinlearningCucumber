package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/restorentmenu/feature/MenuManaement.feature"},
		glue={"stepDefinationpackage"},
		tags="@RegularTest",
		plugin= {"pretty"})
public class MenuManagementTest {
	
}
