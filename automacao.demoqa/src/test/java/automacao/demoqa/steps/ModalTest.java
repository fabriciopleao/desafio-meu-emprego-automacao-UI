package automacao.demoqa.steps;

import automacao.demoqa.pages.ModalPage;
import automacao.demoqa.runner.Executa;
import automacao.demoqa.utils.TestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModalTest {

	ModalPage page = new ModalPage();
	TestData td = new TestData();

	@Given("que esteja na aba de modais")
	public void queEstejaNaAbaDeModais() {
		Executa.inicializarTeste(td.urlAbaModal);
	}

	@When("clicar no botao small modal")
	public void clicarNoBotaoSmallModal() {
		page.clicarSmallModal();
	}

	@When("validar texto do small modal")
	public void validarTextoDoSmallModal() {
		page.validarSmallModal();
	}

	@When("clicar no botao large modal")
	public void clicarNoBotaoLargeModal() {
		page.clicarLargeModal();
	}

	@When("validar texto do large modal")
	public void validarTextoDoLargeModal() {
		page.validarLargeModal();
	}

	@Then("validacao do modal feita com sucesso")
	public void validacaoDoModalFeitaComSucesso() {
		Executa.encerrarTeste();
	}

}
