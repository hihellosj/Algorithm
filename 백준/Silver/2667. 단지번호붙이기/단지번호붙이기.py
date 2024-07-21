# 1. 아이디어
# - 2중 for, 값이 1 && 방문X => DFS
# - DFS를 통해 찾은 값을 저장 후 정렬해서 출력
#
# 2. 시간복잡도
# - DFS : O(V+E)
# - V, E : N^2, 4N^2
# - V+E : 5N^2 ~= N^2 ~= 625 >> 가능
# 
# 3. 자료구조
# - 그래프 저장 : int[][]
# - 방문여부 : bool[][]
# - 결과값 : int[]



import sys
input = sys.stdin.readline

n = int(input())
map = [list(map(int, input().strip())) for _ in range(n)]
chk = [[False] * n for _ in range(n)]
dy = [1, 0, -1, 0]
dx = [0, 1, 0, -1]

each = 0
result = []

def dfs(y, x):
    global each
    each += 1
    for k in range(4):
        ny = y + dy[k]
        nx = x + dx[k]
        if 0<=ny<n and 0<=nx<n:
            if map[ny][nx] == 1 and chk[ny][nx] == False:
                chk[ny][nx] = True
                dfs(ny, nx)


for j in range(n):
    for i in range(n):
        if map[j][i] == 1 and chk[j][i] == False:
            each = 0
            chk[j][i] = True
            dfs(j, i)
            result.append(each)


print(len(result))
result.sort()
for i in result:
    print(i)