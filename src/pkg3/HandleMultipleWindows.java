package pkg3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();
		System.out.println("parent window -"+ parentHandle);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	WebElement btn=	driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		
//	Actions  act = new Actions(driver);
//	act.moveToElement(btn).click().build().perform();
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", btn);
	
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles)
		{
			System.out.println("handle");
			if(!handle.equals(parentHandle))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Sagar");
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Patil");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
