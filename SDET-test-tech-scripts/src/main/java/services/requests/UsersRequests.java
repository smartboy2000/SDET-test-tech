package services.requests;

import com.autong.base.RestResources;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import services.payloads.Root;

import java.util.logging.Logger;

import static locators.Routes.BaseEndPoints.BASE_PATH;

public class UsersRequests {

    static Response response;
    static Object firstName;

    public static Response getUser() {
        try {
            response = RestResources.get(BASE_PATH + "/api/users");
            firstName = response.jsonPath().get("data[0].first_name");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    public static Response createUser() {
        try {
            Root root = Root.builder().setName(firstName.toString()).setJob("leader").build();
            response = RestResources.post(BASE_PATH + "/api/users", root);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
