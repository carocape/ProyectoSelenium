//Test para abrir el microfono de la pagina de Google y buscar por audio

package TestGoogle;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AbrirMicrofono {
	String url = "https://www.google.com/";
	WebDriver driver;
	
	@BeforeSuite
	public void abrirNavegador() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","use-fake-ui-for-media-stream");
		options.addExtensions(new File("..//01/Extensiones//extension_6_1_12_0.crx"));
		
	
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void abrirVoz() {
	

	WebElement lnkMicrofono = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/*[1]"));
	lnkMicrofono.click();

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.alertIsPresent());
	
	Alert alert = driver.switchTo().alert();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	alert.accept();

}
}
