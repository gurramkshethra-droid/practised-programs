#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    char a[100];

    for (int i = 0; i < n; i++) {
        int k;
        scanf("%d", &k);

        scanf("%s", a);   // read the string

        int freq[26] = {0};

        // convert uppercase to lowercase
        for (int j = 0; j < k; j++) {
            if (a[j] >= 'A' && a[j] <= 'Z') {
                a[j] = a[j] + 32;
            }
            freq[a[j] - 'a']++;
        }

        int max1 = 0, max2 = 0;

        for (int j = 0; j < 26; j++) {
            if (freq[j] > max1) {
                max2 = max1;
                max1 = freq[j];
            } else if (freq[j] > max2) {
                max2 = freq[j];
            }
        }

        printf("%d\n", max1 + max2);
    }

    return 0;
}

