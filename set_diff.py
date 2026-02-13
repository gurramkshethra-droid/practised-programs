# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
arr=set(map(int,input().split()))
m=int(input())
brr=set(map(int,input().split()))
r1=arr.difference(brr)
r2=brr.difference(arr)
result=sorted(r1.union(r2))
for i in result:
    print(i)