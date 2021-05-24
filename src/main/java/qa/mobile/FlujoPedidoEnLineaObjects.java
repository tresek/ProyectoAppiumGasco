package qa.mobile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;

public class FlujoPedidoEnLineaObjects {

	//WebDriver driver;
	AppiumDriver driver;

	public FlujoPedidoEnLineaObjects(WebDriver driver) {
		this.driver = (AppiumDriver) driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name = 'loginForm:_id11']")
	private WebElement buttonReLogin;

	public void clickButtonReLogin() {
		this.buttonReLogin.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='portletComponentWorkList_viewNormalModeWorkList_viewPanel_instanceListTableWorkList_Header4']/a")
	private WebElement fechaReceived;

	public void clickfechaReceived() {
		this.fechaReceived.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='portletComponentWorkList_viewNormalModeWorkList_viewPanel_instanceListTableWorkList']/tbody/tr[position() > 0]/td[3]/span/span")
	private List<WebElement> listaPr;

//	public List<WebElement> getListaPr() {
//		return listaPr;
//	}

	public WebElement getPr(int index) {
		return listaPr.get(index);
	}

	public int sizeListaPr() {
		return listaPr.size();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='wizardFormPrValidation:listProdVinSummary_data']/tr/td[1]")
	private List<WebElement> listaSku;

	public WebElement getListaSku(int index) {
		return listaSku.get(index);
	}

	public int sizeListaSku() {
		return listaSku.size();
	}

	// modelo de creacion de tabla
	@FindBy(how = How.XPATH, using = "//div/div[3]/table/tbody/tr/td/span/input[1]")
	private List<WebElement> listInputVendorCbm;

	public WebElement inputVendorCbm(int index) {
		return listInputVendorCbm.get(index);
	}

	@FindBy(how = How.XPATH, using = "//div/div[3]/table/tbody/tr/td[10]/span")
	private List<WebElement> listInputStatus;

	public WebElement getListInputStatus(int index) {
		return listInputStatus.get(index);
	}

	public WebElement selectTextStatus(int index) {
		return driver.findElement(By.xpath("//div/div[3]/table/tbody/tr/td[" + index + "]/span"));
	}

	// Grilla de PR Status
	@FindBy(how = How.XPATH, using = "//*[@id='wizardFormPrValidation:j_idt552:j_idt555:j_idt768:Total_data']/tr/td[7]")
	private List<WebElement> listaOptionPrPending;

	public WebElement getListaOptionPrPending(int index) {
		return listaOptionPrPending.get(index);
	}

	public int sizeListaOptionPrPending() {
		return listaOptionPrPending.size();

	}

	public WebElement clickListaOptionPrPending(int index) {
		return driver.findElement(By.xpath(
				"//*[@id='wizardFormPrValidation:j_idt552:j_idt555:j_idt768:Total_data']/tr[" + index + "]/td[1]"));
	}

	public WebElement ClicklistaOptionPrPending(int index) {
		return driver.findElement(By.xpath(
				"//*[@id='wizardFormPrValidation:j_idt552:j_idt555:j_idt768:Total_data']/tr[" + index + "]/td[1]"));
	}

	public WebElement optionCLick(int index) {
		return driver.findElement(By.xpath(
				"//*[@id='portletComponentWorkList_viewNormalModeWorkList_viewPanel_instanceListTableWorkList']/tbody/tr["
						+ index + "]/td[7]/span/span[1]/input"));
	}

	// recorrer tabla
	@FindBy(how = How.XPATH, using = "//div/div[3]/table/tbody/tr/td[11]")
	public List<WebElement> listaOptionButtonConfirm;

	public int sizeListaOptionButtonConfirm() {
		return listaOptionButtonConfirm.size();
	}

	public void clickOptionButtonConfirm(int index) {
		this.listaOptionButtonConfirm.get(index).click();
	}

	@FindBy(how = How.XPATH, using = "//button[@id='wizardFormPrValidation:bootonPrValidationNext']")
	private WebElement buttonNextAmountSummary;

	public void clickButtonNextAmountSummary() {
		this.buttonNextAmountSummary.click();
	}

	@FindBy(how = How.XPATH, using = "//div/div/ul/li[2]/a")
	private List<WebElement> listaOptionBandetras;

	public int sizeListaOptionBanderas() {
		return listaOptionBandetras.size();
	}

	public void clickListaOptionBandetras(int index) {
		this.listaOptionBandetras.get(index).click();
	}

	public void getListaOptionBandetras() {
		this.listaOptionBandetras.getClass();
	}

	@FindBy(how = How.XPATH, using = "//form/div[2]/div[3]/table/tbody/tr/td[1]/button")
	private List<WebElement> listaOptionLupa;

	public int sizeListaOptionLupa() {
		return listaOptionLupa.size();
	}

	public void clickListaOptionLupa(int index) {
		this.listaOptionLupa.get(index).click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='j_idt1074:LCL']/div[2]/span")
	private WebElement optionButtonLcl;

	public void clickOptionButtonLcl() {
		this.optionButtonLcl.click();
	}

	public WebElement getOptionButtonLcl() {
		return optionButtonLcl;
	}

//--------------------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[@id='mat-input-0']")
	private WebElement inputTelefono;

	public WebElement getInputTelefono() {
		return inputTelefono;
	}

	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[4]")
	private WebElement buttonContinuarInformacionCliente;

	public void clickButtonContinuarInformacionCliente() {
		this.buttonContinuarInformacionCliente.click();
	}

	public WebElement getButtonContinuarInformacionCliente() {
		return buttonContinuarInformacionCliente;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='pedido-cilindro-form1']/span")
	private WebElement textClick;

	public void clickTextClick() {
		this.textClick.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='mat-error-0']")
	private WebElement textErrorTelefono;

	public WebElement getTextErrorTelefono() {
		return textErrorTelefono;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='pedido-cilindro-form1']/button")
	private WebElement buttonAnadirDireccion;

	public void clickButtonAnadirDireccion() {
		this.buttonAnadirDireccion.click();
	}

	public WebElement getButtonAnadirDireccion() {
		return buttonAnadirDireccion;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-1']/span")
	private WebElement selectRegion;

	public void clickSelectRegion() {
		this.selectRegion.click();
	}

	@FindBy(how = How.XPATH, using = "//mat-option[14]/span")
	private WebElement region;

	public void clickRegion() {
		this.region.click();
	}

	@FindBy(how = How.XPATH, using = "//div[@id='mat-select-value-3']/span")
	private WebElement selectComuna;

	public void clickSelectComuna() {
		this.selectComuna.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='mat-option-22']/span")
	private WebElement comuna;

	public void clickComuna() {
		this.comuna.click();
	}

	public WebElement getComuna() {
		return comuna;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-1']")
	private WebElement inputDireccion;

	public WebElement getInputDireccion() {
		return inputDireccion;

	}
	public void clickInputDireccion() {
		this.inputDireccion.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-2']")
	private WebElement inputEnumeracion;

	public WebElement getInputEnumeracion() {
		return inputEnumeracion;

	}
	public void clickInputEnumeracion() {
		this.inputEnumeracion.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-3']")
	private WebElement inputNumeroDepto;

	public WebElement getInputNumeroDepto() {
		return inputNumeroDepto;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-4']")
	private WebElement inputComentarios;

	public WebElement getInputComentarios() {
		return inputComentarios;

	}

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement buttonGuardar;

	public void clickButtonGuardar() {
		this.buttonGuardar.click();
	}

	public WebElement getButtonGuardar() {
		return buttonGuardar;

	}

	@FindBy(how = How.XPATH, using = "//form[@id='pedido-cilindro-form1']/mat-radio-group/mat-card")
	private WebElement tarjetaRadioButtonDireccion;

	public void clickTarjetaRadioButtonDireccion() {
		this.tarjetaRadioButtonDireccion.click();

	}

	public WebElement getTarjetaRadioButtonDireccion() {
		return tarjetaRadioButtonDireccion;

	}

	@FindBy(how = How.XPATH, using = "//mat-radio-button[@id='mat-radio-4']/label/span[1]")
	private WebElement radioButtonDireccion;

	public void clickRadioButtonDireccion() {
		this.radioButtonDireccion.click();
	}

	public WebElement getRadioButtonDireccion() {
		return radioButtonDireccion;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='pedido-cilindro-form1']/div[2]/button[2]")
	private WebElement buttonDireccionContinuar;

	public void clickButtonDireccionContinuar() {
		this.buttonDireccionContinuar.click();
	}

	public WebElement getButtonDireccionContinuar() {
		return buttonDireccionContinuar;

	}

	@FindBy(how = How.XPATH, using = "//*[@id='mat-dialog-0']/app-modal-instrucciones/div/button")
	private WebElement buttonPopUpComoFunciona;

	public void clickButtonPopUpComoFunciona() {
		this.buttonPopUpComoFunciona.click();
	}

	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[5]")
	private WebElement buttonAgregarCilindro;

	public void clickButtonAgregarCilindro() {
		this.buttonAgregarCilindro.click();
	}

	public WebElement getButtonAgregarCilindro() {
		return buttonAgregarCilindro;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(.,'TU PEDIDO')]")
	private WebElement buttonTuPedido;

	public void clickButtonTuPedido() {
		this.buttonTuPedido.click();
	}

	public WebElement getButtonTuPedido() {
		return buttonTuPedido;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='cdk-overlay-3']/div/ul/li/span[1]")
	private WebElement textCantidadCilindrosTuPedido;

	public WebElement getTextCantidadCilindrosTuPedido() {
		return textCantidadCilindrosTuPedido;
	}

	@FindBy(how = How.XPATH, using = "//div[2]/span[2]")
	private WebElement textTotalTuPedido;

	public WebElement getTextTotalTuPedido() {
		return textTotalTuPedido;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(.,'Eliminar')]")
	private WebElement buttonEliminarPedido;

	public void clickButtonEliminarPedido() {
		this.buttonEliminarPedido.click();
	}

	public WebElement getButtonEliminarPedido() {
		return buttonEliminarPedido;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Agregar cilindro vacío')]")
	private WebElement buttonAgregarCilindroVacio;

	public void clickButtonAgregarCilindroVacio() {
		this.buttonAgregarCilindroVacio.click();
	}

	public WebElement getButtonAgregarCilindroVacio() {
		return buttonAgregarCilindroVacio;
	}

	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[16]")
	private WebElement buttonSumarCilindroVacio;

	public void clickButtonSumarCilindroVacio() {
		this.buttonSumarCilindroVacio.click();
	}

	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[19]")
	private WebElement buttonConfirmarCilindroVacio;

	public void clickButtonConfirmarCilindroVacio() {
		this.buttonConfirmarCilindroVacio.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='cdk-overlay-9']/div/ul/li[2]/span[2]")
	public List<WebElement> listaTextCilindroVacio;

	public int sizeListaTextCilindroVacio() {
		return listaTextCilindroVacio.size();
	}

	public void getListaTextCilindroVacio(int index) {
		this.listaTextCilindroVacio.get(index).getText();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='cdk-overlay-3']/div/ul/li[2]/span[1]")
	private WebElement textCilindroVacio;

	public WebElement getTextCilindroVacio() {
		return textCilindroVacio;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Cilindro catalítico')]")
	private WebElement buttonCilindroCatalitico;

	public WebElement getButtonCilindroCatalitico() {
		return buttonCilindroCatalitico;
	}

	public void clickButtonCilindroCatalitico() {
		this.buttonCilindroCatalitico.click();
	}

	@FindBy(how = How.XPATH, using = "//div/div/div/button/mat-icon")
	private WebElement cerrarTuPedido;

	public void clickCerrarTuPedido() {
		this.cerrarTuPedido.click();
	}

	@FindBy(how = How.XPATH, using = "//button[contains(.,'CONTINUAR')]")
	private WebElement buttonContinuarSeleccionProducto;

	public WebElement getButtonContinuarSeleccionProducto() {
		return buttonContinuarSeleccionProducto;
	}

	public void clickButtonContinuarSeleccionProducto() {
		this.buttonContinuarSeleccionProducto.click();
	}

	@FindBy(how = How.XPATH, using = "//button[contains(.,'VOLVER')]")
	private WebElement buttonVolverSeleccionProducto;

	public WebElement getButtonVolverSeleccionProducto() {
		return buttonContinuarSeleccionProducto;
	}

	public void clickButtonVolverSeleccionProducto() {
		this.buttonContinuarSeleccionProducto.click();
	}

	// ---------------------Elementos Informacion de Pago----------------------

	@FindBy(how = How.XPATH, using = "//div/mat-icon")
	private WebElement buttonResumenPedido;

	public WebElement getButtonResumenPedido() {
		return buttonResumenPedido;
	}

	public void clickButtonResumenPedido() {
		this.buttonResumenPedido.click();
	}

	@FindBy(how = How.XPATH, using = "//li[1]/span[2]")
	private WebElement textTelefonoResumenPedido;

	public WebElement getTextTelefonoResumenPedido() {
		return textTelefonoResumenPedido;
	}

	@FindBy(how = How.XPATH, using = "//li[2]/span[2]")
	private WebElement textDireccionResumenPedido;

	public WebElement getTextDireccionResumenPedido() {
		return textDireccionResumenPedido;
	}

	@FindBy(how = How.XPATH, using = "//li[3]/span[2]")
	private WebElement textReferenciaResumenPedido;

	public WebElement getTextReferenciaResumenPedido() {
		return textReferenciaResumenPedido;
	}

	@FindBy(how = How.XPATH, using = "//div[3]/span[2]")
	private WebElement textTotalCompraResumenPedido;

	public WebElement getTextTotalCompraResumenPedido() {
		return textTotalCompraResumenPedido;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-5']")
	private WebElement inputNombreInformacionPago;

	public WebElement getInputNombreInformacionPago() {
		return inputNombreInformacionPago;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='mat-input-6']")
	private WebElement inputCorreoInformacionPago;

	public WebElement getInputCorreoInformacionPago() {
		return inputCorreoInformacionPago;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='mat-input-7']")
	private WebElement inputRutInformacionPago;

	public WebElement getInputRutInformacionPago() {
		return inputRutInformacionPago;
	}

	@FindBy(how = How.XPATH, using = "//mat-error")
	private WebElement textErrorCorreoInformacionPago;

	public WebElement getTextErrorCorreoInformacionPago() {
		return textErrorCorreoInformacionPago;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='pedido-cilindro-form3']/span[1]")
	private WebElement textIndicanosTusDatosContacto;

	public WebElement getTextIndicanosTusDatosContacto() {
		return textIndicanosTusDatosContacto;
	}

	public void clickTextIndicanosTusDatosContacto() {
		this.textIndicanosTusDatosContacto.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='mat-error-5']")
	private WebElement textErrorNombreInformacionPago;

	public WebElement getTextErrorNombreInformacionPago() {
		return textErrorNombreInformacionPago;
	}

	@FindBy(how = How.XPATH, using = "//mat-error[contains(.,'El rut ingresado no es válido')]")
	private WebElement textErrorRutInformacionPago;

	public WebElement getTextErrorRutInformacionPago() {
		return textErrorRutInformacionPago;
	}

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement buttonContinuarPedidoInformacionPago;

	public WebElement getButtonContinuarPedidoInformacionPago() {
		return buttonContinuarPedidoInformacionPago;
	}

	public void clickButtonContinuarPedidoInformacionPago() {
		this.buttonContinuarPedidoInformacionPago.click();
	}

	// Seleccion de medio de pago
//	@FindBy(how = How.XPATH, using = "//mat-select")
//	private WebElement selectMedioDePago;
//
//	public WebElement getSelectMedioDePago() {
//		return selectMedioDePago;
//	}

	@FindBy(how = How.XPATH, using = "//*[@id='mat-select-4']/div/div[2]")
	private WebElement selectMedioDePago;

	public void clickSelectMedioDePago() {
		this.selectMedioDePago.click();
	}

	public WebElement getSelectMedioDePago() {
		return selectMedioDePago;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Cupon Vale')]")
	private WebElement medioDePago;

	public void clickMedioDePago() {
		this.medioDePago.click();
	}

	public WebElement getMedioDePago() {
		return medioDePago;
	}

	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]")
	private WebElement buttonSumarCilindroInformacionPago;

	public void clickButtonSumarCilindroInformacionPago() {
		this.buttonSumarCilindroInformacionPago.click();
	}

	public WebElement getButtonSumarCilindroInformacionPago() {
		return buttonSumarCilindroInformacionPago;
	}

	@FindBy(how = How.XPATH, using = "//li/div[2]")
	private WebElement cantidadCilindroResumenPedido;

	public WebElement getCantidadCilindroResumenPedido() {
		return cantidadCilindroResumenPedido;
	}

	// Elemento de Resumen de pedido

	@FindBy(how = How.XPATH, using = "//*[@id='pago-cuenta-form4']/span[2]")
	private WebElement textHoraFechaResumenPedido;

	public WebElement getTextHoraFechaResumenPedido() {
		return textHoraFechaResumenPedido;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='pago-cuenta-form4']/span[5]")
	private WebElement textTelefonoResumenPedidoR;

	public WebElement getTextTelefonoResumenPedidoR() {
		return textTelefonoResumenPedidoR;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='pago-cuenta-form4']/span[7]")
	private WebElement textDireccionResumenPedidoR;

	public WebElement getTextDireccionResumenPedidoR() {
		return textDireccionResumenPedidoR;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='pago-cuenta-form4']/span[9]")
	private WebElement textReferenciaResumenPedidoR;

	public WebElement getTextReferenciaResumenPedidoR() {
		return textReferenciaResumenPedidoR;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='pago-cuenta-form4']/span[11]")
	private WebElement textMedioDePagoResumenPedido;

	public WebElement getTextMedioDePagoResumenPedido() {
		return textMedioDePagoResumenPedido;
	}

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement buttonContinuarPedidoResumenPedido;

	public WebElement getButtonContinuarPedidoResumenPedido() {
		return buttonContinuarPedidoResumenPedido;
	}

	public void clickButtonContinuarPedidoResumenPedido() {
		this.buttonContinuarPedidoResumenPedido.click();
	}


	@FindBy(how = How.XPATH, using = "//button[contains(.,'VOLVER')]")
	private WebElement buttonVolverResumenDePedido;

	public WebElement getButtonVolverResumenDePedido() {
		return buttonVolverResumenDePedido;
	}

	public void clickButtonVolverResumenDePedido() {
		this.buttonVolverResumenDePedido.click();
	}
	
	//-------------------------Elementos de Finalzar Pedido
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'¡Pedido realizado con exito!')]")
	private WebElement textPedidoRealizadoConExito;

	public WebElement getTextPedidoRealizadoConExito() {
		return textPedidoRealizadoConExito;
	}

	@FindBy(how = How.XPATH, using = "//span[5]")
	private WebElement textNumeroPedido;

	public WebElement getTextNumeroPedido() {
		return textNumeroPedido;
	}

	@FindBy(how = How.XPATH, using = "//span[7]")
	private WebElement textHoraEstimada;

	public WebElement getTextHoraEstimada() {
		return textHoraEstimada;
	}
	
	@FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]")
	private WebElement buttonVolverAlInicioFinalizarPedido;

	public WebElement getButtonVolverAlInicioFinalizarPedido() {
		return buttonVolverAlInicioFinalizarPedido;
	}

	public void clickButtonVolverAlInicioFinalizarPedido() {
		this.buttonVolverAlInicioFinalizarPedido.click();
	}

	@FindBy(how = How.XPATH, using = "//*[@id='btn-header-encuentranos']")
	private WebElement buttonHomeCl;

	public WebElement getButtonHomeCl() {
		return buttonHomeCl;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(.,'Cerrar')]")
	private WebElement buttonError;

	public WebElement getButtonError() {
		return buttonError;
	}
	
	public void clickButtonError() {
		this.buttonError.click();
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='mat-input-0']")
	private WebElement userTxtFld;

	public WebElement getUserTxtFld() {
		return userTxtFld;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='pedido-cilindro-form1']/div[2]/button[2]")
	private WebElement buttonContinuar;

	public void clickButtonContinuarApp() {
		this.buttonContinuar.click();
	}
	
	@FindBy(how = How.XPATH, using = "//mat-radio-button[@id='mat-radio-2']/label/span/span")
	private WebElement radioButtonApp;

	public WebElement getRadioButtonApp() {
		return radioButtonApp;
	}

	public void clickRadioButtonApp() {
		this.radioButtonApp.click();
	}
	
	@FindBy(how = How.XPATH, using = "//mat-error[contains(.,'La direcci�n es requerida')]")
	private WebElement textMensageErrorDireccion;

	public WebElement getTextMensageErrorDireccion() {
		return textMensageErrorDireccion;
	}
	
	@FindBy(how = How.XPATH, using = "//mat-error[contains(.,'La numeraci�n es requerida')]")
	private WebElement textMensageErrorNumeracion;

	public WebElement getTextMensageErrorNumeracion() {
		return textMensageErrorNumeracion;
	}


	
	@FindBy(how = How.XPATH, using = "//*[@id='mat-radio-2']/label/span[2]/span[2]")
	private WebElement textRadioButtonApp;

	public WebElement getTextRadioButtonApp() {
		return textRadioButtonApp;
	}

	@FindBy(how = How.XPATH, using = "//app-exito-snackbar/span")
	private WebElement textMensajeMaximoCilindro;

	public WebElement getTextMensajeMaximoCilindro() {
		return textMensajeMaximoCilindro;
	}
	
	
	
	
	
	
}
