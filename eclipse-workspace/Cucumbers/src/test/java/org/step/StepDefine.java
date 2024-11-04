package org.step;
import java.util.List;
import java.util.Map;

import org.helping.BaseClass;
import org.helping.ForgotPojo;
import org.helping.LoginPojo;
import org.helping.SignUpPojo;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefine extends BaseClass {
    @Given("User have to open FaceBook through Chrome Browser")
	public void user_have_to_open_FaceBook_through_Chrome_Browser() {
		launchUrl("https://www.facebook.com/");
	    }
    @When("User have to Pass the {string} and {string} and click login button")
	public void user_have_to_Pass_the_and_and_click_login_button(String string, String string2) {
		LoginPojo l=new LoginPojo();
		passKeys(l.getUsername(), string);
		passKeys(l.getPwd(), string2);
		clickElement(l.getLog());
	    }
	@Given("User have to open Facebook forgot password page through Chrome browser")
	public void user_have_to_open_Facebook_forgot_password_page_through_Chrome_browser() {
		launchUrl("https://www.facebook.com/login/identify?ctx=recover");
	}
   @When("User have to pass the email id or phone number and click search")
	public void user_have_to_pass_the_email_id_or_phone_number_and_click_search(io.cucumber.datatable.DataTable table) {
		ForgotPojo f=new ForgotPojo();
		List<List<String>> lists = table.asLists();
	    List<String> data = lists.get(1);
	    passKeys(f.getEmail(), data.get(0));
	    clickElement(f.getSearch());
	}
	@When("User have to click create new Account and fill up user credentials")
	public void user_have_to_click_create_new_Account_and_fill_up_user_credentials(io.cucumber.datatable.DataTable table1) {
		SignUpPojo s=new SignUpPojo();
        clickElement(s.getAccnt());
		List<Map<String, String>> maps = table1.asMaps();
		Map<String, String> data1 = maps.get(0);
		passKeys(s.getFname(), data1.get("Fname"));
		passKeys(s.getLname(), data1.get("Lname"));
		passKeys(s.getMnumb(), data1.get("mobile"));
		passKeys(s.getNpwd(),data1.get("npwsd"));
		valueSelect(s.getDate(), data1.get("date"));
		textSelect(s.getMonth(),data1.get("month"));
		textSelect(s.getYear(), data1.get("year"));
	    clickElement(s.getSex());
	    clickElement(s.getSignup());
		
		}

}
