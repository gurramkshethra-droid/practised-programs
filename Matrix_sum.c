#include <stdio.h>

int main() {

    int n, m;
    scanf("%d %d", &n, &m);

    for (int i = 0; i < n; i++) {
        int rowsum = 0;

        for (int j = 0; j < m; j++) {
            int x;
            scanf("%d", &x);
            rowsum += x;
        }

        printf("%d\n", rowsum);
    }

    return 0;
}