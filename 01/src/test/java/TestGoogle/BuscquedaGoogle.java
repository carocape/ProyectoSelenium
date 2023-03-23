package TestGoogle;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PaginaGoogle.GooglePrincipal;




public class BuscquedaGoogle {
	String url = "https://google.com.ar/";
	WebDriver driver;
	
	//File pantalla;
	//String rutaEvidencias = "..\\01\\Evidencias\\";
	//String nombreDocumento = "Evidencias PracticaAutomatizacion.docx";
	//String nombreImagenGenerica = "img.jpg";
	
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
	public void GooglePrincipal() {
		GooglePrincipal busqueda = new GooglePrincipal(driver);
		
		
		//AGREGO UNA ESPERA
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		busqueda.buscarProducto();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		busqueda.elegirElemento();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		busqueda.abrirDetallesElemento();
		driver.navigate().back();
		driver.navigate().back();
		
	
		
	
	}
	

}
