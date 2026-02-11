#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    scanf("%d",&n);
    int a[n][n];
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            scanf("%d",&a[i][j]);
        }
    }
    int sum=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(i>=j) {
                sum+=a[i][j];
            }
        }
    }
    printf("%d",sum);
    return 0;
}