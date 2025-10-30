n, m = map(int, input().split())
maze = [list(map(int, input().strip())) for _ in range(n)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

queue = [(0, 0)]  # 시작점

while queue:
    x, y = queue[0]   # 맨 앞 좌표 꺼내기
    queue = queue[1:] # 맨 앞 제거 (큐 역할)

    for i in range(4):  # 4방향 탐색
        nx = x + dx[i]
        ny = y + dy[i]

        # 미로 범위 벗어나면 패스
        if nx < 0 or ny < 0 or nx >= n or ny >= m:
            continue
        # 벽이면 패스
        if maze[nx][ny] == 0:
            continue
        # 이동 가능한 칸이면 거리 갱신
        if maze[nx][ny] == 1:
            maze[nx][ny] = maze[x][y] + 1
            queue.append((nx, ny))

print(maze[n-1][m-1])
