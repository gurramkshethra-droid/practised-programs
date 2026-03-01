#include <stdio.h>
#include <ctype.h>   // for tolower()
#include <string.h>  // for strlen()

int main() {

    int n;
    scanf("%d", &n);

    while(n--) {

        int k;
        scanf("%d", &k);

        char a[1000];
        scanf("%s", a);

        int freq[26] = {0};

        int len = strlen(a);   // safer than trusting k

        for(int i = 0; i < len; i++) {
            char ch = tolower(a[i]);

            if(ch >= 'a' && ch <= 'z') {   // ensure valid letter
                freq[ch - 'a']++;
            }
        }

        int max1 = 0, max2 = 0;

        for(int i = 0; i < 26; i++) {
            if(freq[i] > max1) {
                max2 = max1;
                max1 = freq[i];
            }
            else if(freq[i] > max2) {
                max2 = freq[i];
            }
        }

        printf("%d\n", max1 + max2);
    }

    return 0;
}