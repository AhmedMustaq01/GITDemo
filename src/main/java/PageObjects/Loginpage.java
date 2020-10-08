package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	
	@FindBy(id="user_email") WebElement  email;
	@FindBy(id="user_password") WebElement password;
	@FindBy(name="commit") WebElement loginbutton;
	@FindBy(css="[href*='password/new']") WebElement forgetpassword;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement email()
	{
		return email;
	}
	
	public WebElement password()
	{
		return password;
	}
	public WebElement loginbutton()
	{
		return loginbutton;
	}
	
	public WebElement forgetpassword()
	{
		return forgetpassword;
		
		
		
		/*ForgetPasswordnew newForPag = new ForgetPasswordnew(driver);
		return newForPag;*/
		
	}
	
	}
	
	


