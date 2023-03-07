package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Actions act = new Actions(driver);
		
		act.click();
		act.doubleClick();
		act.contextClick();
		act.moveToElement(null);
		act.dragAndDrop(null, null);
		act.build();          //to combine multiple action in single statement
		act.perform();        //to execute single action on the browser(compulsory)
		
		
		
		
	}

}
