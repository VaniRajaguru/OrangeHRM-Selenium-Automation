package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonActions.CommonFunctions;
import pageObjects.Admin_Page_Objects;

public class Test_Check_User_Role extends CommonFunctions {
	 
		
	public void moveToUserTable() {

		Admin_Page_Objects.admin.click();
		// Admin_Page_Objects.userManagement.click();
		// Admin_Page_Objects.users.click();
		Admin_Page_Objects.adminUsername.sendKeys("Admin");
	}

	public void selectUser() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Admin_Page_Objects.userRole).click();
		actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER);
		actions.build().perform();
		//logger.info(Admin_Page_Objects.userRole.getText());
		
		actions.moveToElement(Admin_Page_Objects.userStatus).click();
		actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER);
		actions.build().perform();
		//logger.info(Admin_Page_Objects.userStatus.getText());
		
	}

	public void searchInTable() {

		Admin_Page_Objects.search.click();
		
		String roleValue = Admin_Page_Objects.userRoleValue.getText();
		String roleStatus = Admin_Page_Objects.userStatusValue.getText();
		
		Assert.assertEquals(roleValue, "Admin");
		Assert.assertEquals(roleStatus, "Enabled");
		
	}
	

	@Test
	public void checkUserRole() {

		PageFactory.initElements(driver, Admin_Page_Objects.class);
		logger.info("Check User Role Test Starts");
		moveToUserTable();
		selectUser();
		searchInTable();
		logger.info("Check User Role Test Successful");

	}

}
