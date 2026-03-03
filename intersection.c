#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n,m;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++) {
        scanf("%d",&a[i]);
    }  
    scanf("%d",&m);
    int b[m];
    for(int j=0;j<m;j++) {
        scanf("%d",&b[j]);
    }
    for(int i=0;i<n;i++) {
        int flag=0;
        for(int j=0;j<m;j++) {
            if(a[i]==b[j]) {
                flag=1;
                break;
            }
        }
        for(int k=0;k<i;k++) {
            if(a[i]==a[k]) {
                flag=0;
                break;
            }
        }
        if(flag==1) {
            printf("%d ",a[i]);
        }
    }
    return 0;
}