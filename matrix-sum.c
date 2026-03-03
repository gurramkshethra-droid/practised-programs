#include <stdio.h>

int main() {

    int n, m;
    scanf("%d %d", &n, &m);

    int a[100][100];   // safer fixed size

    // Input matrix
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    // Column-wise sum
    for(int j = 0; j < m; j++) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a[i][j];
        }
        printf("%d\n", sum);//sum printed
    }

    return 0;
}