import sys
import math
input = sys.stdin.readline

n = int(input().strip())
m = list(map(int, input().split()))
tCnt, pCnt = map(int, input().split())

trs = 0
prs = 0
eachPrs = 0

# tCnt에 대한 계산
for item in m:
    if item > 0:
        trs += math.ceil(item / tCnt)

# pCnt에 대한 계산
if pCnt != 0:
    prs = n // pCnt  # n을 pCnt로 나눈 몫
    eachPrs = n % pCnt  # n을 pCnt로 나눈 나머지
else:
    eachPrs = n  # pCnt가 0인 경우 전체 인원을 eachPrs로 설정

print(trs)
print(prs, eachPrs)
