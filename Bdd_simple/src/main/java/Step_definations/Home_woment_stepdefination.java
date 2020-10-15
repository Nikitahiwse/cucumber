package Step_definations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import simplecjavaclass.category;

public class Home_woment_stepdefination {
	public WebDriver wd;
	public Home_woment_stepdefination() {
		this.wd=Hook_bdd.getDriver();
	} 
		
	
	JavascriptExecutor jse=(JavascriptExecutor)wd;
	@When("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException {
	    WebElement home_button=wd.findElement(By.xpath("//a[@title='Home']"));
	    

		  //jse.executeScript("window.scrollBy(0,300)", "");
		    Thread.sleep(2000);
		   // jse.executeScript("window.scrollBy(0,300)", "");
		   // Thread.sleep(4000);
		    
			home_button.click();
			Thread.sleep(3000);
			
	}

	@Then("^Check categories under women section$")
	public void check_categories_under_women_section() throws InterruptedException{
		/*
		 * category c=new category(); c.cat();
		 */
		category ca=PageFactory.initElements(wd, category.class);
		ca.cat();
	}

}