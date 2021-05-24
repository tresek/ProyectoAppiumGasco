package qa.until;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class Utils {
	WebDriver driver;
	
	public Utils(WebDriver driver) {
		this.driver =  driver;
		
	}	
	
	public String actionTounch() {
		Dimension dim = ((WebDriver) driver).manage().window().getSize();
		int x = dim.getWidth() / 2;
		int startY = (int) (dim.getHeight() * 0.8);
		int endY = (int) (dim.getHeight() * 0.2);

		TouchAction t = new TouchAction((PerformsTouchActions) driver);
		t.press(PointOption.point(x, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
				.moveTo(PointOption.point(x, endY)).release().perform();
		return null;
		
	} 

}
