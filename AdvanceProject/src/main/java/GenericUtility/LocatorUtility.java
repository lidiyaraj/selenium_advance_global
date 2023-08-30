////package GenericUtility;
////
////import java.util.NoSuchElementException;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import io.github.bonigarcia.wdm.WebDriverManager;
////
////public class LocatorUtility {
////	WebElement element;
////	
////	
////	public  WebElement locator(WebDriver driver,String key) {
////	if (!(key.contains("//"))) {
////	
////		try {
////            element=driver.findElement(By.id(key));
////        } catch (Exception e) {
////            try {
////            	element=driver.findElement(By.className(key));
////            } catch (Exception e1) {
////                try {
////                	element=driver.findElement(By.tagName(key));
////                } catch (Exception e2) {
////                    try {
////                    	element=driver.findElement(By.name(key));
////                    } catch (Exception e3) {
////                        System.out.println("Element not found for locator: " + key);
////                    
////
////                }
////            }
////        }
////        }}   else {
////        	element=driver.findElement(By.xpath(key));
////
////        }
////		return element;
////		
////	}
////	public static void main(String[] args) {
////		
////	 {
////		//System.setProperty("webdriver.chrome.driver", "./selenium/chromedriver.exe");
////        WebDriverManager.chromedriver().setup();
////		WebDriver driver = new ChromeDriver();
////
////		driver.get("https://www.youtube.com/");
////		driver.manage().window().maximize();
////		//WebElement ser=driver.findElement(By.xpath("//input[@id='search']"));
////		
////		//locator(driver, search);
////		PropertyUtility prop=new PropertyUtility();
////		String key = prop.readingDataFromPropertyfile("search");
////		WebElement ele;
////		try {
////			ele = locator(driver, key);
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		ele.sendKeys("hiihiiiiiiiiiiii");
////
////	}
////	}
////}
//package GenericUtility;
//
//import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LocatorUtility {
//    public static WebElement locator(WebDriver driver, String key) {
//        WebElement element = null;
//        if (!(key.contains("//"))) {
//            try {
//                element = driver.findElement(By.id(key));
//            } catch (NoSuchElementException e) {
//                try {
//                    element = driver.findElement(By.className(key));
//                } catch (NoSuchElementException e1) {
//                    try {
//                        element = driver.findElement(By.tagName(key));
//                    } catch (NoSuchElementException e2) {
//                        try {
//                            element = driver.findElement(By.name(key));
//                        } catch (NoSuchElementException e3) {
//                        	try {
//                                element = driver.findElement(By.linkText(key));
//
//                        	}catch(NoSuchElementException e4) {
//                            System.out.println("Element not found for locator: " + key);
//                        }
//                    }
//                }
//            }
//        }
//        }else {
//            element = driver.findElement(By.xpath(key));
//        }
//        return element;
//    }
//
//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        try {
//            driver.get("https://demowebshop.tricentis.com/");
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//            PropertyUtility prop = new PropertyUtility();
//            String key = prop.readingDataFromPropertyfile("book");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//            WebElement ele = locator(driver, key);
//Thread.sleep(2000);
//           // if (ele != null) {
//                ele.click();
//          //  }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            //driver.quit(); // Close the WebDriver after the test is complete
//        }
//    }
//}
package GenericUtility;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorUtility {
    public static WebElement locator(WebDriver driver, String key) {
        WebElement element = null;
        if (!(key.contains("//"))) {
            try {
                element = driver.findElement(By.id(key));
            } catch (NoSuchElementException e) {
                try {
                    element = driver.findElement(By.className(key));
                } catch (NoSuchElementException e1) {
                    try {
                        element = driver.findElement(By.tagName(key));
                    } catch (NoSuchElementException e2) {
                        try {
                            element = driver.findElement(By.name(key));
                        } catch (NoSuchElementException e3) {
                            try {
                                element = driver.findElement(By.linkText(key));
                            } catch (NoSuchElementException e4) {
                                System.out.println("Element not found for locator: " + key);
                            }
                        }
                    }
                }
            }
        } else {
            element = driver.findElement(By.xpath(key));
        }
        return element;
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://demowebshop.tricentis.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            PropertyUtility prop = new PropertyUtility();
            String key = prop.readingDataFromPropertyfile("book");

            WebElement ele = locator(driver, key);

            if (ele != null) {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.elementToBeClickable(ele));
                ele.click();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           // driver.quit(); // Close the WebDriver after the test is complete
        }
    }
}
