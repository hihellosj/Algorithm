# 회원 수 N
N = int(input())

# 회원 정보 입력 받기
members = []
for _ in range(N):
    age, name = input().split()
    members.append((int(age), name))

# 나이를 기준으로 정렬 (age 순, 동일 나이일 경우 입력 순서 유지)
members.sort(key=lambda x: x[0])

# 정렬된 결과 출력
for member in members:
    print(member[0], member[1])


