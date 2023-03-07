package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScrollingAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript("window.scrollBy(0,1200)");       //Scrolling
//		
//		WebElement Eg = driver.findElement(By.xpath("//input[@id='hide-textbox']")) ;
		
//		js.executeScript("arguments[0].scrollIntoView(true);",  Eg);             //upto particular element
//		Eg.click();
		
//		js.executeScript("arguments[0].click();",  Eg);                    //click Action
		
		WebElement signIn = driver.findElement(By.xpath("(//a[text()='Sign In'])[1]"));
		js.executeScript("arguments[0].click();",  signIn);
		Thread.sleep(2000);
		
		WebElement emailId = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		
		js.executeScript("arguments[0].value='sagarpatil278@gmail.com'", emailId);
		
	}

}
