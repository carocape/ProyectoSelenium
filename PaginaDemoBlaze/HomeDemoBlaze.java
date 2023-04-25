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
	
	@FindBy(css="#signin2")
	WebElement linkInscribir;
	
	@FindBy(css="#login2")
	WebElement linkLogui;
	
	@FindBy(css="div.container:nth-child(6) div.row div.col-lg-3 div.list-group a.list-group-item:nth-child(2) font:nth-child(1) > font:nth-child(1)")
	WebElement categoriaTelefonos;	
	
	@FindBy(css="div.container:nth-child(6) div.row div.col-lg-3 div.list-group a.list-group-item:nth-child(3) font:nth-child(1) > font:nth-child(1)")
	WebElement categoriaPortatiles;
	
	@FindBy(xpath="//a[contains(text(),'Monitors')]")
	WebElement categoriaMonitores;
	
	@FindBy(css="body:nth-child(2) nav.navbar.navbar-toggleable-md.bg-inverse:nth-child(5) a.navbar-brand font:nth-child(2) > font:nth-child(1)")
	WebElement linkTienda;
	
	@FindBy(xpath="//body/div[@id='logInModal']/div[1]/div[1]/div[3]/button[1]")
	WebElement btnCancelarAlerta;
	
	///Del Div para Logearse
	@FindBy(id="loginusername")
	WebElement txtLoginName;
	@FindBy(id="loginpassword")
	WebElement txtClave;
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement btnAceptar;
	
	///Del Div para Registrarse
	@FindBy(id="sign-username")
	WebElement txtUsuario;
	@FindBy(id="sign-password")
	WebElement txtClaveRegistro;
	@FindBy(xpath="//button[contains(text(),'Sign up')]")
	WebElement btnAceptarRegistro;
	
	///Del Div para Contactarse
	@FindBy(id="recipient-email")
	WebElement txtEmail;
	
	@FindBy(id="recipient-name")
	WebElement txtNombreContacto;
	
	@FindBy(id="message-text")
	WebElement txtMensaje;
	
	@FindBy(css="body.modal-open:nth-child(2) div.modal.fade.show:nth-child(1) div.modal-dialog div.modal-content div.modal-footer > button.btn.btn-primary:nth-child(2)")
	WebElement btnEnviarMensaje;
	
	@FindBy(id="message-text")
	WebElement btnCerrarMensaje;
	
	
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
				linkInscribir.click();
				}
			public void IrLogui() {
				linkLogui.click();
				
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
			public void CancelarAlerta() {
				btnCancelarAlerta.click();
				}
			
			public void IngresarUsuario() {
				txtLoginName.sendKeys("RobertoFeo");
				txtClave.sendKeys("hhh123");
				btnAceptar.click();
			}
			
			public void InscribirUsuario() {
				txtUsuario.sendKeys("RobertoFeo");
				txtClaveRegistro.sendKeys("hhh123");
				btnAceptarRegistro.click();
			}
			
			public void EnviarMensajeContacto() {
				txtEmail.sendKeys("RobertoFeo@gmail.com");
				txtNombreContacto.sendKeys("Roberto");
				txtMensaje.sendKeys("Quiero conocer precios mayoristas");
				btnEnviarMensaje.click();
			}
			public void CerrarMensajeContacto() {
				btnCerrarMensaje.click();
			}
			
			
}
