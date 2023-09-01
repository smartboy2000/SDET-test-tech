package steps.restAPIs;

import com.autong.base.RestAssertions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import services.requests.UsersRequests;

public class UsersSteps {

    Response response;

    @When("user executes get call to fetch user details")
    public void getUser() {
        response = UsersRequests.getUser();
        RestAssertions.validateOkResponse(response);
        RestAssertions.validateResponseTime(response);
    }

    @Then("user should be able to receive a valid response in timely manner")
    public void validateResponse() {
//        RestAssertions.validateOkResponse(response);
//        RestAssertions.validateResponseTime(response);
    }

    @When("user executes post call to create a user")
    public void createUser() {
        response = UsersRequests.createUser();
        RestAssertions.validateOkResponse(response);
        RestAssertions.validateResponseTime(response);
    }
}
