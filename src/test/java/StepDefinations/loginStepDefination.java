package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginStepDefination {
	
	WebDriver driver;
	
	@Given("Initialize the driver")
	public void Initialize_the_driver() {
		driver=new ChromeDriver();
		
	}
	@When("User enter URL")
	public void User_enter_URL()throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@And("User enters the valid username")
	public void User_enters_the_valid_username() {
		WebElement UN=driver.findElement(By.xpath("//input[@name='username']"));
		UN.sendKeys("Admin");
		
	}
	@And("User enters the valid password")
	public void User_enters_the_valid_password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}
	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("User Should be able to login")
	public void user_should_be_able_to_login() {
		
	//	System.out.println(driver.getCurrentUrl());
		String actual =driver.getCurrentUrl();
		String expected ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(actual, expected);
		System.out.println("Test case passed....");
	}
	
	
		   
}
