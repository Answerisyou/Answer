# import turtle
# import Math
# def square(t,length,r):
#     bob=turtle.Turtle()
#     print(bob)
#     for i in range(n):
#         bob.fd(length)
#         bob.rt(360/n)
#     p=2*Math.pi*r
#
# bob=turtle.Turtle()
# square(bob,100,12)
# square(bob,70,6)

# import turtle
# def polygon(t,length,n) :
#     angle = 360 / n
#     for i in range(n) :
#         t.fd(length)
#         t.rt(angle)
#
# bob=turtle.Turtle()
# polygon(bob,100,7)

import turtle
import math
bob=turtle.Turtle()
# def polygon(t,length,n) :
#     angle = 360 / n
#     for i in range(n) :
#         t.fd(length)
#         t.rt(angle)

# def circle(t,r) :
#     # n = 50
#     c = 2 * math.pi * r
#     n=int(c / 3) + 1
#     length = c / n
#     polygon(t,length,n)

# circle(bob,100)
# def polyline(t,n,length,angle) :
#     for i in range(n) :
#         t.fd(length)
#         t.rt(angle)
#
# def polygon(t,n,length) :
#     angle = 360.0 / 5
#     polyline(t,n,length,angle)
#
# def arc(t,r,angle) :
#     arc_length = 2 * math.pi * r * (angle / 360)
#     n = int(arc_length / 3) + 1
#     step_length = arc_length / n
#     step_angle = float(angle) / n
#     polyline(t,n,step_length,step_angle)
#
# def circle(t,r) :
#     arc(t,r,360)
#
# # arc(bob,100,90)
# circle(bob,100)

##画圆
# import turtle
# import math
# bob=turtle.Turtle()
# def polygon(t,n,length) :
#     angle = 360 / n
#     for i in range(n) :
#         t.fd(length)
#         t.rt(angle)
#
# def circle(t,r) :
#     c = 2 * math.pi * r
#     n =int(c / 3) + 1
#     length = c / n
#     polygon(t,n,length)
#
# circle(bob,100)

##画弧
import turtle
import math
bob=turtle.Turtle()
def polyline(t,n,length,angle) :
    for i in range(n) :
        t.fd(length)
        t.rt(angle)

def polygon(t,n,length) :
    angle = 360.0 / n
    polyline(t,n,length,angle)

def arc(t,r,angle) :
    arc_length = 2 * math.pi * r * ( angle / 360)
    n = int(arc_length / 3) + 1
    step_length = arc_length / n
    step_angle = float(angle) / n
    polyline(t,n,step_length,step_angle)

# arc(bob,100,270)
def circle(t,r) :
    arc(t, r,angle=360)

circle(bob,100)
