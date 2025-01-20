# 입력 받기
N = int(input())  # 사람 수
P = list(map(int, input().split()))  # 각 사람이 돈을 인출하는 데 걸리는 시간

# 인출 시간을 오름차순으로 정렬
P.sort()

# 각 사람이 돈을 인출하는 데 필요한 시간의 합 계산
total_time = 0
current_time = 0

for time in P:
    current_time += time  # 현재 사람이 기다려야 하는 시간
    total_time += current_time  # 총 기다린 시간에 더해줌

# 결과 출력
print(total_time)