import sys
input = sys.stdin.readline

N = int(input())
a = []
for _ in range(N):
    a.append(int(input().strip()))

a.sort()


for i in a:
    print(i)