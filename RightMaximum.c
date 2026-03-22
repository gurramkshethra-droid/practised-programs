#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);

    while(t--) {
        int n;
        scanf("%d", &n);

        int a[n];

        for(int i = 0; i < n; i++) {
            scanf("%d", &a[i]);
        }

        int operations = 0;
        int max_seen = 0;

        for(int i = n-1; i >= 0; i--) {
            if(a[i] > max_seen) {
                operations++;
                max_seen = a[i];
            }
        }

        printf("%d\n", operations);
    }

    return 0;
}
