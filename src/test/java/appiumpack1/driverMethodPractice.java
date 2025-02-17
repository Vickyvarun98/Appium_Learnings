package appiumpack1;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class driverMethodPractice {

	public static void main(String[] args) {

		try {
			// Setup Appium desired capabilities
			DesiredCapabilities dcap = new DesiredCapabilities();
			dcap.setCapability("platformName", "android");
			dcap.setCapability("automationName", "uiautomator2");

			AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"), dcap);
			// driver.installApp("E:/Appium_tools/apkfile/ApiDemos-debug.apk");
			if (driver.isAppInstalled("io.appium.android.apis")) {
				System.out.println("Application is  installed");
			} else {
				System.out.println("Application is not  installed");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
