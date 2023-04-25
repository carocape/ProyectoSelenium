package TestDemoBlaze;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PaginaDemoBlaze.HomeDemoBlaze;


public class Logui {

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
		HomeDemoBlaze logui = new HomeDemoBlaze(driver);
	
		logui.IrLogui();
		Thread.sleep(2000);
		logui.IngresarUsuario();
	}
		
	@AfterSuite
	public void cerrarNavegador() {
	//driver.close();
	}
}
