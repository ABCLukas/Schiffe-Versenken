# Schiffe-Versenken
Für Dieses Projekt habe ich Zwei felder erstellt eines um die werte zu speichern und eines um Den spieler Seine getroffenen felder zu zeigen.
```C
    int fillArray(int f[8][8]){
    for (int i = 0; i < 8; i++){
        for (int j = 0; j < 8; j++){
            f[i][j] = 0;
        }
    }
    return 0;
}
```
Darauf folgend habe ich das "Backend feld" an Zufäligen stellen mit der Math.random funktion
```C
    int addBattleships(int f[8][8], int shipAmount){
    srand(time(NULL));

    for (int i = 0; i < shipAmount; i++){
        int num = rand() % 8;
        int num1 = rand() % 8;
        f[num][num1] = 1;
    }
    return 0;
}
```
Nach einer eingabe mit dem JoptionPane werden die koridinaten abgefragt und Die felder dieser werden "angeschossen".
Falls diese Positionen mit einem S markiert werden war die nutzer eingabe richtig.
