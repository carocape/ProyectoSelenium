//Este Test, hace un recorrido desde la elección de un artículo con su talle correspondinte, 
//hasta agregarlo al carrito
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

public class InicioCompra {
	String url = "https://tienda.loscanias.com.ar/";
	WebDriver driver;
	
	File pantalla;
	String rutaEvidencias = "..\\01\\Evidencias\\";
	String nombreDocumento = "Evidencias Práctica Agregar al Carrito.docx";
	String nombreImagenGenerica = "img-carro.jpg";
	
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
	public void Home() throws InvalidFormatException, IOException, InterruptedException {
		Home inicioCompra = new Home(driver);
		inicioCompra.aceptarCookies();
		
		//AGREGO UNA ESPERA
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//body/div[@id='container']/div[3]/div[5]/div[11]/div[1]/button[1]")));
		inicioCompra.cerrarPopup();
		
		inicioCompra.abrirListaProductos();
		
		CapturaEvidencia.escribirTituloEnDocumento(
				rutaEvidencias + nombreDocumento, 
				"Evidencias - Practica Automatización", 
				18);	

CapturaEvidencia.capturarPantallaEnDocumento(
				driver, 
				rutaEvidencias + nombreImagenGenerica, 
				rutaEvidencias + nombreDocumento, 
				"Paso 1: DESPLEGAR LISTA DE CATEGORIAS");
		
		inicioCompra.elegirCategoria();
		CapturaEvidencia.escribirTituloEnDocumento(
				rutaEvidencias + nombreDocumento, 
				"Evidencias - Practica Automatización", 
				18);	

CapturaEvidencia.capturarPantallaEnDocumento(
				driver, 
				rutaEvidencias + nombreImagenGenerica, 
				rutaEvidencias + nombreDocumento, 
				"Paso 2: ELIGE UNA CATEGORIA");
		
		inicioCompra.elegirTalle();
		CapturaEvidencia.escribirTituloEnDocumento(
				rutaEvidencias + nombreDocumento, 
				"Evidencias - Practica Automatización", 
				18);	

CapturaEvidencia.capturarPantallaEnDocumento(
				driver, 
				rutaEvidencias + nombreImagenGenerica, 
				rutaEvidencias + nombreDocumento, 
				"Paso 3: SELECCIONA EL TALLE");
		
		inicioCompra.abrirArticulo();
		CapturaEvidencia.escribirTituloEnDocumento(
				rutaEvidencias + nombreDocumento, 
				"Evidencias - Practica Automatización", 
				18);	

CapturaEvidencia.capturarPantallaEnDocumento(
				driver, 
				rutaEvidencias + nombreImagenGenerica, 
				rutaEvidencias + nombreDocumento, 
				"Paso 4: SELECCIONA PRODUCTO");
		
		
		inicioCompra.agregarCarrito();
		CapturaEvidencia.escribirTituloEnDocumento(
				rutaEvidencias + nombreDocumento, 
				"Evidencias - Practica Automatización", 
				18);	

CapturaEvidencia.capturarPantallaEnDocumento(
				driver, 
				rutaEvidencias + nombreImagenGenerica, 
				rutaEvidencias + nombreDocumento, 
				"Paso 5: AGREGA AL CARRITO");
		
		inicioCompra.elegirRetiroLocal();
		CapturaEvidencia.escribirTituloEnDocumento(
				rutaEvidencias + nombreDocumento, 
				"Evidencias - Practica Automatización", 
				18);	

CapturaEvidencia.capturarPantallaEnDocumento(
				driver, 
				rutaEvidencias + nombreImagenGenerica, 
				rutaEvidencias + nombreDocumento, 
				"Paso 6: SELECCIONA RETIRA EN LOCAL");
		
		inicioCompra.iniciarCompra();
		CapturaEvidencia.escribirTituloEnDocumento(
				rutaEvidencias + nombreDocumento, 
				"Evidencias - Practica Automatización", 
				18);	

CapturaEvidencia.capturarPantallaEnDocumento(
				driver, 
				rutaEvidencias + nombreImagenGenerica, 
				rutaEvidencias + nombreDocumento, 
				"Paso 7: INICIO DE COMPRA");
		
		
	}	
	
	@AfterSuite
	public void cerrarNavegador() {
		driver.close();
	}
		
		

}
