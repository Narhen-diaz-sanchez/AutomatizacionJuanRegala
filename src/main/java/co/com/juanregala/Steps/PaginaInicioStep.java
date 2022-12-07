package co.com.juanregala.Steps;

import co.com.juanregala.Models.Validaciones;
import co.com.juanregala.PageObject.PaginaInicioPageObject;
import co.com.juanregala.PageObject.PaginaPrincipalPageObject;
import co.com.juanregala.PageObject.PaginaProductoPageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;



public class PaginaInicioStep {
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();
    PaginaProductoPageObject paginaProductoPageObject = new PaginaProductoPageObject();

    Validaciones validaciones = new Validaciones();

    @Step
    public void ValidarInicioDeSesion(){

        String Validar = paginaPrincipalPageObject.getDriver()
                .findElement(validaciones.getTxtMiCuenta()).getText();

        Assert.assertEquals("Mi cuenta",Validar);
    }
    @Step
    public void click(By elemento) {
        paginaPrincipalPageObject.getDriver().findElement(elemento).click();
    }

    @Step
    public void SeleccionarProducto() {
        click(paginaInicioPageObject.getHlkProducto());
    }

    @Step
    public void AgregarProducto() {
        click(paginaProductoPageObject.getBtnAgregarProducto());
    }

    @Step
    public void VerCarrito(){
        click(paginaProductoPageObject.getHlkCarrito());
    }

    @Step
    public void ValidarProductoEnCarrito() {

        String Validar = paginaPrincipalPageObject.getDriver()
                .findElement(validaciones.getTxtValidarProductoEnCarrito()).getText();

        Assert.assertEquals("Desayuno Sorpresa Especial",Validar);
    }



}
