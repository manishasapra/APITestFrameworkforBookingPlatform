package api.utils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class TokenUtil {
    public static String getToken() {
        String payload = "{ \"username\" : \"admin\", \"password\" : \"password123\" }";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(payload)
                .post("/auth");

        return response.jsonPath().getString("token");
    }
}

