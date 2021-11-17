# import turtle
# bob=turtle.Turtle()
# print(bob)
# bob.fd(100)
# bob.lt(90)
# bob.fd(100)
# bob.rt(90)
# bob.lt(90)
# bob.fd(100)S
# turtle.mainloop()

# import turtle
# bob=turtle.Turtle()
# def square(t) :
#     for i in range(4) :
#         t.fd(100)
#         t.rt(90)
#
# square(bob)

import turtle
bob=turtle.Turtle()
def square(t,length) :
    for i in range(4) :
        t.fd(length)
        t.rt(90)

square(bob,200)