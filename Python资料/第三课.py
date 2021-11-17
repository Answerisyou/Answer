#条件判断语句（if语句）
# num = 8
# if num>10 and num<20:
#     print("num比10大,num比20小")

# a = int(input('请输入一个三位数'))
# bai = a // 100
# shi = a % 100 // 10
# ge = a % 10
# print(f'百位是{bai}')
# print(f'十位是{shi}')
# print(f'个位是{ge}')

# import math
# def check_fermat(a,b,c,n) :
#     if n > 2 and pow(a,n) + pow(b,n) == pow(c,n) :
#         print("Holy smokes, Fermat was wrong!")
#     else :
#         print("No, that doesn’t work")
#
# def usecheck() :
#     a = int(input("请输入a的值"))
#     b = int(input("请输入b的值"))
#     c = int(input("请输入c的值"))
#     n = int(input("请输入n的值"))
#     check_fermat(a,b,c,n)
#
# usecheck()

# def is_triangle(a,b,c) :
#     if (a+b) < c or (a+c) < b or (b+c) < a :
#         print('No')
#     else :
#         print('Yes')
#
# # is_triangle(1,1,3)
# def usetri() :
#     a = int(input('请输入a的值'))
#     b = int(input("请输入b的值"))
#     c = int(input("请输入c的值"))
#     is_triangle(a,b,c)
#
# usetri()

def recurse(n,s) :
    if n == 0 :
        print(s)
    else :
        recurse(n-1,n+s)

recurse(3,0)