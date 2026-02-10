#include <stdio.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    char s[101];
    scanf("%s",s);
    for(int i=0;s[i]!='\0';i++) {
        if(s[i]<'0' || s[i]>'9') {
            printf("No");
            return 0;
        }
    } 
    printf("Yes");
    return 0;
}