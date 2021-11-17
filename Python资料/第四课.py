#def right_justify(s):
#    print(" "*65+s)
#
#right_justify("monty")

#def right_justify(s):
#    str_len=len(s)
#    print(" "*(70-str_len)+s)
#
#right_justify("monty")


#def do_twice(f,i):
#    f(i)
#    f(i)
#
#def print_it(i):
#    print(i)
#
#do_twice(print_it,"hello")

def do_twice(f,i):
    f(i)
    f(i)

def do_four(f,i):
    do_twice(f,i)
    do_twice(f,i)

def print_it(i):
    print(i)

do_four(print_it,"hello world")
