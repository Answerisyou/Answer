def count_num(str):
    count_num=0
    count_alpha=0
    for s in str:
        if s.isdigit():
            count_num+=1
        elif s.isalpha():
            count_alpha+=1

    return count_num,count_alpha

y=count_num("zxcvb12345")
print(y)
