# def nusted_sum(t):
#     total = 0
#     for v in t :
#         # total += sum(v)
#         for x in v :
#             total +=x
#     return total
#
# t=[[1,2],[3],[4,5]]
# print(nusted_sum(t))

def cumsum(t) :
    list = []
    total = 0
    for v in t :
        total += v
        list.append(total)
    return list

t=[1,2,3]
print(cumsum(t))
