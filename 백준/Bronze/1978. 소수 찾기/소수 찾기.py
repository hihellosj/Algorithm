import sys

input = sys.stdin.readline

n = int(input().strip())
a = list(map(int, input().split()))
chk = 0

for i in a:
    c = []
    for b in range(i): #수를 1부터 i까지 나눠서
        if i%(b+1)==0: #나머지가 0이 되는 경우
            c.append(b+1)
    if i != 1:
        c.remove(1)
        c.remove(i)
    if len(c)==0: #소수이다(카운트해준다)
        chk=chk+1

print(chk)


