package PaginaDemoBlaze;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChequearLinks {
	
	private WebDriver driver;
	public ChequearLinks(WebDriver driver) {
		 this.driver=driver;
		 
	}
		
	public boolean Cheking() {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
	
		String url="";
		List<String> linksConError = new ArrayList<String>();
		List<String> linksOk= new ArrayList<String>();
		
		HttpURLConnection httpConnection = null;
		int responseConde = 200;
		
		Iterator<WebElement> it = links.iterator();
		
		while (it.hasNext()) {
			url = it.next().getAttribute("href");
			if (url==null || url.isEmpty()) {
				System.out.println(url + "url NO configurada o vacia");
				continue;
			}
			try {
				httpConnection = (HttpURLConnection) (new URL(url).openConnection());
				httpConnection.setRequestMethod("HEAD");
				httpConnection.connect();
				responseConde = httpConnection.getResponseCode();
			
				if (responseConde>400) {
					System.out.println("Error en el Link " + url);
					linksConError.add(url);
				}else {
					System.out.println("Link valido " + url);
					linksOk.add(url);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Total de Links Válidos" + linksOk.size());
		System.out.println("Total de Links con Error" + linksConError.size());
		
		if (linksConError.size()>0) {
			System.out.println("************Links con ERROR***********");
			for (int i=0; i< linksConError.size(); i++) {
				System.out.println(linksConError.get(i));
				
			}
			return false;
		}else {
			return true;
		}
	
		
	}
}
