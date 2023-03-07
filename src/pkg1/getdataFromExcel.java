package pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver","D:\\#JAVA#\\Selenium+Project\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		
//		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
//		
//		WebElement emailId = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		
//		WebElement logincontinue = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		FileInputStream file = new FileInputStream("C:\\Users\\dell\\Desktop\\TestCases\\ApacheExcel.xlsx");
		
//	 
//    	org.apache.poi.ss.usermodel.Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
//        String data =sheet.getRow(0).getCell(0).getStringCellValue();
//           System.out.println("data from excel: "+ data);
	  for(int i=0; i<=2; i++) {
			
		for(int j=0; j<=2; j++) {
		String data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
        Thread.sleep(4000);
        System.out.print("data from excel: "+ data);
		}
		System.out.println();

		}
//		emailId.sendKeys(data);
//		password.sendKeys(data);
//		logincontinue.click();
		

	}

	}
