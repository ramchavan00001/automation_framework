import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntro {
	
	public static void main(String [] args)
	{
		//we have different driver class for different browser eg chrome, firefox safari edge etc
		// we have one interface call WebDriver which has methods related or common to all the webbrowsers
		// so we use browser specific class to implement this interface method
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/RAM CHAVAN/eclipse-workspac/Introduction/Drivers/chromedriver.exe");
		//if we comment above line of code still we get our intended result -- bcz by default selenium manager invoke chrome browser for you
		// therefore you dont have to explicitly mentioned the setproperty --
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String str = driver.getCurrentUrl();
		System.out.println(str);
		driver.close();
	}

}
