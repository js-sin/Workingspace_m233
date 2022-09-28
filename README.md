# Workingspace_m223
Das Workingspace ist ein Arbeitsplatz Buchungssystem, welches mit Quarkus entwickelt wurde.

## Erste Schritte

1. Gehen Sie auf https://github.com/js-sin/Workingspace_m233/ und clonen Sie das gesamte Projekt.
2. Stellen Sie sicher, dass Docker installiert ist und läuft.
3. Stellen Sie sicher, dass Visual Studio Code und die Erweiterung Remote Container installiert ist.
1. Öffne das Projekt mit Visual Studio Code.
## Projekt starten

1. Öffne das Projekt im Entwicklungscontainer.
1. Starte das Projekt mit dem Kommando `Quarkus: Debug current Quarkus Project`
1. Probiere die Client-Applikation unter http://localhost:8080 aus.

### Datenbankadministration

Über http://localhost:5050 ist PgAdmin4 erreichbar. Damit lässt sich die Datenbank komfortabel verwalten. Der Benutzername lautet `zli@example.com` und das Passwort `zli*123`. Die Verbindung zur PostgreSQL-Datenbank muss zuerst mit folgenden Daten konfiguriert werden:
 - Host name/address: `db`
 - Port: `5432`
 - Maintenance database: `postgres`
 - Username: `postgres`
 - Password: `postgres`

## Automatische Tests

Die automatischen Tests können mit `./mvnw quarkus:test` ausgeführt werden. Für die automatischen Tests wird nicht die PostgreSQL-Datenbank verwendet, sondern eine H2-Datenbank, welche sich im Arbeitsspeicher während der Ausführung befindet.