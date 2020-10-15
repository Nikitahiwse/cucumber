package simplecjavaclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Step_definations.Hook_bdd;

public class category {
private WebDriver wd;


 public category() 
 { this.wd=Hook_bdd.getDriver(); }
 
@FindBy(xpath="//a[@title='Women']") WebElement Womenbutton;


	public void cat() throws InterruptedException
	{
		//WebElement Womenbutton=wd.findElement(By.xpath("//a[@title='Women']"));
		Womenbutton.click();
		Thread.sleep(2000);
		
		
		List<WebElement>grower=wd.findElements(By.xpath("//div[@id='categories_block_left']//li//span"));
		for(WebElement grow : grower)
		{
			Thread.sleep(1000);
			grow.click();
		}
		
		List<WebElement>Womendresscategory=wd.findElements(By.xpath("//div[@id='categories_block_left']//li//a"));
		int i=1;
		System.out.println("Total Categories under Women Section are= "+ Womendresscategory.size());
		
		for(WebElement dress : Womendresscategory)
		{
			
			Thread.sleep(2000);
			String dress_category=dress.getText();
			Thread.sleep(2000);
			System.out.println("Category"+ i + "  "+ dress_category);
			
			i++;
		}
	
	}
	}

