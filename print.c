#include <stdio.h>

int main() {

    int n, m;
    scanf("%d", &n);

    int a[n];   // dynamic size based on input
    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    scanf("%d", &m);

    for(int i = 0; i < m; i++) {
        int index;
        scanf("%d", &index);

        if(index >= 0 && index < n) {
            printf("%d", a[index]);//prints the array
        } else {
            printf("-1");
        }

        if(i < m - 1) {
            printf(" ");
        }
    }

    return 0;
}