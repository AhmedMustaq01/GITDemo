package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class landingpage {
public WebDriver driver;

@FindBy(xpath="//a[@href='https://rahulshettyacademy.com/sign_in/']") WebElement signinbutton;
@FindBy(xpath="//div[@class='text-center']/h2") WebElement title;
@FindBy(xpath="//nav[@class='navbar-collapse collapse']/ul") WebElement navtabs;


public landingpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	public Loginpage signinbuttonclick()
	{
		signinbutton.click();
		Loginpage lp =  new Loginpage(driver);
		return lp;
	}
	
	public WebElement titlecheck()
	{
		return title;
		
	}
	public WebElement navigationtab()
	{
		return navtabs;
	}
	
	
}
