#language: es

Característica: Agregar producto al carrito

  @AgregarProducto

  Escenario: Agregar producto al carrito Exitosamente

    Dado Que el usuario se encuentra en la pagina web habiendo iniciado sesion
      | Usuario              | Clave                |
      | narhen2015@gmail.com | Automatizacion2022_* |

    Cuando El desee agregar un producto al carrito

    Entonces Se visualizara el producto en el carrito