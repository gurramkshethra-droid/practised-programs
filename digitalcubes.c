#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    scanf("%d",&n);
    int temp=n;
    int sum=0,rem;
    while(temp>0) {
        rem=temp%10;
        sum+=rem*rem*rem;
        temp=temp/10;
    } 
    if(sum==n) {
        printf("Yes");
    }
    else {
        printf("No");
    }
    return 0;
}