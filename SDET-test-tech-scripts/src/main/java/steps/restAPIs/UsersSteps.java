package steps.restAPIs;

import com.autong.base.RestAssertions;
import com.autong.base.RestResources;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.logging.Logger;

import static locators.Routes.BaseEndPoints.BASE_PATH;

public class UsersSteps {

    Response response;
    private static final Logger logger = Logger.getLogger(UsersSteps.class.getName());

    @When("user executes get call to fetch user details")
    public void postAddTestResult() {
        response = RestResources.get(BASE_PATH + "/api/users");
        logger.info(response.asPrettyString());
    }

    @Then("user should be able to receive a valid response in timely manner")
    public void validateResponse() {
        RestAssertions.validateOkResponse(response);
        RestAssertions.validateResponseTime(response);
    }
}
