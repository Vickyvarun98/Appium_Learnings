package appiumpack1;
 
		import org.openqa.selenium.*;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.io.File;
		import org.apache.commons.io.FileUtils;

		public class CanvasAutomation {
		    public static void main(String[] args) throws Exception {
		      
		        WebDriver driver = new ChromeDriver();

		        try {
		            driver.get("https://www.screener.in/company/IDEA/consolidated/");
		            WebElement chartCanvas = driver.findElement(By.id("chart-id"));

		         // Use JavaScriptExecutor to fetch data from the chart
		         JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		         String chartData = (String) jsExecutor.executeScript("return window.chartData;"); // Adjust per your chart

		         // Output the chart data
		         System.out.println("Chart Data: " + chartData);
		        } finally {
		            driver.quit();
		        }
		    }
		}
