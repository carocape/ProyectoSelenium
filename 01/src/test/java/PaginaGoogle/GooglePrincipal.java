package PaginaGoogle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GooglePrincipal {
	// Atributos => Elementos Web
	
	@FindBy(name="q")
	WebElement txtbuscar;

	@FindBy(xpath="//b[contains(text(),'patrick')]")
	WebElement elementoelegido;
	
	@FindBy(xpath="//h3[contains(text(),'Electrodomésticos - Patrick Argentina')]")
	WebElement detalleselemento;
	
	@FindBy (xpath="//body/div[@id='searchform']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[1]")
	WebElement menudeopciones;
	
	@FindBy(xpath="//a[contains(text(),'Gmail')]")
	WebElement lnkcorreo;
	
	@FindBy (xpath="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/*[1]")
	WebElement busquedavoz;
	

	// Constructor
	public GooglePrincipal (WebDriver driver) {
		// Inicializar todos los elementos web que esten definidos en esta pagina
		PageFactory.initElements(driver, this); 
	
	}

	// Metodos => Acciones sobre los Elementos Web
	
	public void buscarProducto() {
		txtbuscar.click();
		txtbuscar.sendKeys("heladera");
	}
	
	public void elegirElemento() {
		elementoelegido.click();
	}
	public void abrirDetallesElemento() {
		detalleselemento.click();
	}
	public void busquedaPorVoz() {
		busquedavoz.click();
	
		
	}
	
	public void entrarCorreo() {
		lnkcorreo.click();
	}
	
	public void entrarMenu() {
		menudeopciones.click();
		
	}

}
