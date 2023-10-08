package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class SwagLabsPage extends BaseClass
{
	@FindBy(xpath="//button[contains(@name,'backpack')]")
	private WebElement backPack;
	@FindBy(xpath="//button[contains(@name,'bike-light')]")
	private WebElement bikeLight;
	@FindBy(xpath="//button[contains(@name,'bolt')]")
	private WebElement boltTshirt;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartBtn;
			
	public SwagLabsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void swagLabsAddCartFuctinality()
	{
		click(backPack);
		click(bikeLight);
		click(boltTshirt);
	}
	
	public void swagLabsCartFuntinality() throws Exception
	{
		//Thread.sleep(3000);
		click(cartBtn);
	}
}
