
formArr = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']

def trans(x, formArr):
    result = []
    temp_str=""
    
    for char in x:
        if char.isdigit():
            result.append(char)
        else:
            temp_str += char
            for i, num_str in enumerate(formArr):
                if temp_str == num_str:
                    result.append(str(i))
                    temp_str = ""
                    break
            
    return int(''.join(result))
                    


def solution(s):
    return trans(s, formArr)
   