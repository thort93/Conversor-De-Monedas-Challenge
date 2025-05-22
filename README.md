# 💱 Conversor de Monedas Challenge

<p align = "center">
<img src="https://github.com/thort93/Conversor-De-Monedas-Challenge/blob/main/Badge-Conversor.png?raw=true" width="200" >
</p>

Es una aplicación sencilla de consola que permite convertir entre diferentes tipos de monedas...rápidas, precisas y sin complicaciones.

## 🚀 Características

- Conversión entre múltiples monedas usando tasas actualizadas.
- Validación de entrada para asegurar que los códigos de moneda sean válidos (3 letras).
- Manejo de errores amigable para el usuario.
- Interfaz de consola clara y fácil de usar.

## 🛠️ Tecnologías utilizadas

- **Java** (JDK 21.0.6)
- **Scanner** para entrada por consola
-  API externa para tasas de cambio en tiempo real

## 📦 Cómo ejecutar

1. Clona este repositorio:
   ```bash
   git clone https://github.com/thort93/Conversor-De-Monedas-Challenge.git
   cd conversor-monedas

## 🔒 Validaciones
  - Solo se aceptan códigos de moneda válidos de 3 letras (ej: USD, EUR, PEN).
  - El valor ingresado para convertir debe ser numérico.

## 📦 DEMOSTRACION (CAPTURAS DE PANTALLA)

### Menu principal
- Al ejecutar la aplicacion nos muestra en siguiente menu
  
![Menu Principal](./Captura-pantalla/menu-principal.png)

### Escoge una opcion.
- para este ejemplo escogemos la opcion 1 , ingresamos el valor a convertir y nos muestra el resultado
  
![Escogiendo opcion](./Captura-pantalla/escoge-opcion-valor.png)

### Escogiendo otra opcion para convertir
- Para este ejemplo escogemos la opcion 7 y nos muestra una lista de tipo de monedas
  
![Otras Opciones](./Captura-pantalla/op7-escoge-cambio.png)

### Errores al colocar un valor incorrecto
- tanto paraa el tipo de modena y el valor de la monera muestra un error
  en caso de que no se consigne las 3 letras (PEN,USD) pedira nuevamente
  hasta colocarlo correctamente, de igual manera para el valor numerico
  
![Error tipo de moneda](./Captura-pantalla/error1-codigo-invalido.png)

![Error valor](./Captura-pantalla/error2-valornumerico.png)

### luego de superar el error muestra el resultado

![tipo de moneda](./Captura-pantalla/muestra-resultado.png)

### luego le damos salir opcion 8

![Salir](./Captura-pantalla/op8-salir.png)

### guarda las consultas

![consultas 1](./Captura-pantalla/guarda-consultas1.png)

![consultas 2](./Captura-pantalla/muestra-consultas.png)
