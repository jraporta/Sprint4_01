## 📄Descripció - Enunciat de l'exercici

Aquest exercici és un primer contacte amb Spring i Maven / Gradle i l'accés als endpoints amb Postman.

## 💻Tecnologies Utilitzades

- Spring Boot
- Maven
- Gradle
- Postman

## 📋Requisits

- JDK 21
- Maven 3.9.9
- Gradle 8.10.2

## 🛠️Instal·lació

No és necessari fer cap instal·lació.

## ▶️Execució

Al directori del projecte:
- **Versió Maven:** `mvn spring-boot:run`
- **Versió Gradle (windows):** `gradlew.bat bootRun`

## 🌐Desplegament

Projecte no desplegat.

## 🤝Contribucions

Sense contribucions externes.


## 🚩 Endpoints Table

Port: 9000 (for maven project)

Port: 9001 (for gradle project)

| Endpoint                                  | Method | Params/Body                   | Response Codes                               | Description               |
|-------------------------------------------|--------|-------------------------------|----------------------------------------------|---------------------------|
| `http://localhost:{{port}}/HelloWorld`         | GET   |  | 200 (“Hello UNKNOWN. You're running a Maven/Gradle project.")            | Salute.           |
| `http://localhost:{{port}}/HelloWorld?nom=El meu nom`      | GET    | `{ name }` | 200 (“Hello, “ + name + “. You're running a Maven/Gradle project.”) | Salute. |
| `http://localhost:{{port}}/HelloWorld2` | GET | | 200 (“Hello UNKNOWN. You're running a Maven/Gradle project.")     | Salute.          |
| `http://localhost:{{port}}/HelloWorld2/elmeunom` | GET    | `{ name }`                      | 200 (“Hello, “ + name + “. You're running a Maven/Gradle project.”)     | Salute.                |
