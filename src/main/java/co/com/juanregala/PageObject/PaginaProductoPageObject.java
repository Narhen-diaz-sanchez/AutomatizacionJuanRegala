package co.com.juanregala.PageObject;

import org.openqa.selenium.By;

public class PaginaProductoPageObject {
    By btnAgregarProducto = By.xpath("//input[contains(@id,'submit')]");

    By hlkCarrito = By.xpath("//span[contains(text(),'Carrito')]");

    public By getBtnAgregarProducto() {
        return btnAgregarProducto;
    }

    public By getHlkCarrito() {
        return hlkCarrito;
    }
}
