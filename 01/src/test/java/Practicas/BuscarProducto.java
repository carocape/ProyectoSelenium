package Practicas;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Paginas.GooglePrincipal;




public class BuscarProducto {
	String url = "https://www.google.com/";
	WebDriver driver;
	
	@BeforeSuite
	public void abrirNavegador() {
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void GooglePrincipal() {
		GooglePrincipal busqueda = new GooglePrincipal(driver);
		
		
		//AGREGO UNA ESPERA
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		busqueda.buscarProducto();
		busqueda.elegirElemento();
		busqueda.abrirDetallesElemento();
		driver.navigate().back();
		driver.navigate().back();
		
		busqueda.busquedaPorVoz();
		//AGREGO UNA ESPERA
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//alert.dismiss(); 
		
		
	}
	

}
