package automacao.demoqa.pages;

import automacao.demoqa.elements.AlertsElements;
import automacao.demoqa.methods.Methods;
import automacao.demoqa.utils.TestData;

public class AlertsPage {

	Methods metodo = new Methods();
	TestData td = new TestData();
	AlertsElements el = new AlertsElements();

	public void clicarBtnAlertSimples() {
		metodo.clicar(el.btnAlertSimples, "Clicando no botão de alert simples.");
	}

	public void clicarBtnCincoSegundos() throws InterruptedException {
		metodo.clicar(el.btnAlert5Segundos, "Clicando no botão de alert 5 segundos.");
		Thread.sleep(5000);
	}

	public void clicarBtnConfirmBox() {
		metodo.clicar(el.btnAlertConfirmBox, "Clicando no botão de alert confirm box.");
	}

	public void clicarBtnPromptBox() {
		metodo.clicar(el.btnAlertPromptBox, "Clicando no botão de alert prompt box.");
	}

	public void validarAlertSimples() {
		metodo.validarAlert("You clicked a button", "Validando alert simples.");
	}

	public void validarAlertCincoSegundos() {
		metodo.validarAlert("This alert appeared after 5 seconds", "Validando alert de cinco segundos.");
	}

	public void validarAlertConfirmBoxOk() {
		metodo.validarAlert("Do you confirm action?", "Validando alert de confirmação.");
		metodo.alertAccept("Confirmando alert com botão OK.");
		metodo.validarTexto(el.confirmResult, "You selected " + "Ok", "Validando alert confirm box ok.");
	}

	public void validarAlertConfirmBoxCancelar() {
		metodo.validarAlert("Do you confirm action?", "Validando alert de confirmação.");
		metodo.alertDismiss("Cancelando alert com botão CANCELAR.");
		metodo.validarTexto(el.confirmResult, "You selected " + "Cancel", "Validando alert confirm box cancelar.");
	}

	public void validarAlertPromptBox() {
		metodo.validarAlert("Please enter your name", "Validando alert de prompt.");
		metodo.preencherAlertPrompt(td.caracteresPrompt, "Preenchendo prompt box.");
		metodo.alertAccept("Confirmando alert com botão OK.");
		metodo.validarTexto(el.promptResult, "You entered " + "E2E Treinamentos 123 .", "Validando resultado prompt box.");
	}

	public void validarAlertPromptBoxEmBranco() {
		metodo.validarAlert("Please enter your name", "Validando alert de prompt.");
		metodo.alertAccept("Confirmando alert com botão OK com campo em branco.");

	}

}
