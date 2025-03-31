# Battleships
The main contains two 2-dimensional arrays. One is for the backend of the game, and the other one is for the visual presentation for the player
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
The Positions of the Battleships is Random and Gets declared with a 1 on The Chosen Position
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
