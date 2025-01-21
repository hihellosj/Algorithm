def max_meetings(N, meetings):
    # 회의들을 끝나는 시간 기준으로 오름차순 정렬, 끝나는 시간이 같으면 시작 시간 기준으로 오름차순 정렬
    meetings.sort(key=lambda x: (x[1], x[0]))  # 끝나는 시간, 시작 시간 순으로 정렬
    
    # 가장 첫 번째 회의는 무조건 선택
    count = 1
    last_end_time = meetings[0][1]

    # 두 번째 회의부터 차례대로 확인
    for i in range(1, N):
        start, end = meetings[i]
        # 시작 시간이 이전 회의 끝나는 시간보다 크거나 같으면 회의 가능
        if start >= last_end_time:
            count += 1
            last_end_time = end  # 선택한 회의의 끝나는 시간으로 갱신

    return count

# 입력 받기
N = int(input())  # 회의의 수
meetings = [tuple(map(int, input().split())) for _ in range(N)]

# 최대 회의 수 출력
print(max_meetings(N, meetings))
