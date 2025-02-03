n, m = map(int, input().split())
map = [list(map(int, input().split())) for _ in range(n)]
chk = [[0]*m for _ in range(n)]


dx=[1,0,-1,0]
dy=[0,1,0,-1]

def bfs(c,d,map):
    size = 1
    lili = [(c,d)]
    while lili:
        a, b = lili.pop()
        for k in range(4):
            nx = a+dx[k]
            ny = b+dy[k]
            if 0<=nx<n and 0<=ny<m:
                if map[nx][ny] ==1 and chk[nx][ny] ==0:
                 lili.append((nx,ny))
                 chk[nx][ny]=1
                 size+=1
    return size

count = 0
max_size = 0

for i in range(n):
    for j in range(m):
        if map[i][j] == 1 and chk[i][j] == 0:
            count+=1
            chk[i][j]=1
            max_size = max(max_size, bfs(i, j, map))

print(count)
print(max_size)
