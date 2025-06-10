package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Page_Objects {

	@FindBy(linkText = "Admin")
	public static WebElement admin;
	
	/*
	 * @FindBy(linkText = "User Management") public static WebElement
	 * userManagement;
	 * 
	 * @FindBy(linkText = "Users") public static WebElement users;
	 */
	@FindBy(xpath = "//label[text()='Username']/following::input[1]")
	public static WebElement adminUsername;
	
	@FindBy(xpath = "//label[text()='User Role']/following::div[1]/child::div/child::div")
	public static WebElement userRole;
	
	@FindBy(xpath = "//label[text()='Status']/following::div[1]/child::div/child::div")
	public static WebElement userStatus;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement search;
	
	@FindBy(xpath = "//div[@role='row']/child::div[contains(@role,'cell')]/following::div[3]")
	public static WebElement userRoleValue;
	
	@FindBy(xpath = "//div[@role='row']/child::div[contains(@role,'cell')]/following::div[7]")
	public static WebElement userStatusValue;
	
	
}
