import sys
input = sys.stdin.readline

word = input()
arr = list(word)

alarr = [chr(i) for i in range(97, 123)]
answer = [-1] * 26

for index, value in enumerate(arr):
    for idx, val in enumerate(alarr):
        if value == val:
            if answer[idx] == -1:
                answer[idx] = index
                
print(' '.join(map(str, answer)))

