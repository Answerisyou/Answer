#def f(n):
#    if n>0 and n<=2:
#        return 1
#    if n==0:
#        return 0
#    else:
#        return f(n-1)+f(n-2)

#for i in range (10):
#    print(f(i))

#def sqr(n):
#    x=n/2
#    while True:
#        y=(x+n/x)/2
#        if abs(y-x)<0.0000001:
#            break
#        x=y
#    return x

#print (sqr(4))

#for i in range(1,8):
#    a=int(input("请输入1-50的整数"))
#    if a<1 or a>50:
#        print("请重新输入1-50整数")
#    else:
#        print("*"*a)

def countweishu(n):
    if n>=10000:
        print("这是一个5位数")
        wan=int(n/10000)
        qian=int(n/1000%10)
        bai=int(n/100%10)
        shi=int(n/10%10)
        ge=n%10
        print(ge,shi,bai,qian,wan)
    elif n>=1000:
        print("这是一个4位数")
        qian=int(n/1000%10)
        bai=int(n/100%10)
        shi=int(n/100%10)
        ge=n%10
        print(ge,shi,bai,qian)
    elif n>=100:
        print("这是一个3位数")
        bai=int(n/100)
        shi=int(n/10%10)
        ge=n%10
        print(ge,shi,bai)
    elif n>=10:
        print("这是一个2位数")
        shi=int(n/10)
        ge=n%10
        print(ge,shi)
    else:
        print("这是一个1位数")
        print(n)

countweishu(1234)




























