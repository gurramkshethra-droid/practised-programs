# Enter your code here. Read input from STDIN. Print output to STDOUT   
n=int(input())
d={}
for i in range(n):
    m=input()
    if m not in d:
        d[m]=1
    else:
        d[m]=d[m]+1     
print(len(d))
for i in d:
    print(d[i],end=" ")