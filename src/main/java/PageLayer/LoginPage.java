package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class  LoginPage extends BaseClass{
	@FindBy(name="dcdrLocation")
	private WebElement location;
	
	@FindBy(name="givenName")
	private WebElement name;
	
	@FindBy(name="hintQues")
	private WebElement question;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	

}
