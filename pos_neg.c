#include <stdio.h>

int main() {

    int n;
    scanf("%d", &n);

    int zeros = 0, positives = 0, negatives = 0;
    int x;

    for (int i = 0; i < n; i++) {
        scanf("%d", &x);

        if (x == 0)
            zeros++;
        else if (x > 0)
            positives++;
        else
            negatives++;
    }

    printf("%d %d %d\n", zeros, positives, negatives);

    return 0;
}