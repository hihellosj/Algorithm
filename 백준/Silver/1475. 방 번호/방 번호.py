import math

N = input().strip()

# 숫자 0~9 개수 저장할 리스트
counts = [0] * 10

for c in N:
    num = int(c)
    if num == 9:  # 9는 6으로 취급
        num = 6
    counts[num] += 1

# 6은 9 포함해서 반 올림
counts[6] = math.ceil(counts[6] / 2)

print(max(counts))
