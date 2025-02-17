package appiumpack1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class mobile_webBrowser {
	@Test
	public void googleSearch() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("platformName", "android");
		dcap.setCapability("automationName", "uiautomator2");
		dcap.setCapability("browserName", "chrome");
		dcap.setCapability("autoGrantPermissions", true);
		dcap.setCapability("noReset", true); // Prevent clearing app data
		  ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications"); // Suppress notifications
	        dcap.setCapability("goog:chromeOptions", options); // Pass ChromeOptions to capabilities
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"), dcap);
		driver.get("https://www.irctc.co.in/nget/");
		Thread.sleep(4000);
	//	driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.chrome:id/positive_button\"]")).click();
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']")).sendKeys("SBC"+Keys.ENTER);
	}
}
