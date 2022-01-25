package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.HTMLReportGenerator;
import support.Temp;

public class Login 
{
	@Given("^User open \"([^\"]*)\" browser with link$")
	public void user_open_browser_with_link(String arg1) throws Throwable 
	{
		Object [] input =new Object[1];
		input[0]=arg1;
		Temp.launchBrowser(input);
	}

	@Given("^User opne a url$")
	public void user_opne_a_url() throws Throwable 
	{
		Temp.openApplication();
	}

	@When("^User click on cancel button$")
	public void user_click_on_cancel_button() throws Throwable 
	{
		Object [] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Temp.clickOnElement(input2);
	}

	@When("^user move on Login button$")
	public void user_move_on_Login_button() throws Throwable 
	{
		Object [] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		Temp.clickOverElement(input3);
	}

	@When("^user click on My Profile button$")
	public void user_click_on_My_Profile_button() throws Throwable 
	{
		Object [] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		Hashtable<String,Object> output4=Temp.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on My Profile button$", output4.get("MESSAGE").toString());
	}

	@When("^user enter User id as \"([^\"]*)\"$")
	public void user_enter_User_id_as(String arg1) throws Throwable 
	{
		Object [] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]=arg1;
		Hashtable<String,Object> output5=Temp.enterValue(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter User id as \"([^\"]*)\"$", output5.get("MESSAGE").toString());
	}

	@When("^user enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String arg1) throws Throwable 
	{
		Object [] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1]=arg1;
		Hashtable<String,Object> output6=Temp.enterValue(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter password as \"([^\"]*)\"$", output6.get("MESSAGE").toString());
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable 
	{
		Object [] input7=new Object[1];
		input7[0]="(//*[@type='submit'])[2]";
		Hashtable<String,Object> output7=Temp.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on login button$", output7.get("MESSAGE").toString());
	}

	@Then("^user logged in succesfully$")
	public void user_logged_in_succesfully() throws Throwable 
	{
		Object [] input8=new Object[2];
		input8[0]="Personal Information";
		input8[1]="//*[@class='_1mHr1S']";
		Hashtable<String,Object> output8=Temp.Loginsuccess(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), null, output8.get("MESSAGE").toString());
	}


}
