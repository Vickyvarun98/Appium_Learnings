package appiumpack1;

import static org.testng.Assert.assertEquals;

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

public class dragGesture {

	@Test
	public void ApiDemos_dragGesture() throws MalformedURLException {
		// not working in 
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
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		WebElement element=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
				
		((JavascriptExecutor)driver).executeScript("mobile:dragGesture",ImmutableMap.of("elementId",((RemoteWebElement) element).getId(),"endX",678,"endY",1010,"speed",800));
//		driver.quit();
		WebElement dr=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"io.appium.android.apis:id/drag_result_text\"]"));
		assertEquals(dr.getText(), "Dropped!");
		
	}
}
