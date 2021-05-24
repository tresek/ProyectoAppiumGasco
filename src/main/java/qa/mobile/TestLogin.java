package qa.mobile;

import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestLogin extends AutomationChromeBase {
	static WebDriverWait wait;
	static String url = "http://34.117.250.217/index.html#/cilindro/pedido-cilindro-gsc";
//	MobileElement userTxtFld = (MobileElement) driver.findElementByXPath("//*[@id='mat-input-0']");
//	MobileElement btn = (MobileElement) driver.findElementByXPath("//*[@id='pedido-cilindro-form1']/div[2]/button[2]");
//	MobileElement btnDelete = (MobileElement) driver
//			.findElementByXPath("//*[@id='pedido-cilindro-form1']/mat-form-field/div/div[1]/div[4]/button");
//	MobileElement messageDeleteUser = (MobileElement) driver.findElementByXPath("//*[@id='mat-error-0']");
//	MobileElement btnVolver = (MobileElement) driver
//			.findElementByXPath("//button[@class='mat-ripple pasoPedido1__acciones__atras ng-star-inserted']");

	
	
	@Test
	public void usuarioErroneo2() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		driver.get(url);

		MobileElement userTxtFld = (MobileElement) driver.findElementByXPath("//*[@id='mat-input-0']");
		MobileElement btn = (MobileElement) driver.findElementByXPath("//*[@id='pedido-cilindro-form1']/div[2]/button[2]");

		userTxtFld.sendKeys("+596234edf");
		// btn.click();
		try {
			wait.until(ExpectedConditions.visibilityOf(btn)).isEnabled();
			Assert.fail("Boton se encuentra habilitado");

		} catch (Exception e) {
			Assert.assertTrue(true, "Se puede visualizar el Botón deshabilitado, cuando se ingresa rut incorrecto");
		}

	}

	@Test
	public void usuarioValido() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		driver.get(url);
	    MobileElement userTxtFld = (MobileElement) driver.findElementByXPath("//*[@id='mat-input-0']");
		MobileElement btn = (MobileElement) driver.findElementByXPath("//*[@id='pedido-cilindro-form1']/div[2]/button[2]");
		userTxtFld.sendKeys("+59623441213");
		boolean isEnable = btn.isEnabled();
		if (!isEnable) {
			Assert.fail("Boton se encuentra Deshabilitado");
		}

	}

	@Test
	public void borrarUsuario() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		driver.get(url);
		MobileElement userTxtFld = (MobileElement) driver.findElementByXPath("//*[@id='mat-input-0']");
		MobileElement btn = (MobileElement) driver.findElementByXPath("//*[@id='pedido-cilindro-form1']/div[2]/button[2]");
		userTxtFld.sendKeys("+59623441");

		MobileElement btnDelete = driver
				.findElementByXPath("//*[@id='pedido-cilindro-form1']/mat-form-field/div/div[1]/div[4]/button");
		btnDelete.click();
		Thread.sleep(3000);
		MobileElement messageDeleteUser = driver.findElementByXPath("//*[@id='mat-error-0']");
		Thread.sleep(3000);

		boolean isDisplayed = messageDeleteUser.isDisplayed();
		if (!isDisplayed) {
			Assert.fail("Usuario no fue Borrado");
			System.out.println(messageDeleteUser.getText());
		}
	}

	@Test
	public void clickBtnVolver() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		driver.get(url);
		MobileElement userTxtFld = driver.findElementByXPath("//*[@id='mat-input-0']");
		MobileElement btnVolver = driver
				.findElementByXPath("//button[@class='mat-ripple pasoPedido1__acciones__atras ng-star-inserted']");
		userTxtFld.sendKeys("+59623441");
		btnVolver.click();
		Thread.sleep(3000);
		

	}

	@AfterTest
	public void afterTest() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		driver.quit();
	}

}
