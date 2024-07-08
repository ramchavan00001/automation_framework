import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/RAM CHAVAN/eclipse-workspac/Introduction/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Ram");
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy"); -- correct password -- i have to capture error text
		driver.findElement(By.name("inputPassword")).sendKeys("xyz");
		driver.findElement(By.className("signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//driver.findElement(By.className("logout-btn")).click();
		
		//now click on forgot password -- using linkText as locator to identify the anchor tag 
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("tUNtUN");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("tuntun@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9011017887");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String str = driver.findElement(By.cssSelector(".infoMsg")).getText();
		System.out.println(str);
		
		driver.close();
	}

}
