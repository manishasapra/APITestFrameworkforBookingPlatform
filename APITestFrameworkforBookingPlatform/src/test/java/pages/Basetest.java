package pages;


import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;


public class Basetest {
        @BeforeAll
        public static void setup() {
            RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        }
    }

