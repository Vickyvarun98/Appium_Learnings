package appiumpack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class hnm_Task_endToEndScen_AllGestures {
	AndroidDriver driver;

	@BeforeMethod
	public void openhm() throws MalformedURLException {

		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("platformName", "android");
		dcap.setCapability("automationName", "uiautomator2");
		// dcap.setCapability("deviceName", "vivo V21e 5G");
		dcap.setCapability("UDID", "1360431040000HV");

		dcap.setCapability("appPackage", "com.hm.goe");
		dcap.setCapability("appActivity", ".startup.StartupActivity");

		URL u = new URL("http://localhost:4723");
		driver = new AndroidDriver(u, dcap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// ScrollGesture
		WebElement ele = driver.findElement(AppiumBy
				.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India/English\"));"));

		ele.click();
		driver.findElement(AppiumBy.id("com.hm.goe:id/btn_accept_cookies")).click();
		driver.findElement(AppiumBy.id("android:id/button2")).click();
	}

	@AfterMethod
	public void closehnm() throws InterruptedException {

//	  driver.findElement(AppiumBy.xpath(
//	  "//android.view.ViewGroup[@resource-id=\"com.hm.goe:id/hm_toolbar\"]/android.widget.ImageButton"
//	  )).click(); driver.findElement(AppiumBy.xpath(
//	  "//android.widget.ImageView[@content-desc=\"logo\"]")).click();
//	  
	//	Thread.sleep(2000);	  driver.quit();

	}

	@Test
	public void scrollGesturehnm() {
		driver.findElement(AppiumBy.id("com.hm.goe:id/banner_container_icon")).click();

		WebElement ele = driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Men\"));"));

		ele.click();
		driver.findElement(AppiumBy.xpath(
				"//android.view.ViewGroup[@resource-id=\"com.hm.goe:id/hm_toolbar\"]/android.widget.ImageButton"))
				.click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Home\"]")).click();

	}

	@Test
	public void doubleGesturehnm() throws MalformedURLException {

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Black and white tailoring\"));"));

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.hm.goe:id/text_headline\"]"))
				.click();

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Ckrinkled chiffon blouse\"]")).click();

		WebElement element = driver.findElement(AppiumBy.id("com.hm.goe:id/carouselImage"));

		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId()));

		WebElement element2 = driver.findElement(AppiumBy.id("com.hm.goe:id/fragment_container"));

		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element2).getId()));

		driver.findElement(AppiumBy.id("com.hm.goe:id/ivCloseCarousel")).click();

		driver.findElement(AppiumBy.id("com.hm.goe:id/stickyAtbButton")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"M\"]")).click();

		driver.findElement(AppiumBy.xpath(
				"//android.view.ViewGroup[@resource-id=\"com.hm.goe:id/brokenOutSizeSelector\"]/android.view.View/android.view.View[7]/android.widget.Button"))
				.click();
		driver.findElement(AppiumBy.id("com.hm.goe:id/hm_shoppingbag_count")).click();
		driver.findElement(AppiumBy.xpath(
				"//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.hm.goe:id/composeView\"]/android.view.View/android.view.View/android.view.View[5]/android.widget.Button"))
				.click();

		driver.findElement(AppiumBy.id("com.google.android.gms:id/cancel")).click();

	}

	@Test
	public void swipeGesture() throws InterruptedException {
		driver.findElement(AppiumBy.id("com.hm.goe:id/banner_container_icon")).click();
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Kids\"));"));

		driver.findElement(AppiumBy
				.xpath("//android.widget.TextView[@resource-id=\"com.hm.goe:id/simple_row_text\" and @text=\"Kids\"]"))
				.click();

		driver.findElement(AppiumBy.xpath("(//android.view.View[@resource-id=\"com.hm.goe:id/productTile\"])[1]"))
				.click();

		// driver.findElement(AppiumBy.id("com.hm.goe:id/carouselImage")).click();

		WebElement element = driver.findElement(AppiumBy.id("com.hm.goe:id/carouselImage"));

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) element).getId(), "direction", "left", "percent", 0.5));

		driver.findElement(AppiumBy.id("com.hm.goe:id/stickyAtbButton")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Size guide\"]")).click();

		driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
		driver.findElement(AppiumBy.id("com.hm.goe:id/action_feed_favourite")).click();

		WebElement fav = driver.findElement(AppiumBy.id("com.hm.goe:id/errorTitle"));
		System.out.println(fav.getText());
	}

	@Test
	public void pinchGesture() throws InterruptedException {

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Loose Fit Sweatshirt\"));"));

		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"com.hm.goe:id/productName\"])[2]"))
				.click();

		driver.findElement(AppiumBy.id("com.hm.goe:id/carouselImage")).click();
		WebElement element = driver.findElement(AppiumBy.id("com.hm.goe:id/carouselPhotoView"));

		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "percent", 0.5, "speed", 500));
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "percent", 0.5), "speed", 1000);
		driver.findElement(AppiumBy.id("com.hm.goe:id/ivCloseCarousel")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
		// driver.findElement(AppiumBy.id("com.hm.goe:id/action_search_button")).click();
		/*
		 * driver.findElement(AppiumBy.xpath("//android.view.View")).click();
		 * driver.findElement(AppiumBy.xpath(
		 * "//android.widget.TextView[@text=\"Search\"]")).sendKeys("jeens");
		 * driver.findElement(AppiumBy.
		 * xpath("//android.widget.TextView[@text=\"jeans men\"]")).click();
		 * driver.findElement(AppiumBy.
		 * xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click()
		 * ;
		 * 
		 * driver.findElement(AppiumBy.xpath(
		 * "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button"
		 * )).click();
		 */

	}

	@Test
	public void dragGesture() throws InterruptedException {

		driver.findElement(AppiumBy.id("com.hm.goe:id/merch_text_container")).click();
		driver.findElement(AppiumBy.xpath(
				"//android.widget.TextView[@resource-id=\"com.hm.goe:id/teaserLinkTextView\" and @text=\"Home\"]"))
				.click();
		driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"No Data\"]")).click();
		WebElement element = driver.findElement(AppiumBy.accessibilityId("Range end"));
		((JavascriptExecutor) driver).executeScript("mobile:dragGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) element).getId(), "endX", 218, "endY", 518, "speed", 800));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Metal cake slice\"]")).click();
		driver.findElement(AppiumBy.id("com.hm.goe:id/banner_container_description")).click();
		driver.findElement(AppiumBy.xpath("(//android.view.View[@resource-id=\"com.hm.goe:id/ptImage\"])[9]")).click();

		/*
		 * driver.findElement(AppiumBy.xpath(
		 * "(//android.view.View[@resource-id=\"com.hm.goe:id/ptImage\"])[12]")).click()
		 * ; Thread.sleep(3000);
		 * 
		 * driver.findElement(AppiumBy.
		 * id("(//android.widget.TextView[@text=\"H&M HOME FOR THE LOVE OF ART\"])[1]"))
		 * .click();
		 * driver.findElement(AppiumBy.id("com.hm.goe:id/buttonText")).click();
		 * driver.findElement(AppiumBy.id("com.hm.goe:id/hm_shoppingbag_count")).click()
		 * ;
		 * 
		 * driver.findElement(AppiumBy.xpath(
		 * "//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.hm.goe:id/composeView\"]/android.view.View/android.view.View/android.view.View[6]/android.widget.Button"
		 * )).click();
		 * driver.findElement(AppiumBy.id("com.google.android.gms:id/cancel")).click();
		 * 
		 * driver.findElement(AppiumBy.id("com.hm.goe:id/edit_text_email")).sendKeys(
		 * "bshankarsg55@gmail.com");
		 * driver.findElement(AppiumBy.id("com.hm.goe:id/buttonText")).click();
		 * driver.findElement(AppiumBy.id("com.hm.goe:id/edit_text_password")).sendKeys(
		 * "Ghattargi@2195");
		 * driver.findElement(AppiumBy.id("com.hm.goe:id/buttonText")).click();
		 * driver.findElement(AppiumBy.id("android:id/autofill_save_no")).click();
		 * 
		 */

		/*
		 * WebElement selitembutton=driver.findElement(AppiumBy.xpath(
		 * "//driver.findElement(AppiumBy.xpath(\"(//android.view.View[@resource-id=\\\"com.hm.goe:id/ptImage\\\"])[9]\")).click();"
		 * )); Thread.sleep(3000); WebDriverWait wait=new WebDriverWait(driver,
		 * Duration.ofSeconds(5));
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(selitembutton));
		 * selitembutton.click();
		 */

	}

	@Test
	public void loginToHnM() throws InterruptedException {
		driver.findElement(AppiumBy.id("com.hm.goe:id/action_hub")).click();
		driver.findElement(AppiumBy.id("com.google.android.gms:id/cancel")).click();
		
		/*
		 * driver.findElement(AppiumBy.xpath(
		 * ("(//android.widget.TextView[@text=\"Sign in\"])[1]"))).click();
		 * driver.findElement(AppiumBy.id("com.google.android.gms:id/cancel")).click();
		 * driver.findElement(AppiumBy.id("com.hm.goe:id/action_bar_root")).click();
		 */
		
		
		driver.findElement(AppiumBy.id("com.hm.goe:id/usernameEditText")).sendKeys("bshankarsg55@gmail.com");
		driver.findElement(AppiumBy.id("com.hm.goe:id/passwordEditText")).sendKeys("Ghattargi@2195");
		driver.findElement(AppiumBy.id("com.hm.goe:id/signInBtn")).click();
		//driver.findElement(AppiumBy.id("android:id/autofill_save_no")).click();
		Thread.sleep(3000);
		
	  driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"com.hm.goe:id/hm_toolbar\"]/android.widget.ImageButton")).click(); 
	  driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"logo\"]")).click();
	driver.findElement(AppiumBy.accessibilityId("Back")).click();
		
		
		

	}
}
