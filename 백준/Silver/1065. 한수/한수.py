N = int(input())

def hansu(i):
    digits = [int(digit) for digit in str(i)]
    if i < 100:
        return True
    elif digits[1]-digits[0] == digits[2]-digits[1]:
        return True

count = 0
for N in range(1, N+1):
    if hansu(N):
        count += 1

print(count)