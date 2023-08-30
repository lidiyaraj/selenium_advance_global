import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtility.ScreenShotUtility;
import GenericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demologin {
	public static WebDriverUtility util=new WebDriverUtility();

	public static void main(String[] args) {

		ScreenShotUtility utility=new ScreenShotUtility();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin");
		driver.findElement(By.xpath("(//input[@value='Login'])[2]")).click();
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]")).click();
		driver.findElement(By.cssSelector("td[onclick='UnifiedSearch_SelectModuleForm(this);']")).click();
		//driver.findElement(By.linkText("Select All"));
		//driver.findElement(By.cssSelector("img[onmouseout='fnRemoveWindow();']")).click();
		//driver.findElement(By.linkText("Module")).click();
	List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<allCheckboxes.size();i++) {
	allCheckboxes.get(i).click();
	}
	WebElement apply = driver.findElement(By.cssSelector("input[class=\"crmbutton small create\"]"));
	WebDriverUtility util=new WebDriverUtility();
	util.clickingOntheElement(driver, apply);
	
	WebElement search = driver.findElement(By.className("searchBtn"));
	util.clickingOntheElement(driver, search);
//		String parent = driver.getWindowHandle();
//		Set<String> child = driver.getWindowHandles();
//		WebDriverUtility util=new WebDriverUtility();
//		util.switchtowindow(driver, parent, child, "Add Module");
//		driver.findElement(By.xpath("//*[@id='stufftitle_id']")).sendKeys("hi");
//		Set<String> child = driver.getWindowHandles();
//		for (String string : child) {
//			System.out.println(string.toString());

		
		//WebElement find = driver.findElement(By.xpath("//td[contains(text(), 'MY MODULE')]"));
		
		// Independent locator to find the table row
		//independent_locator = 

		// Find the table row
		//WebElement table_row = driver.findElement(By.xpath("//tr[@class='headerrow']"));

		//# Dependent locator to find the specific <td> element within the row
		//String dependent_locator = 

		//# Find the specific <td> element within the row
		//element = table_row.findElement(dependent_locator)

//		  WebElement element = driver.findElement(By.xpath("//b[contains(text(),'arundoc')]"));
//		
//		if (element.isDisplayed()) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			driver.findElement(By.xpath("//a[@id='deletelink']")).click();
//			
//			util.switchingToAlert(driver).accept();
//		}
	
	
	List<WebElement> selected_name = driver.findElements(By.cssSelector("b[class='big']"));
	int i=1;

for (WebElement webElement : selected_name) {
	System.out.println(webElement.getText()+"="+i);
	i++;
}	}

	}


