package co.com.juanregala.PageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class PaginaInicioPageObject extends PageObject {


    By hlkProducto = By.xpath("//a[contains(@aria-label,'Mini Desayuno de Cumpleaños')]");








    public By getHlkProducto() {
        return hlkProducto;
    }




}
