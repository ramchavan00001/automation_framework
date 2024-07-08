import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StaticDropdownHandling2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bookonline.com/");
		Thread.sleep(2000L);
		driver.findElement(By.id("popover-trigger-:r1g:")).click();
		System.out.println(driver.findElement(By.xpath("//button[@id='popover-trigger-:r1g:']/div/p[2]")).getText());
		
		for(int i=0;i<4;i++)
		{
		driver.findElement(By.xpath("//button[@class='chakra-button css-161q6bu'][2]")).click();
		
		}
		
		System.out.println(driver.findElement(By.xpath("//button[@id='popover-trigger-:r1g:']/div/p[2]")).getText());
		
		

	}

}
