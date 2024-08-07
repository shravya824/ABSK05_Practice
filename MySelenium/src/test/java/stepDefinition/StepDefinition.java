package stepDefinition;

import org.openqa.selenium.WebDriver;

import PageFactory.NewCustomerCreationPage;
import PageFactory.NewLoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	WebDriver driver=BaseClass.initializeDriver();
	NewLoginPage obj1=new NewLoginPage(driver);
	NewCustomerCreationPage obj2=new NewCustomerCreationPage(driver);
	
	
	
	@Given("User opens the url of the application")
	public void user_opens_the_url_of_the_application() {
		System.out.println("Application launched");
	   
	}

	@Given("User will enter the username with {string}")
	public void user_will_enter_the_username_with(String username) {
		obj1.enterUserName(username);
	   
	}

	@Given("User will enter thepassword with {string}")
	public void user_will_enter_thepassword_with(String password) {
		obj1.enterPassword(password);
	   
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		obj1.clickOnSubmit();
	   
	}

	@Then("User will be able to login to the application")
	public void user_will_be_able_to_login_to_the_application() {
		getTitle();
		
		
	   
	}
	
	
	

	@Then("User will click on the  add new customer link in the app")
	public void user_will_click_on_the_add_new_customer_link_in_the_app() throws InterruptedException {
		
		obj2.clickOnNewCustomer();
		//addHardCodedwait();
	   
	}

	@Then("User will enter the customer name in app as {string}")
	public void user_will_enter_the_customer_name_in_app_as(String Customer_Name) {
		obj2.enterCustomerName(Customer_Name);
	  
	}

	@Then("User will enter the gender in app")
	public void user_will_enter_the_gender_in_app() {
		obj2.genderType();
	  
	}

	@Then("User will enter the DOB in app as {string}")
	public void user_will_enter_the_dob_in_app_as(String DOB) {
		obj2.dateOfBirth(DOB);
	    
	}

	@Then("User enter the address in app as {string}")
	public void user_enter_the_address_in_app_as(String Address) {
		obj2.addressOfCustomer(Address);
	   
	}







}
