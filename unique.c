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
        int count=0;
        for(int j=0;j<n;j++) {
            if(a[i]==a[j]) {
                count++;
            }
        }
        if(count==1) {
            printf("%d ",a[i]);
        }
    }
    return 0;
}