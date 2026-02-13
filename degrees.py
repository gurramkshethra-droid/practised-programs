# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
ab=int(input())
ac=int(input())
angle=round(math.degrees(math.atan(ab/ac)))
print(str(angle) + "\u00B0")
