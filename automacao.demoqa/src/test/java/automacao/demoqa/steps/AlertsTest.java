package automacao.demoqa.steps;

import automacao.demoqa.pages.AlertsPage;
import automacao.demoqa.runner.Executa;
import automacao.demoqa.utils.TestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertsTest {

	TestData td = new TestData();
	AlertsPage page = new AlertsPage();
	Executa runner = new Executa();

	@Given("que esteja na aba de alerts")
	public void queEstejaNaAbaDeAlerts() {
		Executa.inicializarTeste(td.urlAbaAlerts);
	}

	@When("clicar no botao do alert basico")
	public void clicarNoBotaoDoAlertBasico() {
		page.clicarBtnAlertSimples();
	}

	@When("validar alert basico")
	public void validarAlertBasico() {
		page.validarAlertSimples();

	}

	@Then("validacao do alert feita com sucesso")
	public void validacaoDoAlertFeitaComSucesso() {
		Executa.encerrarTeste();
	}

	@When("clicar no botao do alert cinco segundos")
	public void clicarNoBotaoDoAlertCincoSegundos() throws InterruptedException {
		page.clicarBtnCincoSegundos();
	}

	@When("validar alert cinco segundos")
	public void validarAlertCincoSegundos() {
		page.validarAlertCincoSegundos();
	}

	@When("clicar no botao do alert de confirmacao")
	public void clicarNoBotaoDoAlertDeConfirmacao() {
		page.clicarBtnConfirmBox();
	}

	@When("validar alert de confirmacao botao ok")
	public void validarAlertDeConfirmacaoBotaoOk() {
		page.validarAlertConfirmBoxOk();
	}

	@When("validar alert de confirmacao botao cancelar")
	public void validarAlertDeConfirmacaoBotaoCancelar() {
		page.validarAlertConfirmBoxCancelar();
	}

	@When("clicar no botao do alert com caixa de prompt")
	public void clicarNoBotaoDoAlertComCaixaDePrompt() {
		page.clicarBtnPromptBox();
	}

	@When("validar alert prompt box")
	public void validarAlertPromptBox() {
		page.validarAlertPromptBox();
	}

}
