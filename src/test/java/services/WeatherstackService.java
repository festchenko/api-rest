package services;

import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static providers.WeatherstackDataProvider.*;

public class WeatherstackService {

    JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder()
            .setValidationConfiguration(
                    ValidationConfiguration.newBuilder()
                            .setDefaultVersion(SchemaVersion.DRAFTV4).freeze())
            .freeze();

    public Response getCurrentWeather(String city) {
        return given()
                .queryParam("access_key", APPIACCESSKEY)
                .queryParam("query", city)
                .basePath(CURRENTWEATHER)
                .when()
                .get()
                .then()
                .statusCode(200)
                .assertThat().body(matchesJsonSchemaInClasspath("json_schema/currentWeather.json")
                        .using(jsonSchemaFactory))
                .extract()
                .response();
    }

    public Response getForecastWeather(String city, int forecastDays) {
        return given()
                .queryParam("access_key", APPIACCESSKEY)
                .queryParam("query", city)
                .queryParam("forecast_days", forecastDays)
                .basePath(FORECASTWEATHER)
                .when()
                .get()
                .then()
                .statusCode(200)
                .assertThat().body(matchesJsonSchemaInClasspath("json_schema/forecastWeather.json")
                        .using(jsonSchemaFactory))
                .extract()
                .response();
    }

}
