import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_Logout {

	public static void main(String[] args) throws InterruptedException {
		//Sample website https://parabank.parasoft.com/parabank/index.htm 
		
		System.setProperty("WebDriver.chrome.driver", "/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.linkText("Register")).click();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		//here we will now fill the registration form and click on register button
//		Thread.sleep(6000);
//		driver.findElement(By.id("customer.firstName")).sendKeys("Ram");
//		driver.findElement(By.id("customer.lastName")).sendKeys("Chavan");
//		
//		driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr[3]/td[2]/input")).sendKeys("At post devhari");
//		
//		driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr[4]/td[2]/input")).sendKeys("Pune");
//		driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr[5]/td[2]/input")).sendKeys("Maharashtra");
//		driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr[6]/td[2]/input")).sendKeys("123456");
//		driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr[7]/td[2]/input")).sendKeys("9359032001");
//		driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr[8]/td[2]/input")).sendKeys("SSN123456");
//		driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr[10]/td[2]/input")).sendKeys("ramchavan00001");
//		driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr[11]/td[2]/input")).sendKeys("Sample@123");
//		driver.findElement(By.xpath("//form[@id='customerForm']/table/tbody/tr[12]/td[2]/input")).sendKeys("Sample@123");
//		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		//login in parabank using registerd login credentials
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ramchavan00001");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sample@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
		Thread.sleep(6000);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(4000);
		driver.close();
		
		
		

	}

}
