package appiumpack1;

import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class swipeGesture {

	@Test
	public void swipeGestXY() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "vivo V21e 5G");
		dc.setCapability("UDID", "1360431040000HV");
		dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity", "com.davemorrissey.labs.subscaleview.sample.MainActivity");
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/continue_button")).click();

		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();

		driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/viewPagerGalleries")).click();

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 152, "top", 1001,
				"width", 925, "height", 1001, "direction", "left", "percent", 0.75, "speed", 1000));
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 152, "top", 1001,
				"width", 925, "height", 1001, "direction", "right", "percent", 0.5, "speed", 500));

	}

	@Test
	public void swipeGestElementID() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "vivo V21e 5G");
		dc.setCapability("UDID", "1360431040000HV");
		dc.setCapability("app", "C:\\Users\\BHIMASHANKAR\\Desktop\\Appium\\apkfile\\ApiDemos-debug.apk");
		
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	WebElement element=driver.findElement(AppiumBy.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[2]"));
		
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "direction","left","percent",0.5));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "direction","right","percent",0.3));
		
		
		
	}
}
