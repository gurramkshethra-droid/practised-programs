#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int search,n;
    scanf("%d",&n);
    scanf("%d",&search);
    int a[100];
    for(int i=0;i<n;i++) {
        scanf("%d",&a[i]);
    }
    int found=0;
    for(int i=0;i<n;i++) {
        if(search==a[i]) {
            printf("%d",i);
            found=1;
            break;
        }
    }
    if(found==0) {
        printf("-1");
    }
    return 0;
}