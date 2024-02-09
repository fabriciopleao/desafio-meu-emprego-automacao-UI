package automacao.demoqa.methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import automacao.demoqa.drivers.DriversFactory;

public class Methods extends DriversFactory {

	// Metodo para escrever
	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}

	}

	// Metodo para clicar
	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}

	}

	// Metodo para realizar submit
	public void submit(By elemento, String passo) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());

		}
	}

	// Metodo para validar texto
	public void validarTexto(By element, String textoEsperado, String passo) {
		try {
			assertTrue(driver.findElement(element).getText().contains(textoEsperado));
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}

	}
	//Metodo para validar alert
	public void validarAlert(String alert, String passo) {
		try {
			String alertText = driver.switchTo().alert().getText();
			assertEquals(alert, alertText);
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());

		}
	}
	//Metodo para aceitar alert
	public void alertAccept(String passo) {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());

		}
	}
	//Metodo para cancelar alert
	public void alertDismiss(String passo) {
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());

		}
	}
	//Metodo para preencher campo de texto no alert
	public void preencherAlertPrompt(String caracter, String passo) {
		try {
			driver.switchTo().alert().sendKeys(caracter);
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());

		}
	}
	//Metodo para pressionar a tecla Enter
	public void pressionarEnter(By elemento, String passo) {
		try {
			WebElement inputElement = driver.findElement(elemento);
			inputElement.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}
	//Metodo para inserir imagem ou arquivo
	public void carregarImagens(String[] caminhosDasImagens, By campoDeArquivo, String passo) {
		try {
			for (String caminho : caminhosDasImagens) {
				WebElement inputElement = driver.findElement(campoDeArquivo);
				inputElement.sendKeys(caminho);
			}
		} catch (Exception e) {
			System.out.println("Erro no passo " + passo);
			System.out.println("Causa do erro " + e.getCause());
			System.out.println("Mensagem de erro " + e.getMessage());
		}
	}
}
