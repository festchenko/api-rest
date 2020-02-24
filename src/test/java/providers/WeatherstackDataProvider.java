package providers;

import org.testng.annotations.DataProvider;
import utils.Properties;


public class WeatherstackDataProvider {
    public static final String DIR = System.getProperty("user.dir");
    public static String APPIACCESSKEY = Properties.INSTANCE.readProperties("weatherstack.apiAccessKey", "/src/test/java/resources/properties/weatherstackApi.properties");
    public static String BASEURL =  Properties.INSTANCE.readProperties("weatherstack.baseUrl", "/src/test/java/resources/properties/weatherstackApi.properties");
    public static String CURRENTWEATHER =  Properties.INSTANCE.readProperties("weatherstack.currentWeather", "/src/test/java/resources/properties/weatherstackApi.properties");
    public static String FORECASTWEATHER = Properties.INSTANCE.readProperties("weatherstack.weatherForecast", "/src/test/java/resources/properties/weatherstackApi.properties");

    @DataProvider(name = "citiesUA")
    public static Object[][] getCitiesUA()
    {
        return new Object[][] { { "Cherkasy", DIR + "/src/test/java/resources/json/locationCherkassy.json" }, { "Kiev", DIR + "/src/test/java/resources/json/locationKiev.json" }, { "Vinnitsa" , DIR + "/src/test/java/resources/json/locationVinnitsa.json" } };
    }

    @DataProvider(name = "citiesUSA")
    public static Object[][] getCitiesUSA()
    {
        return new Object[][] { { "New York",DIR + "/src/test/java/resources/json/locationNewYork.json" }, { "Los Angeles", DIR + "/src/test/java/resources/json/locationLosAngeles.json" }, { "San Francisco", DIR + "/src/test/java/resources/json/locationSanFrancisco.json" } };
    }
}
