#include <stdio.h>

int main() {

    int n;
    scanf("%d", &n);

    int a[n];   // dynamic size (C99)

    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[i] == a[j]) {
                printf("%d\n", a[i]);
                return 0;
            }
        }
    }

    // If no duplicate found
    printf("No duplicate\n");

    return 0;
}