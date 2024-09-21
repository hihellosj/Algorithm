import sys
input = sys.stdin.readline

def is_group_word(word):
    seen = set()  # 이미 등장한 문자 저장
    last_char = ''  # 마지막으로 등장한 문자

    for char in word:
        if char != last_char:  # 현재 문자와 이전 문자가 다를 경우
            if char in seen:  # 이미 등장한 문자인 경우
                return False  # 그룹 단어가 아님
            seen.add(char)  # 새로운 문자 추가
            last_char = char  # 마지막 문자 업데이트

    return True  # 그룹 단어임

# 입력
N = int(input())
group_word_count = 0

for _ in range(N):
    word = input().strip()  # 단어 입력
    if is_group_word(word):
        group_word_count += 1  # 그룹 단어 카운트 증가

# 출력
print(group_word_count)