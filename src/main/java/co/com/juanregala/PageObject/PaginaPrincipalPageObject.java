package co.com.juanregala.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://juanregala.com.co/medellin/")
public class PaginaPrincipalPageObject extends PageObject{
    By hlkAcceder = By.xpath("//a[contains(@data-open,'login')]");
    By txtUsuario = By.xpath("//input[@name='username' and @id='username']");
    By txtClave = By.xpath("//input[@name='password' and @id='password']");

    By btnAcceder = By.xpath("//button[@name='login' and @value='Acceder']");

    public By getHlkAcceder() {
        return hlkAcceder;
    }

    public By getTxtUsuario(String usuario) {
        return txtUsuario;
    }

    public By getTxtClave(String clave) {
        return txtClave;
    }

    public By getBtnAcceder() {
        return btnAcceder;
    }
}
