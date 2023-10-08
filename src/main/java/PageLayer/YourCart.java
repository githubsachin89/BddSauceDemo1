package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class YourCart extends BaseClass{
	
	@FindBy(id="remove-sauce-labs-bike-light")
	private WebElement removeBike;
	@FindBy(id="checkout")
	private WebElement checkOut;
	
	public YourCart()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void yourCartfunctinality()
	{
		click(removeBike);
		click(checkOut);
	}

}
