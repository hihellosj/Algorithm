import sys
input = sys.stdin.readline

n, m = map(int, input().split())

minNum = min(n,m)
maxNum = max(n,m)

minNumDivisors = [i for i in range(1, minNum+1) if minNum % i ==0]

minNumDivisors = sorted(minNumDivisors, reverse=True)

for g in minNumDivisors:
    if maxNum%g == 0 :
        print(g)
        print(n//g * m//g * g)
        break

