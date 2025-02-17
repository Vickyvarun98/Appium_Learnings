package appiumpack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class generalStrore_switchbetweenwindow_context {
	@Test
	public void gStore() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("platformName", "android");
		dcap.setCapability("automationName", "uiautomator2");
		dcap.setCapability("appPackage", "com.androidsample.generalstore");
		dcap.setCapability("appActivity", "com.androidsample.generalstore.MainActivity");

		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"), dcap);
		// driver.installApp("E:/Appium_tools/General-Store.apk");

		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"));"))
				.click();
		//Thread.sleep(8000);
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("bshankar");
		Thread.sleep(1000);
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath(
				"//android.widget.TextView[@text='Air Jordan 1 Mid SE']/..//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"]"))
				.click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(3000);
		
		
		
		Set<String> contextHandles = driver.getContextHandles();
		int count = contextHandles.size();
		System.out.println(count);
		for (String ch : contextHandles) {
			System.out.println(ch);
			Thread.sleep(2000);
			if (ch.contains("WEBVIEW_")) {
				
//				System.out.println(driver.getTitle() + "within if");
				driver.context(ch);
			//	System.out.println(ch);
			}
		}

	//	System.out.println(driver.getTitle());
		//Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("appiummmm");

	//	driver.terminateApp("com.androidsample.generalstore");
	}

}
