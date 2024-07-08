import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class StaticDropdownHandling {
	
	public static void main(String [] args)
	{
		System.setProperty("WebDriver.chrome.driver", "/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement statDD=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown=new Select(statDD);
		dropdown.selectByIndex(1); //this will select option1 from DD
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("Option2"); //this will select option2
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("option3");  // this will select option3
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		
		driver.close();
		
		
	}

}
