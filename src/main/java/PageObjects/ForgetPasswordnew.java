package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordnew {
	public WebDriver driver;
	
	public ForgetPasswordnew(WebDriver driver) {	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="user_email") WebElement  email;
	@FindBy(name="commit") WebElement sendmeinstruction;
	
	public WebElement emails()
	{
		return email;
	}
	 public WebElement sendmeinstructions()
	 {
		 return sendmeinstruction;
	 }

}
