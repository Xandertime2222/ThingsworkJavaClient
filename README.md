# ThingWorxClient
Dies ist ein Java-Programm, das zeigt, wie man mithilfe der ThingWorx REST API einen Eigenschaftswert in ThingWorx aktualisiert. Das Programm sendet eine HTTP PUT-Anfrage an den ThingWorx-Server mit den bereitgestellten Anmeldedaten und aktualisiert den Wert einer bestimmten Eigenschaft.

## Voraussetzungen
1. Installierte Java Development Kit (JDK)
2. Internetverbindung
3. Zugriff auf den ThingWorx-Server

## Erklärung
1. Es werden die erforderlichen Klassen importiert.
2. Die URL des zu aktualisierenden Eigenschaftswerts, der Benutzername und das Passwort werden festgelegt.
3. Es wird eine Verbindung zum ThingWorx-Server hergestellt.
4. Die HTTP PUT-Anfrage wird konfiguriert und gesendet, wobei die Authentifizierungsinformationen und der neue Eigenschaftswert übergeben werden.
5. Die Antwort des Servers wird gelesen und ausgegeben.
6. Eventuelle Fehler werden abgefangen und ausgegeben.
