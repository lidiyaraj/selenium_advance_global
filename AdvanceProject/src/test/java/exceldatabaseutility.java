import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.ExcelUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class exceldatabaseutility {

	ExcelUtility xlutil=new ExcelUtility();

	@Test
	public void excelData() throws InvalidFormatException, IOException, InterruptedException {
		Object[][] store = xlutil.exceldata();

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/login");
		WebElement emailTF = driver.findElement(By.id("Email"));		
		for (int i = 0; i < xlutil.rowcount; i++) {
			for (int j = 0; j <xlutil.actualRow.getPhysicalNumberOfCells(); j++) {
				//System.out.println(data[i][j]);
				emailTF.sendKeys( store[i][j].toString());
				Thread.sleep(2000);
				emailTF.clear();
			}}

	}}
