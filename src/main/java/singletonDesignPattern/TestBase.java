package singletonDesignPattern;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver = null;

	
	public static void initialize()
	{
		if(driver == null)
		{
			if(Constants.browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver.exe");
	     		driver=new ChromeDriver();
			}
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.url);
	}
	
	public static void quit()
	{
		driver.quit();
		driver=null;
	}
	public static void close()
	{
		driver.quit();
		driver=null;
	}

}
