Feature: Completar una compra de Sauce Demo
  Como un cliente de Sauce Demo,
  Quiero poder iniciar sesión, agregar productos al carrito y completar una compra
  Para poder adquirir los productos que necesito

@Tag01
Scenario Outline: 1. El usuario puede iniciar sesión con credenciales inválidas.
Given carga la pagina web de Sauce Demo
When ingreso el "<usuario>"
And ingreso "<contrasena>"
Then doy clic en Login
Examples:
| usuario       | contrasena   |
| standard_use | secret_sauc |


@Tag02
Scenario Outline: 2. El usuario inicia sesion y completa un proceso de compra
  Given carga la pagina web de Sauce Demo
  And ingreso el "<usuario>" en el campo username
  And ingreso la "<contrasena>" en el campo password
  And doy clic en el boton Login
  And doy clic en addtocar para agregar un producto al carrito
  And doy clic en el icono carrito para ver los productos agregados
  When doyc clic en el boton checkout para verificar la compra
  And ingreso "<primernombre>" en el campo first name
  And ingreso "<apellido>" en el campo last name
  And ingreso "<codpostal>" en el campo postal code
  And doy clic en el boton continue entoces puedo ver el detalle de la compra
  And doy clic en el boton finish para completar el proceso de compra
  Then doy clic en el boton back home para salir del carrito de compra a los productos
  Examples:
    | usuario       | contrasena   | primernombre | apellido | codpostal |
    | standard_user | secret_sauce | Yury         | Monzon   | Varela    |
  #  | standard_use  | secret_sauc  | Yury         | Monzon   | Varela    |
