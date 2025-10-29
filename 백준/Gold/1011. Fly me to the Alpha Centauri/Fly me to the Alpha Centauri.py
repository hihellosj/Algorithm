import math

T = int(input())

for _ in range(T):
    x, y = map(int, input().split())
    d = y - x  # 이동해야 하는 거리
    
    n = 0  # 이동 횟수
    move = 0  # 지금까지 이동한 거리
    
    while move < d:
        n += 1
        move += math.ceil(n/2)  # 증가/감소 패턴 고려
    
    print(n)
