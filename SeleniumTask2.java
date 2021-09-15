package SeleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;   

public class SeleniumTask2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("9663740646");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ap_password")).sendKeys(""); //password
		Thread.sleep(1000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Poco F1 by Xiaomi (Steel Blue, 6GB RAM, SD 845, 128GB Storage)']")).click();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.findElement(By.id("add-to-cart-button")).click();
	//	driver.findElement(By.linkText("Poco F1 by Xiaomi (Steel Blue, 6GB RAM, SD 845, 128GB Storage)")).click();
		
		Thread.sleep(3000);
		

		
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[3]")).click();
		
	
		
		
		// Thread.sleep(3000);
		driver.close();
		

	}

	
		
	}








