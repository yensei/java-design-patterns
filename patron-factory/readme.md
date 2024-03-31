# PATRON DE DISEÑO : Factory
Es de la familia de patrones creacionales

## Cuando Utilizar
Nos simplifica la tarea la construcción de una jerarquía de clases y las encapsula
- _Ejemplos:_
    - Calendar.getInstance()

## Construcción de auto
Ejemplo utilizados
* Creación de una factura. La factura es una clase abstracta que tiene hijas facturas con diferentes formas de calcular impuestos.

## Requisitos
* JAVA JDK 17
* Spring Boot 3
### Como ejecutar - Spring Boot
```
mvn clean package
mvn spring-boot:run
```