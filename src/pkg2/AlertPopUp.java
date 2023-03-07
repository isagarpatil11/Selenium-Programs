package pkg2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Alert popup  
				System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demoqa.com/alerts");
				
				Thread.sleep(2000);
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//button[@id='promtButton']")).click();
				
				Thread.sleep(3000);
				
				Alert alt = driver.switchTo().alert();      //Switching to alert Popup
				
				System.out.println(alt.getText());
				
				Thread.sleep(2000);
				
				alt.sendKeys("Sagar Patil");
				
				Thread.sleep(2000);
				
//				alt.dismiss();         //For Cancel Button
				
				alt.accept();          //For Ok Button
				
				driver.findElement(By.xpath("//button[@id='alertButton']")).click();
				Alert a = driver.switchTo().alert();
				System.out.println(a.getText());
				a.accept();

	}

}
