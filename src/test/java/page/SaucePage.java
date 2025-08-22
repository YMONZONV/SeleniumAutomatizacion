package page;

import generic.WebDriverDOM;
import net.serenitybdd.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@DefaultUrl("https://www.saucedemo.com/")

public class SaucePage extends WebDriverDOM {

    @FindBy(id="user-name")
    private WebElement txtusuario;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement txtcontra;

    @FindBy(name = "login-button")
    private WebElement btnlogin;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement btnadd;

    @FindBy(className = "shopping_cart_link")
    private WebElement btncar;

    @FindBy(id="checkout")
    private WebElement btncheck;

    @FindBy(id="first-name")
    private WebElement txtnombre;

    @FindBy(id="last-name")
    private WebElement txtapellido;

    @FindBy(id="postal-code")
    private WebElement txtpostal;

    @FindBy(id="continue")
    private WebElement txtcontinuar;

    @FindBy(xpath = "//button[@class='btn btn_action btn_medium cart_button']")
    private WebElement txtfinish;

    @FindBy(id="back-to-products")
    private WebElement txtbackhome;

    public void ingresarUsuario(String usuario) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(txtusuario));
        txtusuario.click();
        txtusuario.sendKeys(usuario);
    }

    public void ingresarContrasena(String contrasena) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(txtcontra));
        txtcontra.click();
        txtcontra.sendKeys(contrasena);
    }

    public void login() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(btnlogin));
        btnlogin.click();
    }

    public void addtocar() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(btnadd));
        btnadd.click();

    }
    public void carrito() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(btncar));
        btncar.click();
    }

    public void checkout() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(btncheck));
        btncheck.click();
    }
    public void ingresarprimernombre(String primernombre) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(txtnombre));
        txtnombre.click();
        txtnombre.sendKeys(primernombre);
    }
    public void ingresarapellido(String apellido) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(txtapellido));
        txtapellido.click();
        txtapellido.sendKeys(apellido);
    }
    public void ingresarpostal(String postal) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(txtpostal));
        txtpostal.click();
        txtpostal.sendKeys(postal);
    }
    public void continuar() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(txtcontinuar));
        txtcontinuar.click();
    }
    public void finish() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(txtfinish));
        txtfinish.click();
    }
    public void backhome() {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(txtbackhome));
        txtbackhome.click();
    }
}
