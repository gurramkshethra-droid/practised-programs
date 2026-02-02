from collections import defaultdict
n, m=map(int, input().split())
A=defaultdict(list)
for i in range (1,n+1):
    words=input()
    A[words].append(i)
for _ in range(m):
    words=input()
    if(words in A):
        print(*A[words])
    else:
        print(-1)
