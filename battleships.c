#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int fillArray(int f[8][8], int shipAmount)
{
    for (int i = 0; i < 8; i++)
    {
        for (int j = 0; j < 8; j++)
        {
            f[i][j] = 0;
        }
    }

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
    int field[8][8];

    fillArray(field, 4);

    printArray(field);

    return 0;
}