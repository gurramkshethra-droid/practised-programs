
int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++) {
        scanf("%d",&a[i]);
    }   
    int x;
    scanf("%d",&x);
    int first=-1,last=-1;
    for(int i=0;i<n;i++) {
        if(a[i]==x) {
            if(first==-1) {
                first=i;
            }
            last=i;
        }
    }
    printf("%d %d",first,last);
    return 0;
}
