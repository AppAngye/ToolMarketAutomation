Feature: Venta online de herramientas de construcción

  Como maestro de construcción
  quiero comprar herramientas y maquinarias online
  para evitar ir a tienda física y acceder a promociones.

  @TestCase_1
  Scenario: Registrar un cliente despues de seleccionar un producto online
    Given que un CLIENTE ingresa a la página web de TOOLSHOPDEMO
    When filtre por una categoria "Power Tools"
    And selecciona una herramienta de la lista "Cordless Drill 12V"
    And luego añade 3 producto al carrito de compras
    And verifica el mensaje "Product added to shopping cart."
    And selecciona el carrito de compras
    And selecciona en registrar tu cuenta
    And completa el formulario del registro
      | nombre | apellido  | fechaNacimiento | calle        | codigoPostal | ciudad | estado | pais | telefono  | correo            | contraseña     |
      | angye  | parimango | 22/11/1997      | av salaverry | 13021        | lima   | lima   | Peru | 978654123 | qaangye@prueba.pe | Interbank2025. |
    And completa los datos registrados para iniciar sesion
    Then validamos que muestre la seccion "My account"


  @TestCase_2
  Scenario: Comprar 2 unidades de la misma herramienta para un cliente despues de iniciar sesión
    Given que un CLIENTE ingresa a la página web de TOOLSHOPDEMO
    When seleccione el boton Login
    And completa los datos para iniciar sesion
      | correo            | contraseña     |
      | qaangye@prueba.pe | Interbank2025. |
    And validamos que muestre la seccion "My account"
    And filtre desde el menu una categoria "Hand Tools"
    And selecciona una herramienta de la lista "Bolt Cutters"
    And luego añade 2 producto al carrito de compras
    And verifica el mensaje "Product added to shopping cart."
    And selecciona el carrito de compras
    And verifico el mensaje "Hello angye parimango, you are already logged in. You can proceed to checkout."
    And completa los datos de dirección de envio
      | direccion   | ciudad      | estado | pais | codigoPostal |
      | av porvenir | jesus maria | lima   | peru | 13021        |
    And elijo el metodo de pago "Cash on Delivery"
    Then verifica se haya realizado la compra "Payment was successful"

