from collections import OrderedDict

n = int(input())
d = OrderedDict()

for i in range(n):
    x = input().split()
    price = int(x[-1])
    name = " ".join(x[:-1])

    if name in d:
        d[name] = d[name] + price
    else:
        d[name] = price

for i in d:
    print(i, d[i])