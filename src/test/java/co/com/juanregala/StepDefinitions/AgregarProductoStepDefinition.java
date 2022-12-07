package co.com.juanregala.StepDefinitions;

import co.com.juanregala.Steps.PaginaInicioStep;

import co.com.juanregala.Steps.PaginaPrincipalStep;
import co.com.juanregala.Utils.DatosLogin;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.List;


public class AgregarProductoStepDefinition {

    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Dado("^Que el usuario se encuentra en la pagina web habiendo iniciado sesion$")
    public void queElUsuarioSeEncuentraEnLaPaginaWebHabiendoIniciadoSesion(List<DatosLogin> datosLoginList) throws IOException {
        paginaPrincipalStep.AbrirNavegador();
        paginaPrincipalStep.Acceder();
        paginaPrincipalStep.ingresarUsuario(datosLoginList.get(0).getUsuario());
        paginaPrincipalStep.ingresarClave(datosLoginList.get(0).getClave());
        paginaPrincipalStep.btnAcceder();
    }


    @Cuando("^El desee agregar un producto al carrito$")
    public void elDeseeAgregarUnProductoAlCarrito() {
        paginaInicioStep.SeleccionarProducto();
        paginaInicioStep.AgregarProducto();
    }

    @Entonces("^Se visualizara el producto en el carrito$")
    public void seVisualizaraElProductoEnElCarrito() {
        paginaInicioStep.VerCarrito();
        paginaInicioStep.ValidarProductoEnCarrito();
    }
}
