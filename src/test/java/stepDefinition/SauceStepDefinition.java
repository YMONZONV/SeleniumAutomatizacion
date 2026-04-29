package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.SaucePage;

public class SauceStepDefinition {
    SaucePage saucePage =new SaucePage();

    @Before
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Given("carga la pagina web de Sauce Demo")
    public void cargaLaPaginaWebDeSauceDemo() {
        saucePage.open();
        saucePage.getDriver().manage().window().maximize();
    }

    // Para @Tag01
    @When("ingreso el {string}")
    public void ingresoEl(String usuario) {
        saucePage.ingresarUsuario(usuario);
    }

    @And("ingreso {string}")
    public void ingreso(String contrasena) {
        saucePage.ingresarContrasena(contrasena);
    }

    @Then("doy clic en Login")
    public void doyClicEnLogin() {
        saucePage.login();
    }

    //Para @Tag02

    @And("ingreso el {string} en el campo username")
    public void ingresoElEnElCampoUsername(String arg0) {
        saucePage.ingresarUsuario(arg0);
    }

    @And("ingreso la {string} en el campo password")
    public void ingresoLaEnElCampoPassword(String arg0) {
        saucePage.ingresarContrasena(arg0);
    }

    @And("doy clic en el boton Login")
    public void doyClicEnElBotonLogin() {
        saucePage.login();
    }

    @And("doy clic en addtocar para agregar un producto al carrito")
    public void doyClicEnAddtocarParaAgregarUnProductoAlCarrito() {
        saucePage.addtocar();
    }

    @And("doy clic en el icono carrito para ver los productos agregados")
    public void doyClicEnElIconoCarritoParaVerLosProductosAgregados() {
        saucePage.carrito();
    }

    @When("doyc clic en el boton checkout para verificar la compra")
    public void doycClicEnElBotonCheckoutParaVerificarLaCompra() {
        saucePage.checkout();
    }

    @And("ingreso {string} en el campo first name")
    public void ingresoEnElCampoFirstName(String arg0) {
        saucePage.ingresarprimernombre(arg0);
    }

    @And("ingreso {string} en el campo last name")
    public void ingresoEnElCampoLastName(String arg0) {
        saucePage.ingresarapellido(arg0);
    }

    @And("ingreso {string} en el campo postal code")
    public void ingresoEnElCampoPostalCode(String arg0) {
        saucePage.ingresarpostal(arg0);
    }
    @And("doy clic en el boton continue entoces puedo ver el detalle de la compra")
    public void doyClicEnElBotonContinueEntocesPuedoVerElDetalleDeLaCompra() {
        saucePage.continuar();
    }

    @And("doy clic en el boton finish para completar el proceso de compra")
    public void doyClicEnElBotonFinishParaCompletarElProcesoDeCompra() {
        saucePage.finish();
    }

    @Then("doy clic en el boton back home para salir del carrito de compra a los productos")
    public void doyClicEnElBotonBackHomeParaSalirDelCarritoDeCompraALosProductos() {
        saucePage.backhome();
    }
}

