
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//firefox driver
		
		System.setProperty("webdriver.gecko.driver", "/Users/RAM CHAVAN/eclipse-workspac/Introduction/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
