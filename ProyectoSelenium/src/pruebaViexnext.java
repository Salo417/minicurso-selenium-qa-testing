import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class pruebaViexnext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(); 	// Abrir navegador
		driver.manage().window().maximize();	// Maximizar navegador
		driver.get("https://www.viewnext.com/");	// Ir a sitio web
		
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Quiénes somos')]")); 	//Localizar botón "Quiénes somos"
		element.click();																//Click en botón
		
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//a[contains(text(),'Contacto')]")); 	//Localizar bot�n "Contacto"
		element.click();																//Click en bot�n
		
		Thread.sleep(1000);
		Select desplegable = new Select (driver.findElement(By.id("area_vn")));
		desplegable.selectByVisibleText("Certificados");
		Thread.sleep(1000);
		element = driver.findElement(By.id("nombre")); 
		element.sendKeys("Diego Gil Márquez");	
		Thread.sleep(1000);
		element = driver.findElement(By.id("email")); 
		element.sendKeys("dgilm@viexnext.com");	
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//div/label[contains(text(),'Mensaje')]/../div/textarea"));
		element.sendKeys("Esto es un texto de pruebas");
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//label[contains(text(),'Acepto la política de privacidad')]"));
		element.click();	
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//span[contains(text(),'Enviar')]"));
		element.click();	
		Thread.sleep(3000); 	// Espera 3 segundos
		/*
		String texto = driver.findElement(By.xpath("//h1")).getText(); 	//Obtener texto del t�tulo
		assert texto.equals("�Qu� significa el �rbol de la vida?");		//Verificar texto del t�tulo
		*/
	//	driver.quit();	// Cerrar navegador
	}

}
