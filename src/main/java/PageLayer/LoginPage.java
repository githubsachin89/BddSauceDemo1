package PageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	private WebElement passWord;
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginPageSendKeysFunctinality(String username, String password) 
	{
		sendKeys(userName,username);
		sendKeys(passWord,password);	
	}
	public void loginPageClickFunctinality()
	{
		click(loginBtn);
	}

}
