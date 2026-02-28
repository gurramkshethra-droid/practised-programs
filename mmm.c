#include <stdio.h>

int main() {

    int n;
    scanf("%d", &n);

    int a[n];
    double sum = 0;

    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
        sum += a[i];
    }

    // 🔹 SORT THE ARRAY (Simple Bubble Sort)
    for(int i = 0; i < n - 1; i++) {
        for(int j = 0; j < n - i - 1; j++) {
            if(a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }

    // 🔹 MEAN
    double mean = sum / n;

    // 🔹 MEDIAN
    double median;
    if(n % 2 == 0) {
        median = (a[(n/2) - 1] + a[n/2]) / 2.0;
    } else {
        median = a[n/2];
    }

    // 🔹 MODE
    int maxc = 1, count = 1;
    int mode = a[0];

    for(int i = 1; i < n; i++) {
        if(a[i] == a[i - 1]) {
            count++;
        } else {
            if(count > maxc) {
                maxc = count;
                mode = a[i - 1];
            }
            count = 1;
        }
    }

    // Check last element
    if(count > maxc) {
        mode = a[n - 1];
    }

    printf("%.2f %.2f %d", mean, median, mode);

    return 0;
}