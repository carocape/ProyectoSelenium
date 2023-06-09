package TestDemoBlaze;


import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PaginaDemoBlaze.HomeDemoBlaze;


public class Monitores {
	String url = "https://www.demoblaze.com/index.html";
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

	@Test

	public void Home() throws InvalidFormatException, IOException, InterruptedException {
		HomeDemoBlaze navegar = new HomeDemoBlaze(driver);
				
		navegar.IrMonitores();
		//Thread.sleep(2000);
	}
		
		
	@AfterSuite
	public void cerrarNavegador() {
		driver.close();
	}
		
		
	
	

}




