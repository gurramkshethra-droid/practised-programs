#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int MAX=100; 
    int a[MAX];
    int total=(100*101)/2;
    int sum=0;
    for(int i=0;i<99;i++) {
        scanf("%d",&a[i]);
        sum+=a[i];
    }
    if(sum!=total) {
        printf("%d",total-sum);
    }
    return 0;
}