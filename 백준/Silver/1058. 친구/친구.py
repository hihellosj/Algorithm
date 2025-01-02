# 2-친구란 1.직접 친구 2.중간친구 거쳐서 친구
# 1이랑 2 구하기
# 최대 카운트 출력력


def max_two_friends(N, friends):
    two_friends = set()
    max_count = 0
    for i in range(N):
        for j in range(N):
            if friends[i][j] == 'Y':
                two_friends.add(j)
                
                for k in range(N):
                    if friends[j][k] == 'Y' and k != i:
                        two_friends.add(k)
        max_count = max(max_count, len(two_friends))
        two_friends = set()
    return max_count
    
N = int(input())
friends = [input().strip() for _ in range(N)]

print(max_two_friends(N, friends))