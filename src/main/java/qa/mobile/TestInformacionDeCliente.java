package qa.mobile;

import java.net.MalformedURLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestInformacionDeCliente extends AutomationChromeBase {
	static AppiumDriver driver;
	static FlujoPedidoEnLineaObjects inicioPage;// = new FlujoPedidoEnLineaObjects(driver);
	static WebDriverWait wait;
	static String url = "http://34.117.250.217/index.html#/cilindro/pedido-cilindro-gsc";
	static String telefono = "+5966983221";

	@Test(enabled = false)
	public void anadirDireccionCorrecta() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		inicioPage = new FlujoPedidoEnLineaObjects(driver);
		driver.get(url);
		inicioPage.getUserTxtFld().sendKeys(telefono);
		inicioPage.clickButtonContinuarApp();
		Thread.sleep(6000);
		inicioPage.clickButtonError();
		Thread.sleep(5000);
		// -------------
		// if (inicioPage.getButtonAnadirDireccion().isEnabled()) {
		inicioPage.clickButtonAnadirDireccion();
		// Selecciona de region
		inicioPage.clickSelectRegion();
		Thread.sleep(4000);
		inicioPage.clickSelectRegion();
		Thread.sleep(2000);
		inicioPage.clickRegion();
		Thread.sleep(2000);
		// Selecciona de Comuna
		inicioPage.clickSelectComuna();
		Thread.sleep(4000);
		inicioPage.clickComuna();
		Thread.sleep(2000);

		inicioPage.getInputDireccion().sendKeys("javiera carrera");
		inicioPage.getInputEnumeracion().sendKeys("1314");
		inicioPage.getInputNumeroDepto().sendKeys("505-b");
		inicioPage.getInputComentarios().sendKeys("Pruebas Auto2");
		inicioPage.clickButtonGuardar();

		// }

		try {
			wait.until(ExpectedConditions.visibilityOf(inicioPage.getRadioButtonDireccion()));
			if (inicioPage.getRadioButtonDireccion().isEnabled()) {
				Assert.assertTrue(true, "Se visualiza la direccion creada");
			} else {
				Assert.fail("La direccion no se guardo correctamente");
			}

		} catch (Exception e) {
			System.out.println(e);// ("La opción Dirección NO se encuentra " + e);
		}

	}

	@Test(enabled = false)
	public void ingresarUsuarioExistente() throws Exception {
		try {
			AndroidDriver<AndroidElement> driver = setupCapabilities();
			inicioPage = new FlujoPedidoEnLineaObjects(driver);
			driver.get(url);
			inicioPage.getUserTxtFld().sendKeys(telefono);
			inicioPage.clickButtonContinuarApp();
			Thread.sleep(6000);
			inicioPage.clickTarjetaRadioButtonDireccion();
		} catch (Exception e) {
			Assert.fail("No hay dirección creada " + e);
		}

	}

	@Test(enabled = false)
	public void direccionInvalida() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		inicioPage = new FlujoPedidoEnLineaObjects(driver);
		driver.get(url);
		inicioPage.getUserTxtFld().sendKeys(telefono);
		inicioPage.clickButtonContinuarApp();
		Thread.sleep(6000);
		inicioPage.clickButtonError();
		Thread.sleep(5000);
		// -------------
		// if (inicioPage.getButtonAnadirDireccion().isEnabled()) {
		inicioPage.clickButtonAnadirDireccion();
		// Selecciona de region
		inicioPage.clickSelectRegion();
		Thread.sleep(4000);
		inicioPage.clickSelectRegion();
		Thread.sleep(2000);
		inicioPage.clickRegion();
		Thread.sleep(2000);
		// Selecciona de Comuna
		inicioPage.clickSelectComuna();
		Thread.sleep(4000);
		inicioPage.clickComuna();
		Thread.sleep(2000);

		inicioPage.getInputDireccion().sendKeys("234567");
		Thread.sleep(4000);
		inicioPage.clickInputEnumeracion();
		Thread.sleep(2000);
		if (inicioPage.getTextMensageErrorDireccion().isDisplayed()) {
			Assert.assertTrue(true, "Texto de error");

		} else {
			Assert.fail("No se visualiza el mensaje de error");
		}

	}

	@Test(enabled = true)
	public void numeracionInvalida() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		inicioPage = new FlujoPedidoEnLineaObjects(driver);
		driver.get(url);
		inicioPage.getUserTxtFld().sendKeys(telefono);
		inicioPage.clickButtonContinuarApp();
		Thread.sleep(6000);
		inicioPage.clickButtonError();
		Thread.sleep(5000);
		// -------------
		// if (inicioPage.getButtonAnadirDireccion().isEnabled()) {
		inicioPage.clickButtonAnadirDireccion();
		// Selecciona de region
		inicioPage.clickSelectRegion();
		Thread.sleep(4000);
		inicioPage.clickSelectRegion();
		Thread.sleep(2000);
		inicioPage.clickRegion();
		Thread.sleep(2000);
		// Selecciona de Comuna
		inicioPage.clickSelectComuna();
		Thread.sleep(4000);
		inicioPage.clickComuna();
		Thread.sleep(2000);
		inicioPage.getInputDireccion().sendKeys("hola");
		Thread.sleep(4000);
		inicioPage.clickInputEnumeracion();
		inicioPage.clickInputDireccion();
		Thread.sleep(2000);
			if (inicioPage.getTextMensageErrorNumeracion().isDisplayed()) {
				Assert.assertTrue(true, "Texto de error");
	
					} else {
						Assert.fail("No se visualiza el mensaje de error");
					}

	}

	@AfterTest
	public void afterTest() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		driver.quit();
	}

}
