package pkg3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testReddifAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//set system property, so that we can access chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		 
		// It will open the Chrome browser and execute your logic
		WebDriver driver = new ChromeDriver();
		 
		//Open rediff page in chrome browser
		driver.get("https://www.rediff.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		// It will get and store the main window page handle or id
		 String mainpage = driver.getWindowHandle();
		 String subwinhandleString = null;
		//set a loop which will store all window pop up handles
		 Set<String> handle = driver.getWindowHandles();
		 Iterator<String> iterator = handle.iterator();
		while(iterator.hasNext ()) {
		subwinhandleString = iterator.next( ); 
		 }
		driver.switchTo().window(subwinhandleString);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	//	driver.close();
		 
		//Again switch back to main window
		driver.switchTo().window(mainpage);
		System.out.println(driver.getTitle());
		}
	}


