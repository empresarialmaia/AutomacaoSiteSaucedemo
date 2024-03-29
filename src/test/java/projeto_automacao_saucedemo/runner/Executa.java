package projeto_automacao_saucedemo.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.CucumberOptions.SnippetType;
import projeto_automacao_saucedemo.driver.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "",
		tags = "@",
		dryRun = false,
		monochrome = true,
		snippets =SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-report.html"}
				
		
		
		)

public class Executa extends Driver {
	
	public static void iniciarTest(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
     public static void encerrarTest() {
	   driver.quit();
}
	
	
	
	

}
