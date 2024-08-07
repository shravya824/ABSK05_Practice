package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class NewCustomerCreationPage extends BaseClass {
	WebDriver driver;
	public NewCustomerCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustomer;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement customer_name;
	
	@FindBy(xpath="(//input[@name='rad1'])[2]")
	WebElement gender;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	
	
	
	public void clickOnNewCustomer()
	{
		newCustomer.click();
	}
	
	
	public void enterCustomerName(String CustomerName)
	{
		customer_name.sendKeys(CustomerName);
	}
	
	public void genderType()
	{
		gender.click();
	}
	
	public void dateOfBirth(String Date)
	{
		dob.sendKeys(Date);
	}
	public void addressOfCustomer(String FullAddress)
	{
		address.sendKeys(FullAddress);
				
				
				
				
	}
	
	
	
	
	
	
			

}
