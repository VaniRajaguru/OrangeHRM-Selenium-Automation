package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Page_Objects {
	
	@FindBy(linkText = "Dashboard")
	public static WebElement dashboard;
	
	@FindBy(xpath = "//div[contains(@class,'emp-leave-chart')]/child::div[2]/child::div/child::p")
	public static WebElement empOnLeaveToday;
}
