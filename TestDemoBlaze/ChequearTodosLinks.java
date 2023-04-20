package TestDemoBlaze;

import org.testng.annotations.Test;

import PaginaDemoBlaze.ChequearLinks;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.File;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class ChequearTodosLinks {
 
	WebDriver driver;
	ChequearLinks  page;
	
	@BeforeClass
	public void beforeClass() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addExtensions(new File("..//01/Extensiones//extension_6_1_12_0.crx"));
		
		driver = new ChromeDriver(options);
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
		page = new ChequearLinks(driver);
	
	}

	@Test
	public void checkingLinks() {
	
		assertTrue(page.Cheking(), "Chequeando los Links de Navegación");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
