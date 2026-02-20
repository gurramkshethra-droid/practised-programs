#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n,temp=0;
    scanf("%d",&n);
    int a[25];
    for(int i=0;i<n;i++) {
        scanf("%d",&a[i]);
    } 
    for(int i=0;i<n-1;i++) {
        for(int j=0;j<n-i-1;j++) {
            if(a[j]>a[j+1]) {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        for(int k=0;k<n;k++) {
            printf("%d ",a[k]);
        } 
        printf("\n");
    }
    return 0;
}