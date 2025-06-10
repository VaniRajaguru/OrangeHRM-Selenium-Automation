package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Objects {

		
	@FindBy(name = "username")
	public static WebElement userName;
	
	@FindBy(name = "password")
	public static WebElement passWord;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginButton;
	
	
}
