package TestNGDemo.TestngLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	

@FindBy (xpath="//*[@href=\"/web/index.php/pim/viewPimModule\"]")
private WebElement  PIM;

@FindBy (xpath="//*[@href=\"/web/index.php/leave/viewLeaveModule\"]")
private WebElement LEAVE;

@FindBy (xpath="//*[@href=\"/web/index.php/pim/viewMyDetails\"]")
private WebElement MYINFO;



public HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void verifyPIM()
{
	PIM.click();
	PIM.isDisplayed();
}
	public void verifyLEAVE()
	{
		LEAVE.isDisplayed();
	}
	


private void verifyMYINFO() {
	MYINFO.isDisplayed();
	
}
}
























