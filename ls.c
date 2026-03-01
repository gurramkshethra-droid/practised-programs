#include <stdio.h>

int main() {

    int n, search;
    scanf("%d", &n);

    int a[100];   // declare after knowing n

    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    scanf("%d", &search);

    int found = -1;   // assume not found

    for(int i = 0; i < n; i++) {
        if(a[i] == search) {
            found = i;
            break;
        }
    }

    printf("%d", found);

    return 0;
}