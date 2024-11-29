# 점의 개수 N
N = int(input())

# 점의 좌표를 저장할 리스트
points = []

# 점의 좌표 입력 받기
for _ in range(N):
    x, y = map(int, input().split())
    points.append((x, y))

# 점들을 x좌표 기준으로 정렬하고, x좌표가 같으면 y좌표 기준으로 정렬
points.sort(key=lambda point: (point[0], point[1]))

# 정렬된 점 출력
for point in points:
    print(point[0], point[1])
