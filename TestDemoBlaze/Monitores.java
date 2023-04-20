package TestDemoBlaze;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PaginaDemoBlaze.HomeDemoBlaze;
import Utilidades.CapturaEvidencia;

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
		
		//WebDriverWait espera = new WebDriverWait((WebDriver) navegar, Duration.ofSeconds(10));
		//espera.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Monitors')]")));
	
			
		navegar.IrMonitores();
	}
		
		
	@AfterSuite
	public void cerrarNavegador() {
		driver.close();
	}
		
		
	
	

}




