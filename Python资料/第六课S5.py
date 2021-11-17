#x=int(input("请输入一个三位数"))
#bai=x//100
#shi=x%100//10
#ge=x%10
#print(bai,shi,ge)
#递归
#def print_s():
#    print("hello")]
    
#def do_n(f,n):
#        if n<=0:
#            return
#        f()
#        do_n(f,n-1)
#        f()
#    for i in range(n):
#        f()
    
#do_n(print_s,2)
    
#练习
#def compare(x,y):
#    if x>y:
#        return 1
#    elif x==y:
#        return 0
#    else:
#        return -1

#x=compare(3,3)
#print(x)

#import math
#def con_dis(x1,y1,x2,y2):
#    distance=math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))
#    return distance

#dis=con_dis(1,1,2,2)
#print(dis)
#def con_area(x1,y1,x2,y2):
#    r=con_dis(x1,y1,x2,y2)
#    area=math.pi*r**2
#**2为2次方
#    return area

#area=con_area(1,1,2,2)
#print(area)

def jiecheng(n):
    if n==0:
        return 1
    else:
        n=n*jiecheng(n-1)
        return n

fn=jiecheng(1)
print(fn)




































