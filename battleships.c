#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int fillArray(int f[8][8])
{
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            f[i][j] = 0;
        }
    }
    return 0;
}

int addBattleships(int f[8][8], int shipAmount)
{
    srand(time(NULL));

    for (int i = 0; i < shipAmount; i++)
    {
        int num = rand() % 8;
        int num1 = rand() % 8;
        f[num][num1] = 1;
    }
    return 0;
}

int printArray(int f[8][8])
{
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            printf("%d", f[i][j]);
        }
        printf("\n");
    }
    return 0;
}

int main(void)
{
    int backendField[8][8];
    int frontendField[8][8];

    fillArray(backendField);
    addBattleships(backendField,4);
    printArray(backendField);

    fillArray(frontendField);
    printf("\n");
    printArray(frontendField);

    return 0;
}
