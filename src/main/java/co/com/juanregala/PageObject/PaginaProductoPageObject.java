package co.com.juanregala.PageObject;

import org.openqa.selenium.By;

public class PaginaProductoPageObject {
    By btnAgregarProducto = By.xpath("//button[@name='add-to-cart']");

    By hlkCarrito = By.xpath("//span[contains(text(),'Carrito')]");

    public By getBtnAgregarProducto() {
        return btnAgregarProducto;
    }

    public By getHlkCarrito() {
        return hlkCarrito;
    }
}
