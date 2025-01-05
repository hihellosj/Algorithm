def min_button_presses(N, M, broken_buttons):
    # 고장난 버튼을 제외한 가능한 숫자 버튼들
    possible_buttons = set(range(10)) - set(broken_buttons)

    # 100번에서 시작할 때, 최소 횟수는 abs(100 - N) (단순히 +, - 버튼만 이용한 경우)
    min_presses = abs(100 - N)

    # N의 자릿수 길이만큼의 버튼을 눌러서 가는 경우를 고려
    for num in range(1000000):  # 충분히 큰 범위 (최대 500,000까지 가능)
        # num을 문자로 바꿔서 각 자릿수에 고장난 버튼이 포함되지 않는지 확인
        if all(int(digit) in possible_buttons for digit in str(num)):
            # 이 숫자까지 채널을 가려면 num 길이의 버튼을 누르고, +, - 버튼으로 이동
            min_presses = min(min_presses, len(str(num)) + abs(num - N))

    return min_presses


# 입력 받기
N = int(input())  # 목표 채널 N
M = int(input())  # 고장난 버튼 개수 M
broken_buttons = list(map(int, input().split())) if M > 0 else []

# 결과 출력
print(min_button_presses(N, M, broken_buttons))
