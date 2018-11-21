Björn Scheppler, 21.11.2018

# REST-Service Template (rest-service-template)
Dieses Maven-Projekt kann genutzt werden als Startpunkt für eigene auf Spring Boot, JPA und REST beruhende Projekte. Enthalten sind folgende Funktionalitäten:
1. Spring Boot 2.0.3 
2. Spring Boot Starter Web für Tomcat sowie REST-Komponenten
4. H2-Datenbank-Unterstützung
5. Spring Boot Starter JPA für Datenbank-Zugriff
6. "Sinnvolle" Grundkonfiguration in application.properties für Datenbank und Tomcat
7. Daten-Komponenten:
    1. UserEntity
    2. UserRepository
    3. initalData.sql mit einem Benutzer
8. REST-Komponenten: UserController

## Vorbereitungen, Deployment und Start
1. **Erstmalig** oder bei Problemen ein **Clean & Build (Netbeans)**, respektive `mvn clean install` (Cmd) durchführen
2. Bei Änderungen am POM-File oder bei **(Neu)kompilierungsbedarf** genügt ein **Build (Netbeans)**, respektive `mvn install`
3. Für den **Start** ist ein **Run (Netbeans)**, respektive `java -jar .\target\NAME DES JAR-FILES.jar` (Cmd) erforderlich. Dabei wird Tomcat gestartet, die Datenbank erstellt/hochgefahren und (application.properties) hochgefahren.
4. Beim ersten Ausführen müssen Testdaten angelegt werden -> siehe Fortgeschrittene Nutzung (H2 Console) und dort die SQL-Statements aus initalData.sql ausführen
5. Das **Beenden** geschieht mit **Stop Build/Run (Netbeans)**, respektive **CTRL+C** (Cmd)

## Grundlegende Nutzung
1. http://localhost:8070 aufrufen
2. Error-Page wird angezeigt, sofern Server erfolgreich gestartet wurde
3. http://localhost:8070/userapi/v1/users/a eingeben
4. Benutzer a mit weiteren Angaben (z.B. firstName Max) sollte zurückgegeben werdne als JSON
5. Dasselbe kann auch gemacht werden indirekt über den Aufruf dieses Projekts: https://github.com/zhaw-gpi/project-template

## Fortgeschrittene Nutzung (H2 Console)
1. Um auf die Datenbankverwaltungs-Umgebung zuzugreifen, http://localhost:8070/console eingeben.
2. Anmeldung über:
    1. Benutzername sa
    2. Passwort: leer lassen
    3. URL jdbc:h2:./userDb