package qa.mobile;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;



public class test1 {
	private static AndroidDriver<MobileElement> driver;
	
	
	
  @Test
  public void usuarioInvalido() throws Exception {
	  Thread.sleep(4000);
	  MobileElement numeroTelefono = (MobileElement) driver.findElementByXPath("//*[@id=\"mat-input-0\"]");
	  numeroTelefono.sendKeys("+56232345675");
	  
  }
  
  public void f() {
  }
  @BeforeClass
  public void beforeClass() throws Exception {

 	  try {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		  desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		  desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		  desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4");
		  desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		  desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		  desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		  desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		  desiredCapabilities.setCapability(MobileCapabilityType.APP,	
					"C:\\Users\\NB-FESCOBAR\\eclipse-workspace\\ProyectoAppium\\src\\main\\resources\\ApiDemos-debug.apk");
		  
		  //desiredCapabilities.setCapability("chromedriverExecutable", "C:\\chromeDriver");	
		  
		  URL url = new URL("http://0.0.0.0:4723/wd/hub");
		  AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
		  String sessionId = driver.getSessionId().toString();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://34.117.250.217/index.html#/cilindro/pedido-cilindro-gsc");
		  
	} catch (MalformedURLException e) {
		
		e.printStackTrace();
	}
	  
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
