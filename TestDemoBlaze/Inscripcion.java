package TestDemoBlaze;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PaginaDemoBlaze.HomeDemoBlaze;

public class Inscripcion {
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
	//Test de Logueo a DemoBlaze
	public void RealizarInscripcion() throws InterruptedException {
		HomeDemoBlaze inscribir = new HomeDemoBlaze(driver);
	
		inscribir.IrAcceso();
		Thread.sleep(2000);
		inscribir.InscribirUsuario();
		
		//Una espera, hasta que la alerta esté presente
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(20));
		myWait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String mensaje= alert.getText();
		alert.accept();
	
		System. out. println("Mensaje Alerta: "+mensaje);
		
	}
	
	@AfterSuite
	public void cerrarNavegador() {
	driver.close();
	}

}
