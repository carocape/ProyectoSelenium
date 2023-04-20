package TestDemoBlaze;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PaginaDemoBlaze.HomeDemoBlaze;


public class Inscribite {

	String url = "https://www.demoblaze.com/index.html";
	WebDriver driver;
	
	@BeforeSuite
	public void abrirNavegador() {
		
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addExtensions(new File("..//01/Extensiones//extension_6_1_12_0.crx"));
				
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	//Test de Inscripción a DemoBlaze
	public void RealizarInscripcion() {
		HomeDemoBlaze inscripcion = new HomeDemoBlaze(driver);
	
		
		inscripcion.IrInscribite();
		Alert alert = driver.switchTo().alert();
		
		WebDriverWait esperar = new WebDriverWait (inscripcion, 30);
		esperar.until(ExpectedConditions.alertIsPresent());
		
		alert.dismiss();
		//alert.authenticateUsing(credentials); 
		//Loguin usuario = new Loguin(driver);
		//usuario.CargarUsuario();
	
		
}
	//@AfterSuite
	//public void cerrarNavegador() {
		//driver.close();
	//}
}
