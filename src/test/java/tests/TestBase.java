package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.PropertiesUtil;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class TestBase extends AbstractTestNGCucumberTests {

    public static AppiumDriver driver;
    static Properties properties = PropertiesUtil.loadDeviceData();

    public static void Android_Setup() throws MalformedURLException {
        String appDir = System.getProperty("user.dir") + "/apps/";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName",properties.getProperty("platform_Name"));
        capabilities.setCapability("platformVersion",properties.getProperty("platform_Version"));
        capabilities.setCapability("deviceName",properties.getProperty("device_Name"));
        capabilities.setCapability("app",appDir+properties.getProperty("application"));
        driver = new AndroidDriver(new URL(properties.getProperty("appiumPort")),capabilities);
    }

    public static void tearDown() {
        driver.quit();
    }
}
