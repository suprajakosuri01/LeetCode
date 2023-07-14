public class working {
  
    package seleniumTest.seleniumTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver", "/Users/suprajakosuri/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://northeastern.instructure.com");
		screenShotSenarios(driver, "/Users/suprajakosuri/Desktop/selenium prj/images/beforeLoginpage.png");
		System.out.println(driver.getTitle());

		WebElement nuid = driver.findElement(By.id("username"));
		nuid.sendKeys("kosuri.sa");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Parasharyand@09");
		screenShotSenarios(driver, "/Users/suprajakosuri/Desktop/selenium prj/images/credsLoginpage.png");
		Thread.sleep(3000);
		
		
		driver.findElements(By.xpath("/html/body/section/div/div[1]/div/form/div[3]/button")).get(0).click();
		screenShotSenarios(driver, "/Users/suprajakosuri/Desktop/selenium prj/images/LoginedInmainpage.png");
		Thread.sleep(3000);
		// push notification
		driver.switchTo().frame("duo_iframe");
	 driver.findElements(By.xpath("//*[@id='auth_methods']/fieldset[1]/div[1]/button")).get(0).click();

		screenShotSenarios(driver, "/Users/suprajakosuri/Desktop/selenium prj/images/Loginsuccesspage.png");
		
		
		Thread.sleep(10000);
		
		driver.get("https://northeastern.instructure.com/calendar");
		screenShotSenarios(driver, "/Users/suprajakosuri/Desktop/selenium prj/images/caldender.png");
		
		driver.findElement(By.id("create_new_event_link")).click();
	
		Thread.sleep(5000);


		WebElement titleField = driver.findElement(By.cssSelector(".qBMHb_cwos.qBMHb_ycrn.qBMHb_EMjX"));
		screenShotSenarios(driver, "/Users/suprajakosuri/Desktop/selenium prj/images/addEventcaldender.png");
		titleField.sendKeys("class presentation");
		Thread.sleep(2000);

		WebElement dateField = driver.findElement(By.xpath("//input[@data-testid='edit-calendar-event-form-date']"));
		dateField.click();

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE);

		// Send multiple backspace keys to clear the entire date field
		int dateLength = dateField.getAttribute("value").length();
		for (int i = 0; i < dateLength; i++) {
			actions.sendKeys(Keys.BACK_SPACE);
		}

		actions.build().perform();

		Thread.sleep(3000);

		dateField.sendKeys("Fri, Mar 31, 2023");
		Thread.sleep(3000);

		WebElement timefieldFrom = driver.findElement(By.xpath("//input[@data-testid='event-form-start-time']"));
		timefieldFrom.sendKeys("12:00 PM");
		Thread.sleep(5000);

		WebElement timefieldTo = driver.findElement(By.xpath("//input[@data-testid='event-form-end-time']"));
		timefieldTo.sendKeys("8:00 PM");
		Thread.sleep(5000);

		WebElement locationField = driver.findElement(By.xpath("//input[@placeholder='Input Event Location...']"));

		locationField.sendKeys("Dodge Hall");
		Thread.sleep(2000);
		screenShotSenarios(driver, "/Users/suprajakosuri/Desktop/selenium prj/images/addEventsSuccess.png");

		driver.findElements(By.xpath(
				"//*[@id=\"edit_calendar_event_form_holder\"]/form/fieldset/span/span/span/span/span/span/span[6]/span/span[2]/button"))
				.get(0).click();
		Thread.sleep(20000);

		driver.quit();
	}
	
	public static void screenShotSenarios(WebDriver webdriver, String fileWithPath) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot screenShot = ((TakesScreenshot) webdriver);
		// Call getScreenshotAs method to create image file
		File SrcFile = screenShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
}


