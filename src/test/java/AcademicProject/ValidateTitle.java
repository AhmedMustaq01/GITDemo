package AcademicProject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PageObjects.landingpage;
import junit.framework.Assert;
import resources.base;

public class ValidateTitle extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initilizing() throws IOException
	{
		
		driver = initilizebrowser();
		log.info("Driver is initilized Title");
		
		driver.get(prop.getProperty("url"));
	
		
	}

	@Test
	public void pagenavigation() throws IOException {
		
		landingpage l = new landingpage(driver);
		String title= l.titlecheck().getText();
		Assert.assertEquals(title, "FEATURED112121 COUR232SES");
		
		
		log.info("Validated text message from the page Title");

	}
	@Test
	public void getdevelop4()
	{
		System.out.println("Develop4");
	}
	
	@Test
	public void getdevelop5()
	{
		System.out.println("Develop5");
	}
	
	@Test
	public void getdevelop6()
	{
		System.out.println("Develop6");
	}

	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
		//driver.quit();
	}

}
