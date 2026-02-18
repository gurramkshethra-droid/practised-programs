#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    scanf("%d",&n);
    int a[100];
    for(int i=0;i<n;i++) {
        scanf("%d",&a[i]);
    } 
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            if(a[i]==a[j]) {
                printf("%d",a[i]);
                return 0;
            }
        }
    }
    return 0;
}
