def sugar(s):
    answer = 0
    while s>=0:
        if s%5 == 0:
            answer += s//5
            return answer
        s -= 3
        answer += 1
    return -1
n = int(input())

print(sugar(n))