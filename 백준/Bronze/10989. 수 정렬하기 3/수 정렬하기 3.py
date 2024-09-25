import sys

# 입력
input = sys.stdin.readline

# 숫자의 범위는 1부터 10,000까지이므로, 각 숫자의 빈도를 기록할 배열을 생성
max_value = 10000
count = [0] * (max_value + 1)

# 첫 번째 줄에서 N을 입력받음
N = int(input())

# N개의 숫자를 입력받아서 각 숫자의 빈도를 세어줌
for _ in range(N):
    num = int(input())
    count[num] += 1

# 결과 출력
# 숫자들을 오름차순으로 출력하되, 해당 숫자가 나온 횟수만큼 출력
for i in range(1, max_value + 1):
    if count[i] > 0:
        for j in range(count[i]):
            print(str(i))
