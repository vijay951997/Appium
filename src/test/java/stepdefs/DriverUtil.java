package stepdefs;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverUtil {


    public static AndroidDriver driver;
    public static void initializeDriver() throws Exception {

        String username = "vijayakumar_KJBCP4";
        String accessKey = "ybm8fmYGrRBiKJ8XiJKK";

        DesiredCapabilities caps = new DesiredCapabilities();


        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("projectName", "test");
        caps.setCapability("build", "test buil");
        caps.setCapability("name", "");

        URL url = new URL("https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub");

        caps.setCapability("app","bs://d10a0368ed27a397c8eac08f90cdf276ae268202");

        driver = new AndroidDriver(url,caps);

//        driver.get("https://google.com");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }
}
