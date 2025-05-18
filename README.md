# Automatización ToolShop Demo
### Autor: Angye Parimango Pereda
## Descripción
Es una página de venta de artículos y herramientas de construcción: https://practicesoftwaretesting.com/ 

## Requisitos mínimos de configuración:
- Tener instalado **JDK 11 o superior**
- Tener instalado **última versión** de **Maven**
* Tener instalado los plugin: **Cucumber for Java, Gherkin y GIT**

## Usar Maven
Abrir una ventana de comando de window y ejecutar:

    mvn clean verify

## Requisitos para ejecución de scripts:
* Para ejecutar el `@TestCase_2`, primero se tiene que ejecutar el escenario con el tag `@TestCase_1` o ejecutar todo el **feature** completo

## Ver los reportes

El comando proporcionado anteriormente producirá un reporte de prueba de Serenity en el directorio `target/site/serenity/index.html`.


## Matriz de Casos de Prueba
| ID         | Escenario                                                                                   | Datos de Entrada                                                                                                                                                                                                                                      | Resultado Esperado                                                                                             | Estado | Comentarios                      |
|------------|---------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|--------|----------------------------------|
| TestCase_1 | Registrar un cliente después de seleccionar un producto online                              | Categoría: Power Tools<br>Producto: Cordless Drill 12V<br>Cantidad: 3<br>Formulario de registro:<br>nombre: angye<br>apellido: parimango<br>fechaNacimiento: 22/11/1997<br>calle: av salaverry<br>codigoPostal: 13021<br>ciudad: lima<br>estado: lima<br>país: Peru<br>teléfono: 978654123<br>correo: qaangye@prueba.pe<br>contraseña: Interbank2025. | Mostrar mensaje "Product added to shopping cart."<br>Redirige a "My account" después del registro              | ✔️     |                                  |
| TestCase_2 | Comprar 2 unidades de la misma herramienta después de iniciar sesión                        | Login:<br>correo: qaangye@prueba.pe<br>contraseña: Interbank2025.<br>Categoría: Hand Tools<br>Producto: Bolt Cutters<br>Cantidad: 2<br>Dirección de envío:<br>dirección: av porvenir<br>ciudad: jesus maria<br>estado: lima<br>país: peru<br>codigoPostal: 13021<br>Método de pago: Cash on Delivery | Mostrar mensaje "Product added to shopping cart."<br>Mostrar "you are already logged in"<br>Confirmar "Payment was successful" | ✔️     |                                  |
| TestCase_3 | Solicitud de contacto con la empresa a través de su módulo contacto                         | Nombre: angye<br>Apellido: parimango<br>Correo (incorrecto): appangye<br>Correo (corregido): appangye@gmail.com<br>Asunto: Devolución<br>Mensaje: (texto cualquiera)                                                                                 | Mostrar validación de formato de correo<br>Campos obligatorios completos<br>Mensaje "¡Gracias por tu mensaje!" | 🛠️     | Escenario no implementado aún    |


### Por el tiempo no pude crear mas escenarios ni implementarlos, igualmente muchas gracias!!!! 