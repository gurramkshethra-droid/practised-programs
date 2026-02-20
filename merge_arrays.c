#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,m,i=0,j=0;
    int a[1005],b[1005];
    scanf("%d",&n);
    for(int i=0;i<n;i++)  {
        scanf("%d",&a[i]);
    }
    scanf("%d",&m);
    for(int i=0;i<m;i++) {
        scanf("%d",&b[i]);
    }
    while(i<n && j<m) {
        if(a[i]<=b[j])
        printf("%d ",a[i++]);
        else
        printf("%d ",b[j++]);
    }
    while(i<n) {
        printf("%d ",a[i++]);
    }
    while(j<m) {
        printf("%d ",b[j++]);
    }
    return 0;
}