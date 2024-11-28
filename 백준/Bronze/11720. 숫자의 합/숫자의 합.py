import sys
input = sys.stdin.readline

n = input()
num = list(map(int, input().strip()))
answer = 0

for item in num:
    answer = answer + item

print(answer)

