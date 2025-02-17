package appiumpack1;


import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class radioGardenPerformanceTest {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.hm.goe"); // Replace with your app's package
        caps.setCapability("appActivity", ".startup.StartupActivity");    // Replace with your app's main activity
       

        // Initialize driver
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"), caps);

        // Cold Start
        driver.terminateApp("com.hm.goe"); // Ensures app is not running
        long coldStartTimeStart = System.currentTimeMillis();
        driver.activateApp("com.hm.goe");
        long coldStartTimeEnd = System.currentTimeMillis();
        long coldStartTime = coldStartTimeEnd - coldStartTimeStart;
        
        
        System.out.println("Cold Start Time: " + coldStartTime + " ms");

        // Warm Start
        driver.runAppInBackground(Duration.ofSeconds(2)); // App is in the background
        long warmStartTimeStart = System.currentTimeMillis();
        driver.activateApp("com.hm.goe");
        long warmStartTimeEnd = System.currentTimeMillis();
        long warmStartTime = warmStartTimeEnd - warmStartTimeStart;
        System.out.println("Warm Start Time: " + warmStartTime + " ms");

        // Hot Start
        driver.terminateApp("com.hm.goe");
        driver.activateApp("com.hm.goe"); // Start the app to be in memory
        long hotStartTimeStart = System.currentTimeMillis();
        driver.activateApp("com.hm.goe"); // Resume app from running state
        long hotStartTimeEnd = System.currentTimeMillis();
        long hotStartTime = hotStartTimeEnd - hotStartTimeStart;

        // Display results
       
       
        System.out.println("Hot Start Time: " + hotStartTime + " ms");

        // Quit the driver
     //   driver.quit();
    }
}
