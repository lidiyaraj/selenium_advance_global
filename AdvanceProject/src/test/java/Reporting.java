import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.ListenerImplementation;
//import GenericUtility.ListnerImplementation;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListenerImplementation.class)

public class Reporting {
@Test
	public void demo()
	{
		ListenerImplementation listen=new ListenerImplementation();
		listen.logger.log(Status.PASS, "it is passed");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com/");
		//assertEquals(false, true);
	}
}
