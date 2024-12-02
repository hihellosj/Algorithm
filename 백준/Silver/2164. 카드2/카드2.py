from collections import deque

n = int(input())  # n 입력받기
arr = deque(range(1, n+1))  # 1부터 n까지의 수로 deque 초기화

while len(arr) > 1:
    arr.popleft()  # 첫 번째 요소를 제거
    fe = arr.popleft()  # 그다음 첫 번째 요소를 제거
    arr.append(fe)  # 그 값을 뒤로 추가

print(arr[0])  # 남은 하나의 숫자 출력
