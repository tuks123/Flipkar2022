package support;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class Temp 
{
public static WebDriver driver=null;
public static ConfigReader config=null;
	
	public static Hashtable<String, Object> outputparameters =new Hashtable<String, Object>();
	//To Launch A Browser
	public static Hashtable<String, Object> launchBrowser(Object[] inputparametrs)
	{
		
		try {
		String strBrowserName=(String) inputparametrs[0];
		//String strExePath=(String) inputparametrs[1];
		config=new ConfigReader();
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		}else if(strBrowserName.equalsIgnoreCase("fireFox"))
		{
			System.setProperty("webdriver.gecko.driver",config.getDriverPathFF());
			FirefoxDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		}
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:launchBrowser, input_Data : " +inputparametrs[0].toString());
		
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:launchBrowser, input_Data : " +inputparametrs[0].toString());
		}
		return outputparameters;
	}	
		
		//To Launch a url
	public static Hashtable<String, Object> openApplication()
	{
		try {			
				driver.get(config.getApplicationUrl());
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "methodUsed:openApplication, input_Data : " + config.getApplicationUrl().toString());
			}catch(Exception e)
			{
				outputparameters.put("STATUS", "FAIL");
				outputparameters.put("MESSAGE", "methodUsed:openApplication, input_Data : " + config.getApplicationUrl().toString());
			}
		return outputparameters;
	}
	
	//To cancel window
	public static Hashtable<String, Object> clickOnElement(Object[]inputparamerets)
	{
		
		try {	
		String xpath= (String) inputparamerets[0];
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:clickOnElement, input_Data : " +inputparamerets[0].toString());
		
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:clickOnElement, input_Data : " +inputparamerets[0].toString());
		}
		return outputparameters;
	}
	
	//CLick on Login Button
	public static Hashtable<String, Object> clickOverElement(Object[]inputparamerets)
	{
		try {
		String login=(String) inputparamerets[0];
		Actions act=new Actions(driver);
		WebElement value=driver.findElement(By.xpath(login));
		act.moveToElement(value).build().perform();
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:clickOverElement, input_Data : " +inputparamerets[0].toString());
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:clickOverElement, input_Data : " +inputparamerets[0].toString());
		}
		return outputparameters;
	}
	
	public static Hashtable<String, Object> enterValue(Object[]inputparamerets)
	{
		try {
		String xpath1=(String) inputparamerets[0];
		String value1=(String) inputparamerets[1];
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		WebElement login1=driver.findElement(By.xpath(xpath1));
				 //  login1.clear();
				   login1.sendKeys(value1);
				   
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:enterValue, input_Data : " +inputparamerets[1].toString());
		
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "FAIL");
			outputparameters.put("MESSAGE", "methodUsed:enterValue, input_Data : " +inputparamerets[1].toString());
		}
		return outputparameters;
	}
	public static Hashtable<String, Object> Loginsuccess(Object[]inputparamerets)
	{
		try {
		String givenText= (String) inputparamerets[0];
		String textXpath = (String) inputparamerets[1];
		
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String text= driver.findElement(By.xpath(textXpath)).getText();
		if(givenText.equalsIgnoreCase(text))
		{
			System.out.println("Test case pass successfully");
		}else
		{
			System.out.println("Test case is not pass successfully");
		}
		
		outputparameters.put("STATUS", "PASS");
		outputparameters.put("MESSAGE", "methodUsed:Loginsuccess, input_Data : " +inputparamerets[1].toString());
		
		}catch(Exception e)
		{
			outputparameters.put("STATUS", "PASS");
			outputparameters.put("MESSAGE", "methodUsed:Loginsuccess, input_Data : " +inputparamerets[1].toString());
		}
		return outputparameters;
	}
}
