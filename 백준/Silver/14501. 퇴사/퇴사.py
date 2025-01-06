n = int(input())  # 남은 일수 N
schedule = [list(map(int, input().split())) for _ in range(n)]

# dp 배열을 n+1 크기로 초기화
dp = [0] * (n + 1)

# 뒤에서부터 역순으로 상담 선택
for i in range(n - 1, -1, -1):
    t, p = schedule[i]  # t: 상담 기간, p: 금액
    if i + t <= n:  # 상담을 할 수 있는 경우
        dp[i] = max(dp[i + 1], p + dp[i + t])
    else:  # 상담을 할 수 없는 경우
        dp[i] = dp[i + 1]

# 결과 출력
print(dp[0])
