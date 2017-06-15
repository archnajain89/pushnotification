package pages;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;



public class HomePage 
{
	ResourceBundle rb;
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		rb=ResourceBundle.getBundle("Element");
	}
	
	public void calenderpopup() throws InterruptedException
	{
		
		/*driver.findElementByXPath(rb.getString("login_id")).sendKeys("testbhavna.t2system@gmail.com");
		driver.findElementByXPath(rb.getString("next_button")).click();
		Thread.sleep(10000);*/	
		  //driver.switchTo().frame(0);
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  
		  //Click on text box so that date picker will come
		  driver.findElement(By.id("hp-widget__depart")).click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  //Click on next so that we will be in next month
		  driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span")).click();
		
		  /*DatePicker is a table.So navigate to each cell 
		   * If a particular cell matches value 12 then select it*/
		  
		  WebElement dateselect = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
		  List<WebElement> rows=dateselect.findElements(By.tagName("tr"));
		  System.out.println("rows"+rows);
		  
		  List<WebElement> columns=dateselect.findElements(By.tagName("td"));
		  System.out.println("columns"+columns);
		  for (WebElement cell: columns)
		  {
		   //Select 12th july 2017 Date 
		   if (cell.getText().equals("12"))
		   	{
			   cell.findElement(By.linkText("12")).click();
			   break;
		   	}
		  }		
	
	}
}