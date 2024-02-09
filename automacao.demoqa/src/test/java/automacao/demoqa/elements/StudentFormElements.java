package automacao.demoqa.elements;

import org.openqa.selenium.By;

public class StudentFormElements {
	
	// Campos de nome, sobrenome e email
	public By firstName = By.id("firstName");
	public By lastName = By.id("lastName");
	public By email = By.id("userEmail");
	
	// Campos de genero
	public By genderMale = By.xpath("//label[normalize-space()=\"Male\"]");
	public By genderFemale = By.xpath("//label[normalize-space()=\"Famale\"]");
	public By genderOther = By.xpath("//label[normalize-space()=\"Other\"]");
	
	// Campo de telefone
	public By mobileNumber = By.id("userNumber");
	
	//Campo de data de aniversario
	public By dateBirthCampo = By.id("dateOfBirthInput");
	public By dateBirthPreencher = By.xpath("//input[@class='form-control react-datepicker-ignore-onclickoutside']");

	// Campo hobbies
	public By hobbieSports = By.xpath("//label[normalize-space()=\"Sports\"]");
	public By hobbieReading = By.xpath("//label[normalize-space()=\"Reading\"]");
	public By hobbieMusic = By.xpath("//label[normalize-space()=\"Music\"]");

	// Campo foto
	public By escolherFicheiro = By.id("uploadPicture");

	// Campo endereço
	public By currentAddress = By.id("currentAddress");

	// Seleção de estado e cidade
	public By state = By.cssSelector("#state > div > div.css-1wy0on6 > div > svg");
	public By city = By.cssSelector("#city > div > div.css-1wy0on6 > div > svg");
	public By campoState = By.xpath("//input[@id='react-select-3-input']");
	public By campoCity = By.xpath("//input[@id='react-select-4-input']");

	// Campo date birth
	public By btnMes = By.xpath("//select[@class='react-datepicker__month-select']");
	public By mesJulho = By.xpath("//*[text()='July']");
	public By dia3Julho = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--003 react-datepicker__day--weekend']");
	public By btnAno = By.xpath("//select[@class='react-datepicker__year-select']");
	public By ano2005 = By.xpath("//*[text()='2005']");

	// Campo subjects
	public By subjectsClick = By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']");
	public By campoSubject = By.xpath("//input[@id='subjectsInput']");

	// Enviar formulario
	public By btnSubmit = By.id("submit");

	// Informacoes do estudante para validacao
	public By studentName = By.xpath("//td[text()='Fabricio Leão']");
	public By studentEmail = By.xpath("//td[text()='teste@gmail.com']");
	public By gender = By.xpath("//td[text()='Male']");
	public By mobile = By.xpath("//td[text()='0123456789']");
	public By dateOfBirth = By.xpath("//td[text()='03 July,2005']");
	public By subjects = By.xpath("//td[text()='Computer Science']");
	public By hobbies = By.xpath("//td[normalize-space()='Music, Reading, Sports']");
	public By picture = By.xpath("//td[text()='helloWorld.png']");
	public By address = By.xpath("//td[text()='Rua Teste Alphaville nº01']");
	public By stateAndCity = By.xpath("//td[text()='NCR Noida']");
	
}
