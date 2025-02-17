package appiumpack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class appmClass1 {
	@Test
	public void appmCalc() throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("profileName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "vivo V21e 5G");
		dc.setCapability("UDID", "1360431040000HV");
		// open the calc app in mobile
		// adb shell dumpsys window | find "mCurrentFocus"
		// mCurrentFocus=Window{6546413 u0
		// com.vivo.calculator/com.vivo.calculator.Calculator}
		// open appium insptector and setCapalitity and cmdLine >appium and startsession

		dc.setCapability("appPackage", "com.vivo.calculator");
		dc.setCapability("appActivity", ".Calculator");
		URL u = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(AppiumBy.androidUIAutomator("com.vivo.calculator:id/digit_5")).click();

		driver.findElement(AppiumBy.id("com.vivo.calculator:id/op_add")).click();

		driver.findElement(AppiumBy.id("com.vivo.calculator:id/digit_3")).click();

		driver.findElement(AppiumBy.id("com.vivo.calculator:id/eq")).click();
		String res = driver.findElement(AppiumBy.id("com.vivo.calculator:id/formula")).getText();
		System.out.println(res);

	}

	@Test
	public void appmCalend() throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("profileName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "vivo V21e 5G");
		dc.setCapability("UDID", "1360431040000HV");
		// open the calc app in mobile
		// adb shell dumpsys window | find "mCurrentFocus"
		// mCurrentFocus=Window{6546413 u0
		// com.vivo.calculator/com.vivo.calculator.Calculator}
		// open appium insptector and setCapalitity and cmdLine >appium and startsession

		dc.setCapability("appPackage", "com.google.android.calendar");
		dc.setCapability("appActivity", "com.google.android.calendar.allinone.AllInOneCalendarActivity");
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.findElement(AppiumBy.accessibilityId("Friday 15 November
		// 2024")).click();

	}

	@Test
	public void appmTwitter() throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("android", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "vivo V21e 5G");
		dc.setCapability("UDID", "1360431040000HV");

		dc.setCapability("appPackage", "com.twitter.android");
		dc.setCapability("appActivity", ".StartActivity");
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(
				AppiumBy.xpath("//android.widget.LinearLayout[@content-desc=\"Search and Explore\"]/android.view.View"))
				.click();
		
		/*
		 * driver.findElement( AppiumBy.xpath(
		 * ""
		 * )) .sendKeys("#Kalaburagi");
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("//android.widget.TextView[@resource-id=\\\"com.twitter.android:id/query_view\\\"]")));
		element.click(); // or sendKeys
	}

}
