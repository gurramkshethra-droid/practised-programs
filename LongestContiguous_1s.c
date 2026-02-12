#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++) {
        scanf("%d",&a[i]);
    }  
    int count=0,max=0;
    for(int i=0;i<n;i++) {
        if(a[i]==1) {
            count++;
            if(count > max) {
                max=count;
            }
        }
        else {
            count=0;
        }

    }
    printf("%d",max);
    return 0;
}