package Step_definations;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;


public class Login_stepdefination {


private WebDriver wd;

public Login_stepdefination() {
	this.wd=Hook_bdd.getDriver();
	
}



    
@Then("^user click on sigin button$")
public void user_click_on_sigin_button() throws InterruptedException{
   
    WebElement siginbutton=wd.findElement(By.xpath("//div[@class='header_user_info']//a"));
    siginbutton.click();
    Thread.sleep(3000);
}

@Then("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_and(String username, String password) throws InterruptedException {
    
    WebElement user_name=wd.findElement(By.xpath("//input[@name='email']"));
	user_name.sendKeys(username);
    Thread.sleep(1000);
    
    WebElement Password=wd.findElement(By.xpath("//input[@name='passwd']"));
    Password.sendKeys(password);
	Thread.sleep(1000);
	
	WebElement signin=wd.findElement(By.xpath("//button[@name='SubmitLogin']"));
    signin.click();

	
	Thread.sleep(4000);
}


}
