#include <stdio.h>

int main() {
	// your code goes here
	int n;
	scanf("%d",&n);
	for(int i=0;i<n;i++) {
	    int m;
	    scanf("%d",&m);
	    int a[m],b[m],sum=0,mindiff=1000000;
	    for(int j=0;j<m;j++) {
	        scanf("%d",&a[j]);
	        sum+=a[j];
	    }
	    for(int j=0;j<m;j++) {
	        scanf("%d",&b[j]);
	        int loss=a[j]-b[j];
	        if(loss<mindiff) {
	            mindiff=loss;
	        }
	    }
	    printf("%d\n",sum-mindiff);
	}

}

