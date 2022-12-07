package co.com.juanregala.Models;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Validaciones extends PageObject {
    By txtValidarProductoEnCarrito = By.xpath("//a[contains(text(),'Desayuno Sorpresa Especial')]");
    By txtMiCuenta = By.xpath("//span[contains(text(),'Mi cuenta')]");

    public By getTxtValidarProductoEnCarrito() {
        return txtValidarProductoEnCarrito;
    }
    public By getTxtMiCuenta() {
        return txtMiCuenta;
    }

}
