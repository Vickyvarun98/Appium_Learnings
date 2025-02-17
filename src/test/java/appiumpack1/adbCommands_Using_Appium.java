package appiumpack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class adbCommands_Using_Appium {

	public static void main(String[] args) throws MalformedURLException {
		try {
		    // Setup Appium desired capabilities
		    DesiredCapabilities dcap = new DesiredCapabilities();
	 
		    dcap.setCapability("platformName", "Android");
		    dcap.setCapability("automationName", "UiAutomator2");
		    dcap.setCapability("adbShell", true);  // Enable adbShell feature
		    dcap.setCapability("autoGrantPermission", true);
		    dcap.setCapability("appPackage", "com.android.chrome");
		    dcap.setCapability("appActivity", "com.google.android.apps.chrome.Main");

		    // Create an AndroidDriver instance
		    AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"), dcap);
		    Thread.sleep(5000);
		    // Perform some actions
			/*
			 * Thread.sleep(5000); driver.findElement(AppiumBy.xpath(
			 * "//android.widget.Button[@resource-id='com.android.chrome:id/signin_fre_continue_button']"
			 * )) .click();
			 * 
			 * Thread.sleep(2000);
			 * 
			 * driver.findElement( AppiumBy.xpath(
			 * "//android.widget.Button[@resource-id='com.android.chrome:id/button_primary']"
			 * )) .click(); Thread.sleep(2000);
			 * driver.findElement(AppiumBy.id("com.android.chrome:id/ack_button")).click();
			 * Thread.sleep(2000);
			 */
			  driver.findElement(AppiumBy.id("com.android.chrome:id/search_box_text")).
			  click(); Thread.sleep(2000);
			 

		    // Prepare and execute ADB shell command
		    Map<String, String> command = new HashMap<>();
		    System.out.println("adb shell input text \"2500\"");
		    command.put("command", "adb shell input text 2500");  // Corrected command
		    Thread.sleep(3000);
		     driver.executeScript("mobile: shell", command);
		    
		  //  System.out.println("Command Output: " + output1);
//		    command.put("command", "adb shell input keyevent 66");
//		    
//
//		    String output2 = (String) driver.executeScript("mobile: shell", command);
//		  System.out.println("Command Output: " + output2);

		} catch (Exception e) {
		    e.printStackTrace();
		}

	}

}
