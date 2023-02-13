package com.automatizationtest.web;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedTest {
	
	private WebDriver driver;
	//Data Browse Locator
	By registerLinkLocator = By.linkText("Registrarse");
	By registerPageLocator = By.xpath("//strong ['Registrar']");
	//Data Register page
	By registerNameLocator = By.name("RegisterForm[usuarioNombre]");
	By registerFirstLastNameLocator = By.name("RegisterForm[usuarioAPaterno]");
	By registerSecondLastNameLocator = By.name("RegisterForm[usuarioAMaterno]");
	By registerTelfLocator = By.name("RegisterForm[usuarioTelefono]");
	By registerCelLocator = By.name("RegisterForm[usuarioCelular]");
	
	By registerRFCLocator = By.name("RegisterForm[usuarioRFC]");
	By registerSocReaLocator = By.name("RegisterForm[usuarioRazonSocial]");
	By registerStreetLocator = By.name("RegisterForm[usuarioCalle]");
	By registerExtNumberLocator = By.name("RegisterForm[usuarioNumeroExterior]");
	By registerIntNumberLocator = By.name("RegisterForm[usuarioNumeroInterior]");
	By registerColonyLocator = By.name("RegisterForm[usuarioColonia]");
	By registerPostalCodeLocator = By.name("RegisterForm[usuarioCP]");
	By registerCountryLocator = By.name("RegisterForm[usuarioPais]");
	By registerStateLocator = By.name("RegisterForm[usuarioEstado]");
	By registerCityLocator = By.name("RegisterForm[usuarioCiudad]");
	
	By registerFirstNextLocator = By.id("next");
	//Data user
	By registerSecondPageLocator = By.xpath("//a ['Términos y condiciones']");
	By registerMailLocator = By.name("RegisterForm[usuarioEmail]");
	By registerPassLocator = By.name("RegisterForm[usuarioPassword]");
	By registerTermCheckLocator = By.name("tc");
	By registerSecondNextLocator = By.id("next");
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\WorkspaceEclipse\\AutomatizationWebTest\\src\\test\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://pruebadeuso.com/index.php?r=site/login");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void registerUser() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		
		if (driver.findElement(registerPageLocator).isDisplayed()) {
			
			driver.findElement(registerNameLocator).sendKeys("Paul");
			driver.findElement(registerFirstLastNameLocator).sendKeys("Govea");
			driver.findElement(registerSecondLastNameLocator).sendKeys("Nuñez");
			driver.findElement(registerTelfLocator).sendKeys("0263-4730572");
			driver.findElement(registerCelLocator).sendKeys("+56 9 965 231454");
			
			driver.findElement(registerRFCLocator).sendKeys("ALLCOM");
			driver.findElement(registerSocReaLocator).sendKeys("Allcom Chile S.A.");
			driver.findElement(registerStreetLocator).sendKeys("Andres Bello 1567");
			driver.findElement(registerExtNumberLocator).sendKeys("+56 2 754 654878");
			driver.findElement(registerIntNumberLocator).sendKeys("2 754 654878");
			driver.findElement(registerColonyLocator).sendKeys("Providencia");
			driver.findElement(registerPostalCodeLocator).sendKeys("96000");
			driver.findElement(registerCountryLocator).sendKeys("Chile");
			driver.findElement(registerStateLocator).sendKeys("Región Metropolitana");
			driver.findElement(registerCityLocator).sendKeys("Santiago");
			
			Thread.sleep(3000);
			
			driver.findElement(registerFirstNextLocator).click();
			
			Thread.sleep(2000);
			
		}
		else {
			System.out.println("Register Page was not found");
		}
		
		if(driver.findElement(registerSecondPageLocator).isDisplayed()) {
			
			driver.findElement(registerMailLocator).sendKeys("pgovea@allcom.cl");
			driver.findElement(registerPassLocator).sendKeys("330214");
			
			Thread.sleep(2000);
			
			driver.findElement(registerTermCheckLocator).click();
			
			Thread.sleep(2000);
			
			driver.findElement(registerSecondNextLocator).click();
			
			Thread.sleep(3000);
		}
		else {
			System.out.println("Second Register Page was not found");
		}
	}
}
