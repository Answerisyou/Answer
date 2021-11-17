#3-2 1
# def do_twice(f) :
#     f()
#     f()
#
# def print_spam() :
#     print('spam')
#
# do_twice(print_spam)
#2____________________________________
# def do_twice(f,i) :
#     f(i)
#     f(i)
#
# def print_it(i) :
#     print(i)
#
# do_twice(print_it,'hello')
#3 ______________________________________
# def print_twice(i) :
#     print(i)
#     print(i)
#
# print_twice("hi")
#4 ---------------------------------------
# def do_twice(f,i) :
#     f(i)
#     f(i)
#
# def print_twice(i) :
#     print(i)
#     print(i)
#
# do_twice(print_twice,'spam')
#5 ------------------------------------------
def print_twice(i) :
    print(i)
    print(i)

def do_four(f,i) :
    print_twice(i)
    print_twice(i)

do_four(print_twice,"hello")