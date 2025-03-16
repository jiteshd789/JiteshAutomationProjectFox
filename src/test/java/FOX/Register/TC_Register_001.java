package FOX.Register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Register_001 {
public static  void  main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Jitesh");
		
		driver.findElement(By.id("input-lastname")).sendKeys("Durge");
		driver.findElement(By.id("input-email")).sendKeys("Jitesh1234@yopmail.com")		;
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("78456965645");	
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}


}
