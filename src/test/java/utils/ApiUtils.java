package utils;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.get;


public class ApiUtils {
    public static void setBaseURI(String url) {
        RestAssured.baseURI = url;
    }

    public static void resetBaseUri() {
        RestAssured.baseURI = null;
    }

    public static void setContentType(ContentType type) {
        given().contentType(type);
    }
}
