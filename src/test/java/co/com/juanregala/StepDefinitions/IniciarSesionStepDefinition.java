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

public class IniciarSesionStepDefinition {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    PaginaInicioStep paginaInicioStep;
    @Dado("^Que el usuario se encuentra en la pagina web$")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() {
        paginaPrincipalStep.AbrirNavegador();
    }


    @Cuando("^El desee iniciar sesion con su usuario y clave$")
    public void elDeseeIniciarSesionConSuUsuarioYClave(List<DatosLogin> datosLoginList) throws IOException {
        paginaPrincipalStep.Acceder();
        paginaPrincipalStep.ingresarUsuario(datosLoginList.get(0).getUsuario());
        paginaPrincipalStep.ingresarClave(datosLoginList.get(0).getClave());
        paginaPrincipalStep.btnAcceder();

    }

    @Entonces("^Se visualizara el apartado de mi cuenta en la parte superior derecha$")
    public void seVisualizaraElApartadoDeMiCuentaEnLaParteSuperiorDerecha(){
        paginaInicioStep.ValidarInicioDeSesion();

    }
}
