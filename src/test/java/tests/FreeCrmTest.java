package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import singletonDesignPattern.Constants;
import singletonDesignPattern.TestBase;

public class FreeCrmTest {
	
	@BeforeMethod
	public void setUp()
	{
		TestBase.initialize();
	}
	
	@Test(priority=1)
	public void verifyFreeCrmTitleTest()
	{
		String title=TestBase.driver.getTitle();
		System.out.println("Page title is : "+ title);
		Assert.assertEquals(title, Constants.loginPageTitle);
	}
	
	@Test(priority=2)
	public void logoTest()
	{
		Assert.assertEquals(TestBase.driver.findElement(By.className("img-responsive")).isDisplayed(),true);
	}
	
	@AfterMethod
	public void tearDown()
	{
		TestBase.quit();
	}

}
