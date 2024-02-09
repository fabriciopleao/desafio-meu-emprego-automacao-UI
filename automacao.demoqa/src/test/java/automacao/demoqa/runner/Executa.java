package automacao.demoqa.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import automacao.demoqa.drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features",
		glue = "automacao.demoqa.steps",
		tags = "@regressivos",
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		
		)


public class Executa extends DriversFactory{

	public static void inicializarTeste(String ambiente) {
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();
	}
	
	public static void encerrarTeste() {
		driver.quit();
	}
	
}
