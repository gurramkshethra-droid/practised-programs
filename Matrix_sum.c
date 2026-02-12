#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int n,m;
    scanf("%d",&n);
    scanf("%d",&m);
    int a[n][m];
    for(int i=0;i<n;i++) {
        int rowsum=0;
        for(int j=0;j<m;j++) {
            int x;
            scanf("%d",&x);
            rowsum+=x;
        }
        printf("%d\n",rowsum);
    }
    return 0;
}