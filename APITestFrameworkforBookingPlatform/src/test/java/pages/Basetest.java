package pages;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Basetest {

    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeAll
    public static void setup() {
        // Set base URI
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        // Set up ExtentReports
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
        spark.config().setDocumentTitle("API Test Report");
        spark.config().setReportName("Booking API Test Results");
        spark.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "Manisha");
    }

    @AfterAll
    public static void tearDown() {
        // Write everything to the report
        if (extent != null) {
            extent.flush();
        }
    }
}
