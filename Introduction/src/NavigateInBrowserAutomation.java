
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateInBrowserAutomation {

	public static void main(String [] args) throws InterruptedException
	{
		//System.setProperty("WebDriver.chrome.driver", "/Drivers/chromedriver.exe");
		//update in 4.6 version of selenium -- it is optional to use this system.setproperty method 
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		
		driver.close();
		
				
	}
	
}
