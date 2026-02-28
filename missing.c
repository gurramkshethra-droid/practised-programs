#include <stdio.h>

int main() {

    int n;
    scanf("%d", &n);  // total count

    int total = (n * (n + 1)) / 2;
    int sum = 0, x;

    for(int i = 0; i < n - 1; i++) {
        scanf("%d", &x);
        sum += x;
    }

    printf("%d", total - sum);

    return 0;
}