package tests;

import com.jayway.restassured.http.ContentType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ApiUtils;

import static providers.WeatherstackDataProvider.BASEURL;

public abstract class BaseTest {

    @BeforeClass
    protected void setup() {
        ApiUtils.setBaseURI(BASEURL);
        ApiUtils.setContentType(ContentType.JSON);
    }

    @AfterClass
    protected void tearDown() {
        ApiUtils.resetBaseUri();
    }
}
