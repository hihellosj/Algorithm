n = int(input())  # 첫 번째 배열의 크기
arr = set(input().split())  # arr을 집합으로 변환하여 검색 속도 개선

m = int(input())  # 두 번째 배열의 크기
arr2 = input().split()  # 두 번째 배열

# arr2의 각 항목에 대해 arr에 존재하는지 확인
for item in arr2:
    if item in arr:
        print("1")
    else:
        print("0")
