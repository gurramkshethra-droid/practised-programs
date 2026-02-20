#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n,m;
    scanf("%d",&n);
    scanf("%d",&m);
    int a[n][m];
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            scanf("%d",&a[i][j]);
        }
    } 
    int sum=0;
    for(int j=0;j<m;j++) {
        sum=0;
        for(int i=0;i<n;i++) {
            sum+=a[i][j];
        }
        printf("%d\n",sum);
    } 
    return 0;
}