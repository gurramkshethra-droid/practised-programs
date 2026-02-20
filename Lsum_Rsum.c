#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n;
    scanf("%d",&n);
    int a[n],b[n];
    for(int i=0;i<n;i++) {
        scanf("%d",&a[i]);
    } 
    int totalsum=0;
    for(int i=0;i<n;i++) {
        totalsum+=a[i];
    }   
    int leftsum=0;
    for(int i=0;i<n;i++) {
        int rightsum=totalsum-leftsum-a[i];
        b[i]=abs(leftsum-rightsum);
        leftsum+=a[i];
    }
    for(int i=0;i<n;i++) {
        printf("%d ",b[i]);
    }
    return 0;
}