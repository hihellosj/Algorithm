import sys
import math
input = sys.stdin.readline

n = int(input().strip())

m = list(map(int, input().split()))

tCnt, pCnt = map(int, input().split())


trs = 0
prs = 0
eachPrs = 0

for item in m:
    if item > 0:
        trs=trs+math.ceil(item / tCnt)
        
if pCnt!=0:
    if int(n//pCnt)==0:
        eachPrs = n
    else:
        prs = int(n//pCnt)
        eachPrs = n%pCnt
else:
    eachPrs = n


print(trs)
print(prs, eachPrs)

