package appiumpack1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class serverStart_ToastTest {
	@Parameters({"deviceName", "UDID","port"})
	@Test
	
	public void generalstore1(String deviceName,String UDID,String port) throws MalformedURLException, InterruptedException {
		// To 
		
		File f=new File("C:\\Users\\BHIMASHANKAR\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(500)).build();
		service.start();
		 
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("platformName", "android");
		dcap.setCapability("automationName", "uiautomator2");
		
	//	dcap.setCapability("browserName", "chrome");
		dcap.setCapability("autoGrantPermissions", true);
		dcap.setCapability("noReset", true); // Prevent clearing app data
		dcap.setCapability("appPackage", "com.androidsample.generalstore");
		dcap.setCapability("appActivity", "com.androidsample.generalstore.MainActivity");
		dcap.setCapability("deviceName", deviceName);
		dcap.setCapability("UDID",UDID);
		dcap.setCapability("systemPort", port); // Unique system port for each device
		//System.err.println("http://localhost:"+port);
		AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"), dcap);
		service.stop();
		//driver.manage().timeouts().implicitlyWait(driver, Duration.ofSeconds(20));
		
		
		
	}
}
