package automacao.demoqa.steps;

import automacao.demoqa.pages.StudentFormPage;
import automacao.demoqa.runner.Executa;
import automacao.demoqa.utils.TestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentFormTest {

	StudentFormPage page = new StudentFormPage();
	TestData td = new TestData();

	@Given("que esteja na aba do formulario")
	public void queEstejaNaAbaDoFormulario() {
		Executa.inicializarTeste(td.urlStudentForm);
	}

	@When("preencher primeiro nome")
	public void preencherPrimeiroNome() {
		page.preencherCampoNome();
	}

	@When("preencher sobrenome")
	public void preencherSobrenome() {
		page.preencherCampoSobrenome();
	}

	@When("preecher email valido")
	public void preecherEmailValido() {
		page.preencherEmailValido();
	}

	@When("selecionar genero")
	public void selecionarGenero() {
		page.selecionarGenero();
	}

	@When("preencher numero de telefone com dez digitos")
	public void preencherNumeroDeTelefoneComDezDigitos() {
		page.preencherNumeroTelefoneValido();
	}

	@When("selecionar data de aniversario")
	public void selecionarDataDeAniversario() {
		page.selecionarAniversario();
	}

	@When("selecionar uma das opcoes de assunto")
	public void selecionarUmaDasOpcoesDeAssunto() {
		page.selecionarAssunto();
	}

	@When("selecionar hobbie")
	public void selecionarHobbie() {
		page.selecionarHobbie();
	}

	@When("selecionar imagem")
	public void selecionarImagem() {
		page.selecionarImagem();
	}

	@When("preencher endereco")
	public void preencherEndereco() {
		page.preencherEndereco();
	}

	@When("selecionar estado")
	public void selecionarEstado() {
		page.selecionarEstado();
	}

	@When("selecionar cidade")
	public void selecionarCidade() {
		page.selecionarCidade();
	}

	@When("clicar em enviar")
	public void clicarEmEnviar() {
		page.enviarFormulario();
	}

	@Then("inscricao feita com sucesso")
	public void inscricaoFeitaComSucesso() {
		page.validarInformacoes();
		Executa.encerrarTeste();
	}

	@When("preecher email invalido")
	public void preecherEmailInvalido() {
		page.preencherEmailInvalido();
	}

	@When("preencher numero de telefone com menos de dez digitos")
	public void preencherNumeroDeTelefoneComMenosDeDezDigitos() {
		page.preencherNumeroTelefoneInvalido();
	}

	@Then("sistema retorna com avisos de erro")
	public void sistemaRetornaComAvisosDeErro() {
		Executa.encerrarTeste();
	}

	@Given("nao preencher campos obrigatorios")
	public void naoPreencherCamposObrigatorios() {
		
	}

}
