import turtle
import math
bob=turtle.Turtle()
print(bob)
def polyline(t,n,length,angle):
    for i in range(n):
        t.fd(length)
        t.lt(angle)
#        t.rt(angle)
#        t.fd(length)

def polygon(t,n,length):
    angle=360.0/n
    polyline(t,n,length,angle)

def arc(t,r,angle):
    hc=2*math.pi*r*angle/360
    n=int(hc/3)+1
    zx=hc/n
    jd=float(angle)/n
    polyline(t,n,zx,jd)

arc(bob,300,45)
#polyline(bob,6,60,12)
#polygon(bob,6,60)
