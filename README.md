# bloques-loggro

Este proyecto desarrolla e implementa la solución a la Prueba de Bloques, en la cual se debe validar si una palabra puede formarse usando una colección de bloques que contienen dos letras cada uno, sin reutilizar ningún bloque.

<img width="586" height="64" alt="image" src="https://github.com/user-attachments/assets/8425a9e6-8e4e-43e3-bd3b-a981ff38a416" />

**Reglas:**
1. Una vez que se usa un bloque, no puede reutilizarse.
2. Se debe ignorar la distinción entre mayúsculas y minúsculas.
3. La función debe retornar true si la palabra puede formarse, o false si no.
4. Se deben realizar pruebas unitarias para validar los casos proporcionados.

Ejecución:
<img width="921" height="388" alt="image" src="https://github.com/user-attachments/assets/fbd1848b-92a9-42b1-a54f-c1098ffd3e66" />

Tecnologías utilizadas
* Java 11
* Maven
* JUnit 5
* IntelliJ IDEA

```text
src/
 ├─ main/
 │   └─ java/co/loggro/bloques/
 │        ├─ Aplicacion.java
 │        ├─ ConsolaBloques.java
 │        ├─ PruebaBloques.java
 │        └─ Bloque.java
 └─ test/
     └─ java/co/loggro/bloques/
          └─ ValidaPalabraConBloquesTest.java


Para ejecutar el proyecto:

1. Abrir la clase Aplicacion.java
2. Click en Run

O desde consola Maven:

1. mvn clean install
2. mvn exec:java -Dexec.mainClass="co.loggro.bloques.Aplicacion"

Para ejecutar las pruebas unitarias:

1. Abrir la clase ValidaPalabraConBloquesTest
2. Click en Run

O desde consola Maven:
mvn test
