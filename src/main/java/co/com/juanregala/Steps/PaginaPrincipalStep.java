package co.com.juanregala.Steps;

import co.com.juanregala.PageObject.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import java.io.IOException;

public class PaginaPrincipalStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    @Step
    public void AbrirNavegador() {
        paginaPrincipalPageObject.open();
    }

    @Step
    public void click(By elemento) {
        paginaPrincipalPageObject.getDriver().findElement(elemento).click();
    }

    @Step
    public void Acceder() {
        click(paginaPrincipalPageObject.getHlkAcceder());
    }

    @Step
    public void ingresarUsuario(String usuario) throws IOException {
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtUsuario(usuario)).sendKeys(usuario);
    }

    @Step
    public void ingresarClave(String clave) throws IOException{
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtClave(clave))
                .sendKeys(clave);
    }

    @Step
    public void btnAcceder() {
        click(paginaPrincipalPageObject.getBtnAcceder());
    }
}
