//import java.time.Duration;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//udemy topic 43 and 44
public class DynamicPasswordGrabingFromString {
	
	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("WebDriver.chrome.driver", "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String username ="Ram";
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(username);

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);
		
		
		
		driver.close();
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		//a[text()='Forgot your password?']
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String pwd_str=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String [] passwordArray = pwd_str.split("'");
		String password=passwordArray[1].split("'")[0]; //bcz passwordArray after spliting again gives us array and this time we need to extract 0th index so we have given [0]
		return password;
		
	}

}
