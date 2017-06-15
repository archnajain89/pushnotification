package pages;
import java.util.ResourceBundle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class Pushnotification 
	{
		ResourceBundle rb;
		WebDriver driver;
		
		public Pushnotification(WebDriver driver)
		{
			this.driver=driver;
			rb=ResourceBundle.getBundle("Element");
		}
		
		public void pushNoitify() throws InterruptedException
		{
			
			/*//wait for alert to pop up;
			WebDriverWait wait = new WebDriverWait(driver, 3);
			
			//Check for alert;
			Alert alert=wait.until(ExpectedConditions.alertIsPresent());
			try
			{
			//accept it- In your case it allows notification
				alert = driver.switchTo().alert();
				alert.accept(); 
			}
			catch(Exception e)
			{
				System.out.println("No alert popup");
			}
			
			*/
		
				
			
		}
		
	
	}
	

