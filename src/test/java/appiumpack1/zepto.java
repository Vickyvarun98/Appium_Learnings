package appiumpack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class zepto {
	AndroidDriver driver;

	@BeforeMethod
	public void openZeptoApp() throws MalformedURLException {

		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("platformName", "android");
		dcap.setCapability("automationName", "uiautomator2");
		// dcap.setCapability("deviceName", "vivo V21e 5G");
		dcap.setCapability("UDID", "1360431040000HV");

		dcap.setCapability("appPackage", "com.zeptoconsumerapp");
		dcap.setCapability("appActivity", ".MainActivity");

		URL u = new URL("http://localhost:4723");
		driver = new AndroidDriver(u, dcap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@AfterMethod
	public void closeZeptoApp() throws InterruptedException {

		// Thread.sleep(2000); driver.quit();

	}

	@Test
	public void scrollGesturehnm() throws InterruptedException {
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter Phone Number\"]")).sendKeys("8197105002");
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Continue")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
		
		
	//	((JavascriptExecutor) driver).executeScript("mobile:clickGesture", ImmutableMap.of("x", 541, "y", 1968));
		

	}
}
