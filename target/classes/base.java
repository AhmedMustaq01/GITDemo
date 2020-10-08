package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
	
	public WebDriver driver ;	
	public Properties prop;
	public WebDriver initilizebrowser() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Acer\\workspace\\2020ETEProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",  "C:\\Users\\Acer\\Downloads\\Chrome\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		return driver;
		
		}
	
	public String getscreenshot(String Testcasesname, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	File Source = 	ts.getScreenshotAs(OutputType.FILE);
	String Destinationfile = System.getProperty("user.dir")+"\\reports\\"+Testcasesname+ System.currentTimeMillis()+ ".png";
	FileUtils.copyFile(Source, new File(Destinationfile));
	return Destinationfile;
		
	}
	
	public void dummy()
	{
		
		System.out.println("This GIT Testing");
		System.out.println("This GIT Testing");
		System.out.println("This GIT Testing");
		System.out.println("This GIT Testing");
		System.out.println("This GIT Testing");
	}


}
