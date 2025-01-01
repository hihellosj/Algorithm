#다 더하는 함수 만들기
def sumFn(n):
    return n + sum(int(digit) for digit in str(n))


#셋 만들기
sumSet = set()

#만까지 for문 돌려서 함수로 보내기 리턴값 셋에 넣기
for i in range(1, 10001):
    sumSet.add(sumFn(i))

#만까지 돌려서 셋에 없는 숫자 출력
for i in range(1,10001):
    if i not in sumSet:
        print(i)
