#include <stdio.h>
#include <string.h>

int main() {
    int t;
    scanf("%d", &t);

    while(t--) {
        int n;
        char s[55];
        scanf("%d", &n);
        scanf("%s", s);

        int count = 1; 
        for(int i = 0; i < n; i++) {
            if(s[i] == 'R')
                count++;
            else
                break;
        }

        printf("%d\n", count);
    }

    return 0;
}
