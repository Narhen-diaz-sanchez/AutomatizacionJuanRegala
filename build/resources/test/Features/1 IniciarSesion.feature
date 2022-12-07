#language: es

Característica: Iniciar Sesión

  @IniciarSesion

  Escenario: Iniciar Sesión Exitosamente

    Dado Que el usuario se encuentra en la pagina web

    Cuando El desee iniciar sesion con su usuario y clave
      | Usuario              | Clave                |
      | narhen2015@gmail.com | Automatizacion2022_* |

    Entonces Se visualizara el apartado de mi cuenta en la parte superior derecha