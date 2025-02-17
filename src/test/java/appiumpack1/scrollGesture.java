package appiumpack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class scrollGesture {
	@Test
	public void apidemosdebugAppscrollGesture() throws MalformedURLException {
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
		/*
		 * 
		 * boolean canScrollMore = (Boolean) ((JavascriptExecutor)
		 * driver).executeScript("mobile: scrollGesture", ImmutableMap.of( "left", 200,
		 * "top", 200, "width", 200, "height", 500, "direction", "down", "percent",
		 * 0.2,"speed",1000 )); if(canScrollMore) { System.out.println(canScrollMore); }
		 */
		
		WebElement ele=driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"));"));
		//System.out.println(ele.getAccessibleName());
		ele.click();
		
		
	}
}
