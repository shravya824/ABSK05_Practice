package Utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	public static String browsername;
	
	
	public static WebDriver initializeDriver()
	{
		try {
			browsername=FetchDataFromProperty.readDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}
		
		
		if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}
		
		return driver;
		
		}
	
	public static void 	getTitle()
	{
	
	String title=driver.getTitle();
	System.out.println(title);
	}
	
	public static void addImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
//	
//	public static void addHardCodedwait() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
