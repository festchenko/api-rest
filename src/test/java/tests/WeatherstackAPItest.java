package tests;

import models.current_weather.Location;
import models.current_weather.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WeatherstackService;
import providers.WeatherstackDataProvider;

import java.io.File;
import java.io.IOException;

import static utils.Properties.MAPPER;

public class WeatherstackAPItest extends BaseTest {
    WeatherstackService weatherstackService = new WeatherstackService();

    @Test(dataProvider = "citiesUA", dataProviderClass = WeatherstackDataProvider.class)
    public void checkCurrentWeatherTest(String city, String locationJsonPath) throws IOException {
        Location expectedLocation = MAPPER.readValue(new File(locationJsonPath), Location.class);
        Assert.assertEquals(weatherstackService.getCurrentWeather(city).as(Response.class).getLocation(), expectedLocation);
    }
}
