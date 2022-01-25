package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import support.HTMLReportGenerator;

public class Hookable 
{
	@Before
	public void beforeMethod(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("G:\\Report\\flipkart.html", "FlipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(),scenario.getStatus());
		
		System.out.println("--------------------------------------Scenario Start----------------------------------");
	}
	
	@After
	public void afterMethod(Scenario scenario)
	{
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		System.out.println("--------------------------------------Scenario End----------------------------------");
	}
}
