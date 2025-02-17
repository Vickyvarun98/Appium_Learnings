package appiumpack1;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class longPressGesture {

	@Test
	public void apidemosdebugApp() throws MalformedURLException {
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
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();

		WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		((JavascriptExecutor) driver).executeScript("mobile:longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "duration", 2000));

		String elementId = ((RemoteWebElement) element).getId();
		System.out.println("Element ID: " + elementId);

		String actText = driver
				.findElement(AppiumBy.xpath(
						"//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Sample menu\"]"))
				.getText();

		assertEquals(actText, "Sample menu");
		System.out.println(actText);

	}

	@Test
	public void apidemosdebugApp_Click() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "vivo V21e 5G");
		dc.setCapability("UDID", "1360431040000HV");
		dc.setCapability("app", "C:\\Users\\BHIMASHANKAR\\Desktop\\Appium\\apkfile\\ApiDemos-debug.apk");

		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(AppiumBy.accessibilityId("Views"));

		String elementId = ((RemoteWebElement) element).getId();
		System.out.println("Element ID: " + elementId);

		((JavascriptExecutor) driver).executeScript("mobile:clickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));

	}

	@Test
	public void apidemosdebugApp_XY() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "vivo V21e 5G");
		dc.setCapability("UDID", "1360431040000HV");
		dc.setCapability("app", "C:\\Users\\BHIMASHANKAR\\Desktop\\Appium\\apkfile\\ApiDemos-debug.apk");

		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		((JavascriptExecutor) driver).executeScript("mobile:clickGesture", ImmutableMap.of("x", 102, "y", 1778));
	}

	@Test
	public void paymentMobApp_doubliClick() throws MalformedURLException {
		// not working in 
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "vivo V21e 5G");
		dc.setCapability("UDID", "1360431040000HV");
		dc.setCapability("app", "C:\\Users\\BHIMASHANKAR\\Downloads\\Appium\\Mod APK.apk");

		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("mobile:clickGesture", ImmutableMap.of("x", 281, "y", 887));
		
		/*
		 * WebElement
		 * a=driver.findElement(AppiumBy.accessibilityId("Classic Formal Shirt $29.99"))
		 * ;
		 * 
		 * WebDriverWait waitForkashtagtextbox = new WebDriverWait(driver,
		 * Duration.ofSeconds(5));
		 * waitForkashtagtextbox.until(ExpectedConditions.visibilityOf(a));
		 * 
		 * a.click();
		 */
		/*((JavascriptExecutor) driver).executeScript("mobile:clickGesture",
	*/		//	ImmutableMap.of("elementId", ((RemoteWebElement) a).getId()));
		
		WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.ImageView"));

		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));
	

	}
}
