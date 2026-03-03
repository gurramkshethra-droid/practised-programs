#include <stdio.h>

int main() {

    int n;
    scanf("%d", &n);

    int a[n];   // dynamic size array

    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    // Bubble Sort with optimization
    for(int i = 0; i < n - 1; i++) {

        int swapped = 0;   // check if swap happened

        for(int j = 0; j < n - i - 1; j++) {
            if(a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                swapped = 1;
            }
        }//swapped

        // Print array after each pass
        for(int k = 0; k < n; k++) {
            printf("%d ", a[k]);
        }
        printf("\n");

        // If no swaps, array is already sorted
        if(swapped == 0) {
            break;
        }
    }

    return 0;
}