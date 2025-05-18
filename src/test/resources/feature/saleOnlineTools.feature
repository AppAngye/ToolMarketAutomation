Feature: Venta online de herramientas de construcción

  Como maestro de construcción
  quiero comprar herramientas y maquinarias online
  para evitar ir a tienda física y acceder a promociones.

  @TC1
  Scenario: Compra de 2 herramientas para un cliente nuevo sin registrar
    Given que un CLIENTE ingresa a la página web de TOOLSHOPDEMO
    When filtre por una categoria "Power Tools"
    And selecciona una herramienta de la lista "Cordless Drill 12V"
    And luego añade 3 producto al carrito de compras
    And verifica el mensaje "Product added to shopping cart."
    And selecciona el carrito de compras
    And selecciona en proceder pago
#    And selecciona en registrar tu cuenta
#    And completa el formulario del registro
#      | nombre |  | apellido  |  | fecha de nacimiento |  | direccion       |  | codigo postal |  | ciudad |  | estado |  | pais |  | telefono  |  | correo                |  | contraseña     |
#      | angye  |  | parimango |  | 22/11/1997          |  | av salaverry571 |  | 13021         |  | lima   |  | lima   |  | peru |  | 978654123 |  | appangye@intercorp.pe |  | Interbank2025. |
#    And completa los datos para iniciar sesion
#      | correo                |  | contraseña     |
#      | appangye@intercorp.pe |  | Interbank2025. |
#    And indica los datos de dirección de envio
#    And elijo el metodo de pago
#    And selecciona en confirmar
#    Then verifica se haya realizado la compra
#    And el carrito de compras quede vacio
#
#  @TC2
#  Scenario: Compra de 2 herramientas para un cliente nuevo sin registrar
#    Given que un CLIENTE ingresa a la página web de TOOLSHOPDEMO
#    When seleccione el boton Login
#    And completa los datos para iniciar sesion
#      | correo                |  | contraseña     |
#      | appangye@intercorp.pe |  | Interbank2025. |
#    And selecciona una herramienta de la lista: "Circular Saw"
#    And luego de revisar el detalle añade al carrito de compras
#    And verifica el mensaje "Product added to shopping cart"
#    And selecciona el carrito de compras
#    And selecciona en proceder pago
#    And verifico el mensaje "Hello , you are already logged in. You can proceed to checkout."
#    And indica los datos de dirección de envio
#      | direccion       |  | ciudad |  | estado |  | pais |  | codigo postal |
#      | av salaverry571 |  | lima   |  | lima   |  | peru |  | 13021         |
#    And elijo el metodo de pago
#    And selecciona en confirmar
#    Then verifica se haya realizado la compra
#
#  @TC3
#  Scenario: Mostrar los productos menores a 100 soles ordenados de mayor a menor
#    Given que un CLIENTE ingresa a la página web de TOOLSHOPDEMO
#    When ordena los productps por "Nombre (A-Z)
#    And verifica el primer producto de la lista comienza con A "Adjustable Wrench"
#    And aumenta el rango de precios al maximo
#    Then ordena los productps por "Price (Hig-Low)"
#    And verifica el primer producto de la lista sea "Workbench with Drawers"
