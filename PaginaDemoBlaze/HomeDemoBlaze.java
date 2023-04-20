//https://www.demoblaze.com/index.html

package PaginaDemoBlaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDemoBlaze {
	// Atributos => Elementos Web
	
	@FindBy(css="nav.navbar.navbar-toggleable-md.bg-inverse:nth-child(5) div.navbar-collapse ul.navbar-nav.ml-auto li.nav-item.active:nth-child(1) a.nav-link font:nth-child(1) > font:nth-child(1)")
	WebElement linkHogar;
	
	@FindBy(css="nav.navbar.navbar-toggleable-md.bg-inverse:nth-child(5) div.navbar-collapse ul.navbar-nav.ml-auto li.nav-item:nth-child(2) > a.nav-link")
	WebElement linkContacto;
	
	@FindBy(css="nav.navbar.navbar-toggleable-md.bg-inverse:nth-child(5) div.navbar-collapse ul.navbar-nav.ml-auto li.nav-item:nth-child(3) a.nav-link font:nth-child(1) > font:nth-child(1)")
	WebElement linkNosotros;
	
	@FindBy(css="nav.navbar.navbar-toggleable-md.bg-inverse:nth-child(5) div.navbar-collapse ul.navbar-nav.ml-auto li.nav-item:nth-child(4) a.nav-link font:nth-child(1) > font:nth-child(1)")
	WebElement linkCarro;
	
	@FindBy(css="nav.navbar.navbar-toggleable-md.bg-inverse:nth-child(5) div.navbar-collapse ul.navbar-nav.ml-auto li.nav-item:nth-child(5) a.nav-link font:nth-child(1) > font:nth-child(1)")
	WebElement linkAcceso;
	
	@FindBy(css="#login2")
	WebElement linkInscribite;
	
	@FindBy(css="div.container:nth-child(6) div.row div.col-lg-3 div.list-group a.list-group-item:nth-child(2) font:nth-child(1) > font:nth-child(1)")
	WebElement categoriaTelefonos;	
	
	@FindBy(css="div.container:nth-child(6) div.row div.col-lg-3 div.list-group a.list-group-item:nth-child(3) font:nth-child(1) > font:nth-child(1)")
	WebElement categoriaPortatiles;
	
	@FindBy(xpath="//a[contains(text(),'Monitors')]")
	WebElement categoriaMonitores;
	
	@FindBy(css="body:nth-child(2) nav.navbar.navbar-toggleable-md.bg-inverse:nth-child(5) a.navbar-brand font:nth-child(2) > font:nth-child(1)")
	WebElement linkTienda;
	
	
	// Constructor
	public  HomeDemoBlaze (WebDriver driver) {
		// Inicializar todos los elementos web que esten definidos en esta pagina
		PageFactory.initElements(driver, this); 
	
	}
	
	
	// Metodos => Acciones sobre los Elementos Web
			public void IrHogar() {
			linkHogar.click();
			}
			
			public void IrContacto() {
				linkContacto.click();
				}
			public void IrCarro() {
				linkCarro.click();
				}
			public void IrAcceso() {
				linkAcceso.click();
				}
			public void IrInscribite() {
				linkInscribite.click();
				}
			public void IrNosotros() {
				linkNosotros.click();
				}
			public void IrTelefonos() {
				categoriaTelefonos.click();
				}
			public void IrMonitores() {
				categoriaMonitores.click();
				}
			public void IrPortatiles() {
				categoriaPortatiles.click();
				}
			public void IrTienda() {
				linkTienda.click();
				}
			
}
