# Schiffe-Versenken
Für Dieses Projekt habe ich Zwei felder erstellt eines um die werte zu speichern und eines um Den spieler Seine getroffenen felder zu zeigen.
```java
    char[][] visual = {
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '}
    };
```
Darauf folgend habe ich das "Backend feld" an Zufäligen stellen mit der Math.random funktion
```java
    for(int i = 0; i<10;i++){
        int ran1 = (int)(Math.random()*(8)-1);
        int ran2 = (int)(Math.random()*(8)-1);
        feld[ran1][ran2] = 'S';
    }
```
