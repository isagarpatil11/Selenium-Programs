package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//1)
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		driver.manage().window().maximize();
		//2)
		System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
		driver.switchTo().frame("iframeResult");
		//3)
		WebElement visitLink = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
		visitLink.click();
		//4) Get all window handles and hold them in a List
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<>(windowHandles);       //Set to List Conversion
		
		//5)
		System.out.println("Total window number: "+windowHandlesList.size());
		
		//6)
		driver.switchTo().window(windowHandlesList.get(1));
		//7)
		System.out.println("current window handle: "+driver.getWindowHandle());
		//8)
		WebElement logo = driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
		System.out.println(logo.isDisplayed());
		//9)
		driver.switchTo().window(windowHandlesList.get(0));
		//10)
		System.out.println("current window handle: "+driver.getWindowHandle());
		//11)
		WebElement seeResultButton = driver.findElement(By.xpath("//button[@id='runbtn']"));
		System.out.println(seeResultButton.getText().contains("Run ❯"));
		
			
	}

}
