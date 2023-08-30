package driverControl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demoForSwitching {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String parentwindowID = driver.getWindowHandle();
	driver.findElement(By.xpath("(//button[@class='whButtons'])[2]")).click();
	String expectedtitle="Alert Demo";
	Thread.sleep(3000);
	WebDriverUtility utility=new WebDriverUtility();
	utility.switchtowindow(driver, parentwindowID, driver.getWindowHandles(), expectedtitle);
	//driver.close();
	utility.switchbacktomainwindow(driver, parentwindowID);
}
}