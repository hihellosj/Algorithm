import math

N = input().strip()

counts = [0] * 10

for c in N:
    num = int(c)
    if num == 9:
        num = 6
    counts[num] += 1
    
counts[6] = math.ceil(counts[6] / 2)

print(max(counts))