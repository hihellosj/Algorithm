n = int(input())

 
for _ in range(n):
    s = input().strip()
    stack = []
    is_valid = True 
    
    for char in s:
        if char == '(':
            stack.append(char)
        elif char == ')':
            if stack:
                stack.pop()
            else:
                is_valid = False
                break
        
    if stack:
        is_valid = False
    
    if is_valid:
        print("YES")
    else:
        print("NO")
    