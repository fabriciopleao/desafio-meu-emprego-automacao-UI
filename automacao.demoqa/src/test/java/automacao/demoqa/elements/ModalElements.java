package automacao.demoqa.elements;

import org.openqa.selenium.By;

public class ModalElements {

	public By btnSmallModal = By.id("showSmallModal");
	public By btnLargeModal = By.id("showLargeModal");
	public By btnCloseSmall = By.id("closeSmallModal");
	public By btnCloseLarge = By.id("closeLargeModal");
	public By textSmall = By.xpath("//div[text()='This is a small modal. It has very less content']");
	public By textLarge = By.xpath("//p[@class]");

}
