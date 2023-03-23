//El objetivo es Testear el campo de búsqueda (input donde el usuario puede tipear para buscar), 
//con diferentes opciones de artículos a buscar desde un archivo de Excel
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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PaginaLosCanias.Home;
import Utilidades.CapturaEvidencia;
import Utilidades.DatosExcel;


public class BusquedaExcel {
	String url = "https://tienda.loscanias.com.ar/";
	WebDriver driver;
	
	File pantalla;
	String rutaEvidencias = "..\\01\\Evidencias\\";
	String nombreDocumento = "BusquedaExcel.docx";
	String nombreImagenGenerica = "imgarticulo.jpg";
	
	@BeforeSuite
	public void abrirNavegador() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addExtensions(new File("..//01/Extensiones//extension_6_1_12_0.crx"));
		
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Home buscar = new Home(driver);
		buscar.aceptarCookies();
		
		//AGREGO UNA ESPERA
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		buscar.cerrarPopup();
		
		
	}

	
	@Test (dataProvider="Datos Login Excel")
	public void BusquedaMultiple(String articuloDeseado) throws InvalidFormatException, IOException, InterruptedException  {
			
		Home buscar = new Home(driver);
		
		buscar.escribirArticulo(articuloDeseado);
		buscar.clicLupaBuscar();
		
		// Captura de Pantalla
				CapturaEvidencia.escribirTituloEnDocumento(
													rutaEvidencias + nombreDocumento, 
													"Evidencias - Búsqueda de dieferentes Artículos", 
													18);	
				
				CapturaEvidencia.capturarPantallaEnDocumento(
													driver, 
													rutaEvidencias + nombreImagenGenerica, 
													rutaEvidencias + nombreDocumento, 
													"Resultado de la Búsqueda: "+articuloDeseado);
		driver.navigate().back();
		
	}
	@DataProvider(name="Datos Login Excel")
	public Object[][] obtenerDatosLoginExcel() throws Exception {
		return DatosExcel.leerExcel("..//01/Datos/Datoslogin.xlsx", "Hoja1");
	}

	@AfterSuite
	public void cerrarNavegador() {
		driver.close();
	}
	

}
