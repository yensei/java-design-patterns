# PATRON DE DISEÑO : BUILDER
Es de la familia de patrones creacionales

## Cuando Utilizar
Cuando hay objetos con muchas opciones posibles (atributos) de seteo. Ejemplos:
* java.lang.StringBuilder
* java.lang.StringBuffer
* java.lang.Appendable

## Construcción de auto
En este ejemplo se realiza la construcción de un auto paso, creando partes del auto y asonciandolo a un tipo determinadow

### Director (Clase)
Esta clase controla el orderm de construcción. Sabe que como construir cada tipo de auto. Realiza esto a través de una Interfaz única

## Diferencias entre Factory y AbstractFactory
- Aqui podemos tener parametros opcionales, en los patrones **Factory** debemos pasarlos todos de forma obligatoria, utilizando `NULL` cuando no tenemos o no queremos pasar algún parametro.
- En **Factory** se genera confusión si el objeto es pesado y su creación compleja. Toda la complejidad serán parte de las clases _factory_ lo cual es confuso.
- Cuando se pasan muchos argumentos desde el cliente a la clase **Factory** puede ser suceptible a errores porque en la mayoría de las veces se les pasa los mismos argumentos y del lado del cliente es dificil mantener el orden.

## Requisitos
* JAVA JDK 17
* Spring Boot 3
### Como ejecutar - Spring Boot
```
mvn clean package
mvn spring-boot:run
```