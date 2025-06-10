package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonActions.CommonFunctions;
import pageObjects.Login_Page_Objects;

public class Test_Login_Page extends CommonFunctions {

	@Test
	public void loginTest() {
		
			
		 PageFactory.initElements(driver, Login_Page_Objects.class);
		 logger.info("Login Page Test Starts");
		 Login_Page_Objects.userName.sendKeys(properties.getProperty("username"));
		 Login_Page_Objects.passWord.sendKeys(properties.getProperty("password"));
		 Login_Page_Objects.loginButton.click();
	}
	
}
