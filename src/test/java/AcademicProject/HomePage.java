package AcademicProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.ForgetPasswordnew;
import PageObjects.Loginpage;
import PageObjects.landingpage;
import resources.base;



public class HomePage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initilizing() throws IOException {
		
		driver = initilizebrowser();
		log.info("Driver is initilized HP");

	}

	@Test(dataProvider = "getdata")
	public void pagenavigation(String username, String pass) throws IOException, InterruptedException {
		driver.get(prop.getProperty("url"));
		log.info("Navigated to browser HP");
		landingpage l = new landingpage(driver);
		Loginpage lp = l.signinbuttonclick();
		
		lp.email().sendKeys(username);
		lp.password().sendKeys(pass);
		lp.loginbutton().click();
		lp.forgetpassword().click();
		
		
		ForgetPasswordnew newForPas = new ForgetPasswordnew(driver);
		Thread.sleep(15);
		System.out.println("before Email");
		newForPas.emails().sendKeys("asdas@asas.com");
		System.out.println("after Email");
		newForPas.sendmeinstructions().click();
		log.debug("Iterating the signup page HP");
		
		
		
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][2];

		// Set1
		data[0][0] = "Restricted@gmail.com";
		data[0][1] = "34534534";
		// Set2
		data[1][0] = "non_Restricted@gmail.com";
		data[1][1] = "4234234";
		return data;

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
	public void closebrowser() {
		driver.close();
		//driver.quit();
	}
}
