#Feature: Contactar con atencion del cliene a traver de la pagina web
#  Como cliente de la tienda online
#  quiero me contacten por motivos especificos
#  para una mejor atención y solución al inconveniente
#
#  @TC3
#  Scenario: Solicitud de contacto con la empresa a traves de su modulo contacto
#    Given que un CLIENTE ingresa a la página web de TOOLSHOPDEMO
#    When selecciona la opción "Contacto"
#    And completa el formulario de datos personales
#      | nombre |  | apellido  |  | correo   |
#      | angye  |  | parimango |  | appangye |
#    And valida se cumpla el formato de correo electrónico
#    And corrige el correo
#    And elege el tipo de asunto "Devolucion"
#    And selecciona en enviar
#    Then verifica se haya completado los campos obligatorios
#    And agrega el mensaje
#    And selecciona en enviar
#    And verifica el mensaje de envio exitoso: "¡Gracias por tu mensaje!"
#
