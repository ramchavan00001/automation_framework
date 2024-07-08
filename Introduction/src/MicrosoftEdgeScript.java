import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MicrosoftEdgeScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to invoke microsoft edge code
		System.setProperty("webdriver.edge.driver", "/Users/RAM CHAVAN/eclipse-workspac/Introduction/Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
