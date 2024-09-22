import sys
input = sys.stdin.readline


n = int(input())
c = []
for i in range(1,n):
    a = str(i)
    m = list(a)
    d = list(map(int, m))
    if i+sum(d) == n:
        c.append(i)
        print(i)
        break

if(len(c)==0):
    print(0)