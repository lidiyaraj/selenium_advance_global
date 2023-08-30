package readingJDBC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.DataBaseUtility;
import GenericUtility.readdataconstructor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingSQLdataSendingdata {
	@Test
public void logintoapp() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailTF = driver.findElement(By.id("Email"));
		DataBaseUtility utility=new DataBaseUtility();
		utility.connectionToDatabase();//"jdbc:mysql://localhost:3306/advanceselenium", "root", "root"
        List<readdataconstructor> storedata = utility.readingDataFromDatabase("SELECT * FROM student");

        for (readdataconstructor d : storedata) {
            emailTF.sendKeys(d.st_name);
				Thread.sleep(2000);
				emailTF.clear();
			}
        

			
		utility.closetheConnection();

	}
		
	}



