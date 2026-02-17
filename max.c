#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    scanf("%d",&n);
    int a[n];
    int max;
    for(int i=0;i<n;i++) {
        scanf("%d",&a[i]);
    }   
    max=a[0];
    for(int i=1;i<n;i++) {
        if(a[i]>max) {
            max=a[i];
        }
    }
    printf("%d",max);
    return 0;
}