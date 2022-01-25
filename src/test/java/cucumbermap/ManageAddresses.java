package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.HTMLReportGenerator;
import support.Temp;

public class ManageAddresses 
{
	@When("^user click on manage addresses$")
	public void user_click_on_manage_addresses() throws Throwable 
	{
		Object [] input=new Object[1];
		input[0]= "//*[text()='PAN Card Information']";
		Hashtable<String,Object> output=Temp.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user click on manage addresses$", output.get("MESSAGE").toString());
	}

	@When("^user click on Add new addresses$")
	public void user_click_on_Add_new_addresses() throws Throwable 
	{
		Object [] input1=new Object[1];
		input1[0]="//*[@class='_1QhEVk']";
		Hashtable<String,Object> output1=Temp.clickOnElement(input1);
		HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "^user click on Add new addresses$", output1.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as name$")
	public void user_enter_as_name(String arg1) throws Throwable 
	{
		Object [] input2=new Object[2];
		input2[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
		input2[1]=arg1;
		Hashtable<String,Object> output2=Temp.enterValue(input2);
		HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^user enter \\\"([^\\\"]*)\\\" as name$", output2.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as mobile number$")
	public void user_enter_as_mobile_number(String arg1) throws Throwable 
	{
		Object [] input3=new Object[2];
		input3[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
		input3[1]=arg1;
		Hashtable<String,Object> output3=Temp.enterValue(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user enter \\\"([^\\\"]*)\\\" as mobile number$", output3.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as pincode$")
	public void user_enter_as_pincode(String arg1) throws Throwable 
	{
		Object [] input4=new Object[2];
		input4[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
		input4[1]=arg1;
		Hashtable<String,Object> output4=Temp.enterValue(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user enter \\\"([^\\\"]*)\\\" as pincode$", output4.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as locality$")
	public void user_enter_as_locality(String arg1) throws Throwable 
	{
		Object [] input5=new Object[2];
		input5[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
		input5[1]=arg1;
		Hashtable<String,Object> output5=Temp.enterValue(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \\\"([^\\\"]*)\\\" as locality$", output5.get("MESSAGE").toString());
		
	}

	@When("^user enter \"([^\"]*)\" as Address$")
	public void user_enter_as_Address(String arg1) throws Throwable 
	{
		Object [] input6=new Object[2];
		input6[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		input6[1]=arg1;
		Hashtable<String,Object> output6=Temp.enterValue(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \\\"([^\\\"]*)\\\" as Address$", output6.get("MESSAGE").toString());
	}

	@When("^user select home as address type$")
	public void user_select_home_as_address_type() throws Throwable 
	{
		Object [] input7=new Object[1];
		input7[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		Hashtable<String,Object> output7=Temp.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user select home as address type$", output7.get("MESSAGE").toString());
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable 
	{
		Object [] input8=new Object[1];
		input8[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
		Hashtable<String,Object> output8=Temp.clickOnElement(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^user click on save button$", output8.get("MESSAGE").toString());
	}

	@Then("^application shows new address added successfully$")
	public void application_shows_new_address_added_successfully() throws Throwable 
	{
	    
	}


}
