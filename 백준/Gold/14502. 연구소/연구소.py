from collections import deque

# 상, 하, 좌, 우 방향
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(grid, N, M):
    # 바이러스 확산을 위한 BFS
    visited = [[False] * M for _ in range(N)]
    queue = deque()
    
    # 바이러스가 있는 위치 큐에 넣기
    for i in range(N):
        for j in range(M):
            if grid[i][j] == 2:
                queue.append((i, j))
                visited[i][j] = True

    while queue:
        x, y = queue.popleft()
        
        # 상하좌우로 퍼지기
        for i in range(4):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < N and 0 <= ny < M and not visited[nx][ny]:
                if grid[nx][ny] == 0:  # 빈 칸인 경우만
                    visited[nx][ny] = True
                    queue.append((nx, ny))

    # 안전 영역의 크기 계산
    safe_area = 0
    for i in range(N):
        for j in range(M):
            if grid[i][j] == 0 and not visited[i][j]:  # 빈 칸 중 방문하지 않은 곳
                safe_area += 1
    return safe_area

def solve(N, M, grid):
    # 빈 칸을 저장
    empty_spaces = []
    
    for i in range(N):
        for j in range(M):
            if grid[i][j] == 0:
                empty_spaces.append((i, j))
    
    # 벽을 3개 세우는 모든 조합 구하기
    max_safe_area = 0
    # 3개의 벽을 세울 수 있는 조합을 찾기 위한 반복문
    for i in range(len(empty_spaces)):
        for j in range(i + 1, len(empty_spaces)):
            for k in range(j + 1, len(empty_spaces)):
                # 3개의 벽을 세운 새로운 grid 생성
                new_grid = [row[:] for row in grid]
                new_grid[empty_spaces[i][0]][empty_spaces[i][1]] = 1
                new_grid[empty_spaces[j][0]][empty_spaces[j][1]] = 1
                new_grid[empty_spaces[k][0]][empty_spaces[k][1]] = 1
                
                # 바이러스 확산 후 안전 영역 계산
                max_safe_area = max(max_safe_area, bfs(new_grid, N, M))

    return max_safe_area

# 입력 받기
N, M = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(N)]

# 결과 출력
print(solve(N, M, grid))
