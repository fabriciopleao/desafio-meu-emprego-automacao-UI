package automacao.demoqa.pages;

import automacao.demoqa.elements.ModalElements;
import automacao.demoqa.methods.Methods;
import automacao.demoqa.utils.TestData;

public class ModalPage {

	Methods metodo = new Methods();
	TestData td = new TestData();
	ModalElements el = new ModalElements();

	public void clicarSmallModal() {
		metodo.clicar(el.btnSmallModal, "Clicando em Small modal.");

	}

	public void validarSmallModal() {
		metodo.validarTexto(el.textSmall, td.textSmallModal, "Validando texto Small modal.");
		metodo.clicar(el.btnCloseSmall, "Fechando Small modal.");
	}

	public void clicarLargeModal() {
		metodo.clicar(el.btnLargeModal, "Clicando em Large modal.");

	}

	public void validarLargeModal() {
		metodo.validarTexto(el.textLarge, td.textLargeModal, "Validando texto Large modal.");
		metodo.clicar(el.btnCloseLarge, "Fechando Large modal.");
	}

}
