package qa.mobile;

import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestLoginTng {
	public static AndroidDriver<AndroidElement> setupCapabilities() {
		return null;
	}
	
	 @Test
	  public void usuarioInvalido() throws Exception {
			

				// 1
				AndroidDriver<AndroidElement> driver = setupCapabilities();
				
				// 2
				//driver.get("http://34.117.250.217/index.html#/cilindro/pedido-cilindro-gsc");
		    
				// 3
				driver.findElementByXPath("//*[@id='mat-input-0']").sendKeys("+5629876 5434");
				driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("your_password");
				driver.findElementByXPath("//*[@id=\"u_0_6\"]").click();	
			
		
	 }
  public void f() {
  }
  
  @BeforeTest
  public AndroidDriver<AndroidElement> beforeTest() throws MalformedURLException {
	// 1 Create Device Capabilities.
			DesiredCapabilities cap = new DesiredCapabilities();
			
			// 2 Setup a device name. This capability is currently ignored, but remains required on Android.		
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4");
			
			// 3 Setup a name of Android web browser to automate.
			cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
							
			// 4 Create an Android driver to initiate the session to Appium server. 
			URL url = new URL("http://127.0.0.1:4723/wd/hub");					
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
			driver.get("http://facebook.com");
			
			return driver;
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
