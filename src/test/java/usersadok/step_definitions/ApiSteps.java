package usersadok.step_definitions;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import usersadok.utils.HttpRequests;


public class ApiSteps {

	private String urlApi;

	@Given("I have this URL {string}")
	public void i_have_this_URL(String url){
		this.urlApi = url;
	}

	@Then("I verify that the API is up and running")
	public void i_verify_that_the_API_is_up_and_running() throws IOException {
		HttpRequests httpRequest = new HttpRequests();
		assertEquals("The API is not working properly", 200, httpRequest.codeGetRequest(urlApi));
	}
}
