package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonActions.CommonFunctions;
import pageObjects.Dashboard_Page_Objects;

public class Test_Pending_Leave_Request extends CommonFunctions {

	@Test
	public void verifyHowManyAreInLeave() {
		
		PageFactory.initElements(driver,Dashboard_Page_Objects.class);
		logger.info("Login Test Successful");
		logger.info("Pending Leave Test Starts");
		Dashboard_Page_Objects.dashboard.click();
		String leaveStatus=Dashboard_Page_Objects.empOnLeaveToday.getText();
		logger.info("Emloyees on leave: "+ leaveStatus);
		Assert.assertEquals(leaveStatus, "No Employees are on Leave Today");
		logger.info("Pending Leave Test Successful");
		
	}
	
}
