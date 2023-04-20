package PaginaDemoBlaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loguin {
	// Atributos => Elementos Web
	
		@FindBy(id="sign-username")
		WebElement loginUser;
		
		@FindBy(id="sign-password")
		WebElement loginclave;
		
		@FindBy(css="#signInModal .btn-primary > font > font")
		WebElement btnIngresar;
		
		// Constructor
		public  Loguin (WebDriver driver) {
			// Inicializar todos los elementos web que esten definidos en esta pagina
			PageFactory.initElements(driver, this); 
		
		}
		
		
		// Metodos => Acciones sobre los Elementos Web
				public void CargarUsuario() {
					loginUser.sendKeys("CarolinBB");
					loginclave.sendKeys("Nicolas");
					btnIngresar.click();
					
}
}
