package pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {

		//Child Browser PopUp
		
		System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
//Child Browser Popup
		
		String mainPageAddress = driver.getWindowHandle();
		System.out.println(mainPageAddress);
		driver.switchTo().window(mainPageAddress);
		System.out.println(driver.getTitle());
		
		//Login
		WebElement emailId = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		emailId.sendKeys("sagarpatil278@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Sagar278@");
		
		WebElement loginBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		loginBtn.click();
		Thread.sleep(3000);
		
		//Product Search
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(7000);
		
		List<WebElement> mobileList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(int i=0; i<3; i++)
		{
			mobileList.get(i).click();
		}
		
		Set<String> addresses = driver.getWindowHandles();
//		List<String> addresses1 = new ArrayList<>(addresses);
//		driver.switchTo().window(addresses1.get(2));
//	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		for(String k:addresses)
		{
			System.out.println(k);
			driver.switchTo().window(k);
			try {
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			}catch(Exception e){
				System.out.println("Exception");
			}Thread.sleep(3000);
			
		}



	}

}
