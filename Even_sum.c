#include <stdio.h>

int main() {
	// your code goes here
	int n;
	scanf("%d",&n);
	for(int i=0;i<n;i++) {
	    int m;
	    scanf("%d",&m);
	    int a[m];
	    for(int j=0;j<m;j++) {
	        scanf("%d",&a[j]);
	    }
	    int sum=0;
	    for(int j=m-1;j>=0;j--) {
	        sum+=a[j];
	    }
	    if(sum%2==0) {
	        printf("Yes");
	    }
	    else {
	        printf("No");
	    }
	    printf("\n");
	}

}

