package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Dropdown_Listbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();               //https://courses.letskodeit.com/practice
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement listbox = driver.findElement(By.xpath("//select[@id='first']"));
		
		Select s = new Select(listbox);
		Thread.sleep(2000);
		
		s.selectByIndex(1);
		s.selectByValue("Apple");
		s.selectByVisibleText("Iphone");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		List<WebElement> options = s.getOptions();
	
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
	
		
		
		

	}

}
