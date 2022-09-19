package TestNGDemo.TestngLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LogIn 
{
    WebDriver driver;
   
    @FindBy(xpath="//*[@placeholder=\"Username\"]")
    private WebElement username;
    
    @FindBy(xpath="//*[@placeholder=\"Password\"]")
    private WebElement password;
    
    @FindBy(xpath="//*[@type=\"submit\"] ")
    private WebElement LogInButton;
    
    public LogIn(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
    
    public void sendUserName()
    {
    	
    	username.sendKeys("Admin");
    	
    }
   
    public void password() 
    {
   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder=\"Password\"]")));
    password.sendKeys("admin123");
    }
  
    public void ClickOnLogInButton() 
    {
    	LogInButton.click();
    }
    }
    

