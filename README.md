# JavaSpringBootInicial

* https://start.spring.io/
  * Gradle Project
  * Language: Java
  * Spring boot 2.7
  * Java version 11
  * Name y artifact (cambiar nombre)
  * Y agregar como dependencia
    * HATEOAS
  * Finalmente, generate.
* Descromprimimos el archivo descargado en una carpeta

* En IntelliJ, abrimos la carpeta que se creo y dejamos que se carguen las librerias.

* Luego, vamos a a trabajar dentro de la siguiente carpeta
  * src/main/java/com.example.****

## Crear un controlador

* Opcionalmente, crear un paquete, dentro de la carpeta de trabajo
* Y en ese paquete, creamos una clase.

Antes del nombre de la clase, agreguemos la siguiente anotacion:

```java
@RestController // indicando que la clase va a ser un controlador
@RequestMapping("/rutainicial") // la ruta inicial donde se va a llamar el controlador http://localhost:8080/rutainicial
```

## Crear un metodo en el controlador

Dentro de la clase, se pueden crear metodos.

```java
public String ejemplo(){
    return "hola mundo";        
}
```

Para poder compartir este metodo, se indica lo siguiente.

* Agregar una anotacion antes del metodo

```java
@GetMapping("/ejemplo") //  http://localhost:8080/rutainicial/ejemplo [GET]
public String ejemplo(){
    return "hola mundo";        
}
```

## Ejecutar la primera vez.

* Ir a la clase de aplicacion
* Y ejecutelo en modo depuracion.
