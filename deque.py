# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import deque
n=int(input())
d=deque()
for _ in range(n):
    m=input().split()
    if(m[0]=="append"):
        d.append(m[1])
    elif(m[0]=="appendleft"):
        d.appendleft(m[1])
    elif(m[0]=="pop"):
        d.pop()
    elif(m[0]=="popleft"):
        d.popleft()
print(*d)