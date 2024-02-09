package automacao.demoqa.pages;

import automacao.demoqa.drivers.DriversFactory;
import automacao.demoqa.elements.StudentFormElements;
import automacao.demoqa.methods.Methods;
import automacao.demoqa.utils.TestData;

public class StudentFormPage extends DriversFactory {


	Methods metodo = new Methods();
	TestData td = new TestData();
	StudentFormElements el = new StudentFormElements();

	public void preencherCampoNome() {
		metodo.escrever(el.firstName, td.nome, "Informando nome.");
	}

	public void preencherCampoSobrenome() {
		metodo.escrever(el.lastName, td.sobrenome, "Informando sobrenome.");
	}

	public void preencherEmailValido() {
		metodo.escrever(el.email, td.emailValido, "Informando email valido.");
	}

	public void preencherEmailInvalido() {
		metodo.escrever(el.email, td.emailInvalido, "Informando email invalido.");
	}

	public void selecionarGenero() {
		metodo.clicar(el.genderMale, "Selecionando genero masculino.");
	}

	public void preencherNumeroTelefoneValido() {
		metodo.escrever(el.mobileNumber, td.numeroTelefoneValido, "Preenchendo telefone valido.");
	}

	public void preencherNumeroTelefoneInvalido() {
		metodo.escrever(el.mobileNumber, td.numeroTelefoneInvalido, "Preenchendo telefone invalido.");
	}

	public void selecionarAssunto() {
		metodo.clicar(el.subjectsClick, "Clicando no campo subject.");
		metodo.escrever(el.campoSubject, td.assunto, "Informando assunto.");
		metodo.pressionarEnter(el.campoSubject, "Pressionando tecla Enter.");
	}

	public void selecionarAniversario() {
		metodo.clicar(el.dateBirthCampo, "Clicando no campo de date birth.");
		metodo.clicar(el.btnMes, "Clicando na seleção de meses.");
		metodo.clicar(el.mesJulho, "Selecionando o mês de julho.");
		metodo.clicar(el.btnAno, "Clicando na seleção de ano.");
		metodo.clicar(el.ano2005, "Selecionando o ano 2005.");
		metodo.clicar(el.dia3Julho, "Selecionando o dia 3.");

	}

	public void selecionarHobbie() {
		metodo.clicar(el.hobbieMusic, "Selecionando hobbie music.");
		metodo.clicar(el.hobbieReading, "Selecionando hobbie music.");
		metodo.clicar(el.hobbieSports, "Selecionando hobbie music.");
	}

	public void selecionarImagem() {
		metodo.carregarImagens(new String[] { td.caminhoDaImagem }, el.escolherFicheiro, "Carregando imagem.");

	}

	public void preencherEndereco() {
		metodo.escrever(el.currentAddress, td.endereco, "Preenchendo campo de endereço.");

	}

	public void selecionarEstado() {
		metodo.escrever(el.campoState, td.estado, "Inserindo nome do estado.");
		metodo.pressionarEnter(el.campoState, "Pressionando tecla Enter.");

	}

	public void selecionarCidade() {
		metodo.escrever(el.campoCity, td.cidade, "Inserindo nome da cidade.");
		metodo.pressionarEnter(el.campoCity, "Pressionando tecla Enter.");
	}

	public void enviarFormulario() {
		metodo.submit(el.btnSubmit, "Enviando formulario preenchido");
	}

	public void validarInformacoes() {
		metodo.validarTexto(el.studentName, td.studentName, "Validando nome completo.");
		metodo.validarTexto(el.studentEmail, td.emailValido, "Validando email.");
		metodo.validarTexto(el.gender, td.gender, "Validando genero.");
		metodo.validarTexto(el.mobile, td.numeroTelefoneValido, "Validando numero de telefone.");
		metodo.validarTexto(el.dateOfBirth, td.dateOfBirth, "Validando data de aniversario.");
		metodo.validarTexto(el.subjects, td.assunto, "Validando assunto.");
		metodo.validarTexto(el.hobbies, td.hobbies, "Validando hobbies.");
		metodo.validarTexto(el.picture, td.picture, "Validando imagem.");
		metodo.validarTexto(el.address, td.endereco, "Validando endereco.");
		metodo.validarTexto(el.stateAndCity, td.stateAndCity, "Validando estado e cidade.");
	}

}
