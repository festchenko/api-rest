package providers;

import org.testng.annotations.DataProvider;
import utils.Properties;


public class WeatherstackDataProvider {
    public static String APPIACCESSKEY = Properties.INSTANCE.readProperties("weatherstack.apiAccessKey", "/src/test/java/resources/properties/weatherstackApi.properties");
    public static String BASEURL =  Properties.INSTANCE.readProperties("weatherstack.baseUrl", "/src/test/java/resources/properties/weatherstackApi.properties");
    public static String CURRENTWEATHER =  Properties.INSTANCE.readProperties("weatherstack.currentWeather", "/src/test/java/resources/properties/weatherstackApi.properties");
    public static String FORECASTWEATHER = Properties.INSTANCE.readProperties("weatherstack.weatherForecast", "/src/test/java/resources/properties/weatherstackApi.properties");

    @DataProvider(name = "citiesUA")
    public static Object[][] getCitiesUA()
    {
        return new Object[][] { { "Cherkasy","/Users/festchenko/IdeaProjects/api-rest/src/test/java/resources/json/locationCherkassy.json" }, { "Kiev","/Users/festchenko/IdeaProjects/api-rest/src/test/java/resources/json/locationKiev.json" }, { "Vinnitsa" ,"/Users/festchenko/IdeaProjects/api-rest/src/test/java/resources/json/locationVinnitsa.json" } };
    }

    @DataProvider(name = "citiesUSA")
    public static Object[][] getCitiesUSA()
    {
        return new Object[][] { { "New York","/Users/festchenko/IdeaProjects/api-rest/src/test/java/resources/json/locationNewYork.json" }, { "Los Angeles","/Users/festchenko/IdeaProjects/api-rest/src/test/java/resources/json/locationLosAngeles.json" }, { "San Francisco","/Users/festchenko/IdeaProjects/api-rest/src/test/java/resources/json/locationSanFrancisco.json" } };
    }
}
