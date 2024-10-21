# Spring & Maven

---

Aquest exercici és un primer contacte amb Spring i Maven.

---

1. Generació del projecte Spring Boot (https://start.spring.io/)

- **PROJECT (gestor de dependències):**  Maven.
- **LANGUAGE:** Java.
- **SPRING BOOT:** La darrera versió estable.
- **PROJECT METADATA:**
- **Group:** cat.itacademy.s04.t01.n01
- **Artifact:** S04T01N01
- **Name:** S04T01N01
- **Description:** S04T01N01
- **Package name:** cat.itacademy.s04.t01.n01
- **PACKAGING:** Jar
- **JAVA:** Mínim versió 11 
- **Dependències:** Spring Boot DevTools, Spring Web


Importa’l a Eclipse amb l’opció `File > Import > Existing Maven Project`.

2. A l’arxiu application.properties, configura la variable `server.port=9000`.

Convertirem aquesta aplicació en una API REST:
Depenent del package principal, crea un altre subpackage anomenat controller, i dins seu, afegeix la classe HelloWorldController.

- Haurà de tenir dos mètodes:

1. `String saluda`
2. `String saluda2`

Aquests dos mètodes rebran un paràmetre String anomenat nom, i retornaran la frase:

“Hola, “ + nom + “. Estàs executant un projecte Maven”.


El primer mètode respondrà a una petició `GET`, i haurà de ser configurat per a rebre el paràmetre com un **RequestParam**. El paràmetre "nom" tindrà el valor per defecte “UNKNOWN”.

Haurà de respondre a:

`http://localhost:900'/HelloWorld`

`http://localhost:900'/HelloWorld?nom=El meu nom`


 

El segon mètode respondrà a una petició `GET`, i haurà de ser configurat per a rebre el paràmetre com una **PathVariable**. El paràmetre "nom" serà opcional.

Haurà de respondre a:

`http://localhost:900'/HelloWorld2`

`http://localhost:900'/HelloWorld2/elmeunom`

---

### Practicar Comandes Bàsiques de Maven
Assegura't que Maven està instal·lat i configurat al teu sistema. Obre una terminal (des del teu IDE o des de la línia de comandes de Windows, Mac, etc.) i navega al directori del teu projecte. L'objectiu és que et familiaritzis amb algunes comandes importants de Maven:

- **Compilar el Projecte:** `mvn compile`
- **Empaquetar el Projecte:** `mvn package`
- **Netejar el Projecte:** `mvn clean`
- **Executar l'Aplicació:** `mvn spring-boot:run`