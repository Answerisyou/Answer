#Python播课单元
#if条件语句
#test1.
# a=int(input('请输入一个整数'))
# if (a%2) == 0 :
#     print("这是一个偶数")
# else :
#     print("这是一个奇数")
#test2.
# year = int(input("请输入一个年份"))
# if ((year%4) == 0 and (year%100) != 0 ) or ((year%400) == 0 ) :
#     print(f"{year}年是闰年")
# else :
#     print(f"{year}年不是闰年")
#test3.
# age = int(input("请输入修勾年龄"))
# if age == 1 or age == 2:
#     agep = 10.5
# elif age > 2 :
#     agep = 10.5*2 + (age-2)*4
# print(agep)
#test4
# grade = int(input("请输入成绩"))
# if grade == 100 :
#     print("奖励一辆BMW")
# elif grade >= 80 and grade <= 99 :
#     print("奖励一台iPhone")
# elif grade >= 60 and grade <= 79 :
#     print("奖励一本参考书")
# else :
#     print("什么也没有")
#test5
# a = int(input("高"))
# b = int(input("富"))
# c = int(input("帅"))
# if a > 180 and b > 1000 and c > 500 :
#     print("我一定要嫁给他")
# elif a > 180 or b > 1000 or c > 500 :
#     print("嫁吧，比上不足，比下有余")
# else :
#     print("不嫁")

#while循环语句
# test1
# i = 0
# sum = 0
# while i < 100 :
#     i = i + 1
#     if (i % 2) != 0 :
#         sum = sum + i
# print(sum)
#test2
# i = 0
# sum = 0
# count = 0
# while i < 100 :
#     i = i + 1
#     if i % 7 == 0 :
#         sum = sum + i
#         count = count +1
# print(sum)
# print(count)
#test3
# i = 100
# count = 0
# while i < 1000 :
#     i = i + 1
#     bai = int(i / 100)
#     shi = int(i / 10 % 10)
#     ge = i % 10
#     if (bai**3 + shi**3 + ge**3) == i :
#         count = count + 1
# print(count)
# print(bai,shi,ge)
#test4
# a = int(input("请输入一个数"))
# if a % 2 == 0 or a % 3 ==0 or a % 5 == 0 :
#     print(f"{a}不是质数")
# else :
#     print(f"{a}是质数")
# flag = True
# i = 2
# while i < a :
#     if a % i == 0 :
#         flag = False
#     i = i + 1
# if flag :
#     print(f"{a}是质数")
# else :
#     print(f"{a}不是质数")
#test6 九九乘法表
# i = 0
#
# while i < 9 :
#     i += 1
#     j = 0
#     while j < i :
#         j += 1
#         print(f"{j}*{i}={i*j}\t",end="")
#     print()
#test 7质数练习
# from time import *
# begin = time()
# i = 2
# while i <= 100000 :
#     flag =True
#     j = 2
#     while j <= i**0.5 :
#         if i % j == 0 :
#             flag = False
#             break
#         j = j + 1
#     if  flag :
#         # print(i)
#         pass
#     i += 1
# end = time()
# print(end-begin)


#列表
# mylist = [10,20,30,40,50]+[60,70,80,90]
# mylist = [10,20,30,40,50]
# print(max(mylist))
# print(len(mylist))
# print(mylist.index(50))

#数据结构的到range




#函数
# def countmul(a,b,c) :
#     print(a,"*",b,"*",c,"=",a*b*c)
#
# countmul(2,4,10)
# countmul(25,39,75)
#
# def welcome(i) :
#     print("welcome\t",i)
#
# welcome("alice")
# welcome("mike")

#字典
