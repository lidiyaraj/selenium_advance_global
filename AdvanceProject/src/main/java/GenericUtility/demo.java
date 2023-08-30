package GenericUtility;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("file:///C:/Users/dell1/Desktop/myweb.html");
			WebElement ele = driver.findElement(By.id("single"));
		WebDriverUtility uti=new WebDriverUtility();
		uti.handlingDropdown(ele, "3");
	}

}
