package util;

import generic.WebDriverDOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static parameters.Parameters.*;

public class WebDriverManager extends WebDriverDOM {

    public static WebDriver inicializarBrowser() {

        System.setProperty("webdriver.chrome.driver", filePath);
        ChromeOptions options = new ChromeOptions();
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.saucedemo.com/");
        return webDriver;
    }
}
