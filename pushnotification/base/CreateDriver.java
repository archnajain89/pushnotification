package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class CreateDriver 
{

	public WebDriver driver;
	@BeforeSuite
	public void StartBrowser()
	{
		/*//Create a instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		//Add chrome switch to disable notification - "--disable-notifications"
		options.addArguments("--disable-notifications");
	
		//Set path for driver exe
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		//Pass ChromeOptions instance to ChromeDriver Constructor
		WebDriver driver =new ChromeDriver(options);
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.get("https://www.makemytrip.com/");
		// driver.get("http://jqueryui.com/datepicker/");
*/		
		
		ProfilesIni ffProfiles = new ProfilesIni();
		FirefoxProfile profile = ffProfiles.getProfile("firefoxtestprofile");
		WebDriver driver = new FirefoxDriver(profile);
				
		driver.navigate().to("http://www.firstcry.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Push notification has been disabled");
		
		
	}
	
	
/*	@AfterSuite
	public void EndBrowser()
	{
		driver.quit();
	}
*/	
}
