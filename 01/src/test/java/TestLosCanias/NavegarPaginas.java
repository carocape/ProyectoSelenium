//Este Test es para comprobar la navegabilidad del sitio a todas sus páginas
package TestLosCanias;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PaginaLosCanias.Home;
import Utilidades.CapturaEvidencia;

public class NavegarPaginas {
	String url = "https://tienda.loscanias.com.ar/";
	WebDriver driver;
	
	File pantalla;
	String rutaEvidencias = "..\\01\\Evidencias\\";
	String nombreDocumento = "Evidencias PracticaAutomatizacion.docx";
	String nombreImagenGenerica = "img.jpg";
	
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
	@SuppressWarnings("deprecation")
	@Test
	//Test que verifica la navegabilidad del sitio desde la pagina principal 
	//a: Contacto, Quienes Somos, Guia de Talles, Como Comprar, Seguimiento de Envio
	public void Home() throws InvalidFormatException, IOException, InterruptedException {
		Home navegar = new Home(driver);
		
		//AGREGO UNA ESPERA
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegar.cerrarPopup();
		
		
		//AGREGO UNA ESPERA
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegar.aceptarCookies();
			
		navegar.comoComprar();
		// Captura de Pantalla
				CapturaEvidencia.escribirTituloEnDocumento(
													rutaEvidencias + nombreDocumento, 
													"Evidencias - Practica Automatización", 
													18);	
				
				CapturaEvidencia.capturarPantallaEnDocumento(
													driver, 
													rutaEvidencias + nombreImagenGenerica, 
													rutaEvidencias + nombreDocumento, 
													"Paso 1: Ingreso a CÓMO COMPRAR");
		
		
		driver.navigate().back();
		
		navegar.quienesSomos();
		// Captura de Pantalla
		CapturaEvidencia.escribirTituloEnDocumento(
											rutaEvidencias + nombreDocumento, 
											"Evidencias - Practica Automatización", 
											18);	
		
		CapturaEvidencia.capturarPantallaEnDocumento(
											driver, 
											rutaEvidencias + nombreImagenGenerica, 
											rutaEvidencias + nombreDocumento, 
											"Paso 2: Ingreso a QUIENES SOMOS");
		
		driver.navigate().back();
		
		navegar.abrirContacto();
		// Captura de Pantalla
				CapturaEvidencia.escribirTituloEnDocumento(
													rutaEvidencias + nombreDocumento, 
													"Evidencias - Practica Automatización", 
													18);	
				
				CapturaEvidencia.capturarPantallaEnDocumento(
													driver, 
													rutaEvidencias + nombreImagenGenerica, 
													rutaEvidencias + nombreDocumento, 
													"Paso 3: Ingreso a CONTACTOS");
		
		driver.navigate().back();
		
		navegar.abrirGuiaTalles();
		// Captura de Pantalla
				CapturaEvidencia.escribirTituloEnDocumento(
													rutaEvidencias + nombreDocumento, 
													"Evidencias - Practica Automatización", 
													18);	
				
				CapturaEvidencia.capturarPantallaEnDocumento(
													driver, 
													rutaEvidencias + nombreImagenGenerica, 
													rutaEvidencias + nombreDocumento, 
													"Paso 4: Ingreso a GUIA DE TALLES");
		
		driver.navigate().back();

		navegar.seguimientoEnvio();
		// Captura de Pantalla
				CapturaEvidencia.escribirTituloEnDocumento(
													rutaEvidencias + nombreDocumento, 
													"Evidencias - Practica Automatización", 
													18);	
				
				CapturaEvidencia.capturarPantallaEnDocumento(
													driver, 
													rutaEvidencias + nombreImagenGenerica, 
													rutaEvidencias + nombreDocumento, 
													"Paso 5: Ingreso a SEGUIMIENTO DE ENVÍO");
		
		driver.navigate().back();
	}	
		
	@AfterSuite
	public void cerrarNavegador() {
		driver.close();
	}
		
		
	
	

}
