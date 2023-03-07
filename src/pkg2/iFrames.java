package pkg2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
//1)count iframe on Webpage
		List<WebElement> elements = driver.findElements(By.xpath("//iframe"));
		int count = driver.findElements(By.xpath("//iframe")).size();
		System.out.println("Total no of iframes: "+ count);
		
//2)Switching to parent frame
		driver.switchTo().frame("frame1");
		WebElement element =driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(element.getText());
		
//3)Switching to child frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@srcdoc,'Child Iframe')]")));
		WebElement element1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(element1.getText());
		
//4))Move to parent frame
		driver.switchTo().parentFrame();
		System.out.println(element.getText());

//5)move to main frame
		driver.switchTo().parentFrame();
		WebElement element3 = driver.findElement(By.xpath("//div[@id='framesWrapper']"));
		System.out.println(element3.getText());
	
//6)move to main frame from child
		driver.switchTo().defaultContent();
		WebElement element4 = driver.findElement(By.xpath("//div[@id='framesWrapper']"));
		System.out.println(element4.getText());
		
//7)after refreshing we are moving to child frame
		driver.navigate().refresh();
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@srcdoc,'Child')]")));
		
	}

}
