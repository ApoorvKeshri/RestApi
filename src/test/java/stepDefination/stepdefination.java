package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.ApiResources;

public class stepdefination {
	@Given("Add Place Payload")
	public void add_place_payload() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user calls {string} With Post http request")
	public void user_calls_with_post_http_request(String resource) {
			ApiResources resourceApi = ApiResources.valueOf(resource);
			System.out.println(resourceApi.getresource());
	}
	@Then("the ApI call got success with status code {int}")
	public void the_ap_i_call_got_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}