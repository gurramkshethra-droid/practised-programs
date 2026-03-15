#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int m,n;
    scanf("%d",&m);
    scanf("%d",&n);
    int a[n][m];
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(i==0 || j==0 || i==n-1 || j==m-1) {//condition
                printf("*");
            }
            else {
                printf(" ");
            }
        }
        printf("\n");
    }  
    return 0;
}
