public class webpagetest {
    



    package seleniumTest.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver", "/Users/suprajakosuri/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://northeastern.instructure.com/calendar#view_name=month&view_start=2023-03-21");
		System.out.println(driver.getTitle());
		
 WebElement   nuid= driver.findElement(By.id("username"));
 nuid.sendKeys("kosuri.sa");

 
 WebElement   password= driver.findElement(By.id("password"));
 password.sendKeys("Parasharyand@09");

 
 driver.findElement(By.xpath("/html/body/section/div/div[1]/div/form/div[3]/button")).click();
 
Thread.sleep(5000);

//WebElement addToCal = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("create_new_event_link")));
//addToCal.click();

 
// WebElement   addToCal= driver.findElement(By.id("create_new_event_link"));
// addToCal.click();
//////  driver.findElement(By.id("create_new_event_link")).click();
// Thread.sleep(2000);
// 
 driver.findElement(By.xpath("//*[@id=\"create_new_event_link\"]")).click();

 Thread.sleep(1000);
//  
//  WebElement   tittlefield= driver.findElement(By.id("uPeVgKngVyCY"));
//  tittlefield.sendKeys("class presenation");
//  Thread.sleep(2000);
//  
//  WebElement   datefield= driver.findElement(By.id("u2eebjTm632k"));
//  datefield.sendKeys("Fri, Mar 31, 2023");
//  Thread.sleep(2000);
//  
//  WebElement   timefieldFrom= driver.findElement(By.id("uxsgGsZDjpz3"));
//  timefieldFrom.sendKeys("12:00 PM");
//  Thread.sleep(2000);
//  
//  WebElement   timefieldTo= driver.findElement(By.id("uTDY3UenuTn7"));
//  timefieldTo.sendKeys("8:00 PM");
//  Thread.sleep(20000);
//  
//  WebElement   location= driver.findElement(By.id("uGVCCUTzgVLf"));
//  location.sendKeys("Dodge Hall");
//  Thread.sleep(2000);
//  
//  driver.findElements(By.xpath("//*[@id=\"edit_calendar_event_form_holder\"]/form/fieldset/span/span/span/span/span/span/span[6]/span/span[2]/button")).get(0).click();
//  Thread.sleep(2000);
 
  
  

  
 
 driver.quit();
	}
}

}
