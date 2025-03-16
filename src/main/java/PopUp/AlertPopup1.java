package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("5234");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		          String jitesh = driver.switchTo().alert().getText();
		          System.out.println(jitesh);
		          
		          Thread.sleep(3000);
		          
		         driver.switchTo().alert().accept();
		       //   driver.switchTo().alert().dismiss();
		         
		         Thread.sleep(3000);
		         driver.switchTo().alert().accept();
		          
		          
		
		
		
	}

}
