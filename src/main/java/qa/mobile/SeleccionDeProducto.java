package qa.mobile;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import qa.until.Utils;

public class SeleccionDeProducto extends AutomationChromeBase {
	static AppiumDriver driver;
	static FlujoPedidoEnLineaObjects inicioPage;// = new FlujoPedidoEnLineaObjects(driver);
	static WebDriverWait wait;
	static String url = "http://34.117.250.217/index.html#/cilindro/pedido-cilindro-gsc";
	static String telefono = "+5966983221";
	static int cantMaxima = 6;

	@Test(enabled = false)
	public void validarUsuarioExistente() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		inicioPage = new FlujoPedidoEnLineaObjects(driver);
		driver.get(url);
		inicioPage.getUserTxtFld().clear();
		inicioPage.getUserTxtFld().sendKeys("56913131313");
		inicioPage.clickButtonContinuarApp();
		Thread.sleep(6000);

		if (inicioPage.getTextRadioButtonApp().isDisplayed()) {
			inicioPage.clickRadioButtonApp();
			Thread.sleep(2000);
			Utils utils = new Utils(driver);
			utils.actionTounch();
			inicioPage.clickButtonDireccionContinuar();
			Thread.sleep(2000);
			inicioPage.clickButtonPopUpComoFunciona();
			Thread.sleep(6000);

		} else {
			Assert.fail("No se visualiza direccion creada");
		}

	}

	@Test(enabled = false)
	public void visualizarCatalogoDeProducto() throws Exception {

		try {
			AndroidDriver<AndroidElement> driver = setupCapabilities();
			inicioPage = new FlujoPedidoEnLineaObjects(driver);
			driver.get(url);

			inicioPage.getUserTxtFld().clear();
			inicioPage.getUserTxtFld().sendKeys("56913131313");
			inicioPage.clickButtonContinuarApp();
			Thread.sleep(6000);

			inicioPage.clickRadioButtonApp();
			Thread.sleep(2000);
			Utils utils = new Utils(driver);
			utils.actionTounch();
			inicioPage.clickButtonDireccionContinuar();
			Thread.sleep(2000);
			inicioPage.clickButtonPopUpComoFunciona();
			Thread.sleep(4000);

			if (inicioPage.getButtonAgregarCilindro().isEnabled()) {
				inicioPage.clickButtonAgregarCilindro();
			} else {
				Assert.fail("NO se encuentra catalogo");
			}

		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();
		}

	}

	@Test(enabled = true)
	public void seleccionMaximaDeProducto() throws Exception {

		try {
			AndroidDriver<AndroidElement> driver = setupCapabilities();
			inicioPage = new FlujoPedidoEnLineaObjects(driver);
			driver.get(url);

			inicioPage.getUserTxtFld().clear();
			inicioPage.getUserTxtFld().sendKeys("56913131313");
			inicioPage.clickButtonContinuarApp();
			Thread.sleep(6000);

			inicioPage.clickRadioButtonApp();
			Thread.sleep(2000);
			Utils utils = new Utils(driver);
			utils.actionTounch();
			inicioPage.clickButtonDireccionContinuar();
			Thread.sleep(2000);
			inicioPage.clickButtonPopUpComoFunciona();
			Thread.sleep(4000);

			if (inicioPage.getButtonAgregarCilindro().isEnabled()) {
				for (int i = 0; i < cantMaxima; i++) {
					inicioPage.clickButtonAgregarCilindro();
				}

					} else {
						Assert.fail("NO se encuentra catalogo");
					}

			utils.actionTounch();
			if (inicioPage.getTextMensajeMaximoCilindro().isEnabled()) {
				Assert.assertTrue(true, "Se encuentra mensaje cuando se sobre pasa el maximo de cilindro");
	
				} else {
					Assert.fail("NO se encuentra mensaje cuando se sobre pasa el maximo de cilindro");
				}

		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();
		}

	}

	@AfterTest
	public void afterTest() throws Exception {
		AndroidDriver<AndroidElement> driver = setupCapabilities();
		driver.quit();
	}

}
