import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class pruebaQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(); 	// Abrir navegador
		driver.manage().window().maximize();	// Maximizar navegador
		driver.get("https://demoqa.com/");	// Ir a sitio web
		System.out.println("P�gina correcta");

		driver.quit();	// Cerrar navegador
	}

}
