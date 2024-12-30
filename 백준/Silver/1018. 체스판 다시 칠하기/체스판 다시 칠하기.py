def count_paint(board, start_x, start_y, pattern):
    count = 0
    for i in range(8):
        for j in range(8):
            # 현재 칸의 색이 패턴과 다르면 count 증가
            if board[start_x + i][start_y + j] != pattern[i][j]:
                count += 1
    return count

def min_repaints(N, M, board):
    # 두 체스판 패턴 생성
    chess1 = [['W', 'B'] * 4, ['B', 'W'] * 4] * 4  # 흰색으로 시작
    chess2 = [['B', 'W'] * 4, ['W', 'B'] * 4] * 4  # 검은색으로 시작
    
    min_count = float('inf')
    
    # 모든 8x8 부분 보드 확인
    for i in range(N - 7):
        for j in range(M - 7):
            # 두 체스판 패턴과의 차이 계산
            repaint1 = count_paint(board, i, j, chess1)
            repaint2 = count_paint(board, i, j, chess2)
            # 최소값 갱신
            min_count = min(min_count, repaint1, repaint2)
    
    return min_count

# 입력 받기
N, M = map(int, input().split())
board = [input().strip() for _ in range(N)]

# 결과 출력
print(min_repaints(N, M, board))
