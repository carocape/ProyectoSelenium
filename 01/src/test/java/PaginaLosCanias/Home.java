package PaginaLosCanias;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	// Atributos => Elementos Web
	
	@FindBy(xpath="//header/div[1]/div[1]/div[2]/form[1]/input[1]")
	WebElement txtbuscar;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[2]/form[1]/button[1]/*[1]")
	WebElement iconlupa;
	
	@FindBy(linkText="Cómo comprar")
	WebElement lkncomocomprar;
	
	@FindBy(linkText="Quiénes Somos")
	WebElement lknquienessomos;
	
	@FindBy(linkText="Contacto")
	WebElement lkncontacto;
	
	@FindBy(linkText="Seguimiento de tu envío")
	WebElement lknseguimientoenvio;
	
	@FindBy(linkText="Guía de talles")
	WebElement lknguiadetalles;
	
	@FindBy(id="news-popup-form-container")
	public
	WebElement divpopup;
	
	@FindBy (xpath="//body/div[@id='container']/div[3]/div[5]/div[11]/div[1]/button[1]")
	public
	WebElement btncerrarpopup;
	
	@FindBy (xpath="//a[contains(text(),'Entendido')]")
	WebElement btnaceptarcookies;
	
	@FindBy(linkText="Productos")
	WebElement lnkproductos;
	
	@FindBy(xpath="//body/div[@id='container']/div[3]/div[5]/div[6]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")
	WebElement categoriaproducto;
	
	@FindBy (xpath="//body/div[@id='container']/div[3]/div[5]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/label[7]/span[1]/span[1]")
	WebElement talle;
	
	@FindBy (xpath="//body/div[@id='container']/div[3]/div[5]/div[6]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/picture[1]/img[1]")
	WebElement articulo;
	
	@FindBy(xpath="//body/div[@id='container']/div[3]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/div[1]/input[1]")
	WebElement btnagregarcarrito;
	
	@FindBy(xpath="//body/div[@id='container']/form[@id='ajax-cart-details']/div[1]/div[4]/div[1]/div[6]/div[1]/div[2]/ul[1]/li[1]/label[1]/span[1]/div[1]/span[1]/span[1]")
	WebElement retirarenlocal;
	
	@FindBy(xpath="//body/div[@id='container']/form[@id='ajax-cart-details']/div[1]/div[4]/div[1]/div[8]/div[3]/input[1]")
	WebElement btniniciarcompra;
	
	
	// Constructor
		public Home (WebDriver driver) {
			// Inicializar todos los elementos web que esten definidos en esta pagina
			PageFactory.initElements(driver, this); 
		
		}

		// Metodos => Acciones sobre los Elementos Web
		
		public void comoComprar() {
			lkncomocomprar.click();
			
		}
		
		public void quienesSomos() {
			lknquienessomos.click();
			
		}
		public void abrirContacto() {
			lkncontacto.click();
			
		}
		
		public void seguimientoEnvio() {
			lknseguimientoenvio.click();
			
		}
		public void abrirGuiaTalles() {
			lknguiadetalles.click();
			
		}
		
		public void aceptarCookies() {
			btnaceptarcookies.click();
			
		} 
		
		public void cerrarPopup() {
			btncerrarpopup.click();
		}
		public void abrirListaProductos(){
			lnkproductos.click();
		}
		
		public void elegirCategoria() {
			categoriaproducto.isSelected();
			categoriaproducto.click();
		}
		
		public void elegirTalle() {
			talle.click();
		}
		
		public void abrirArticulo() {
			articulo.click();
		}
		
		public void agregarCarrito() {
			btnagregarcarrito.click();
		}
		public void elegirRetiroLocal() {
			retirarenlocal.click();
		}
		public void iniciarCompra() {
			btniniciarcompra.click();
		}
		public void escribirArticulo (String articuloDeseado) {
			txtbuscar.clear();
			txtbuscar.sendKeys(articuloDeseado);
		}
		public  void clicLupaBuscar() {
			iconlupa.click();
		}
		


}
