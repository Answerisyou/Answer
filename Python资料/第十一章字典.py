def  histogram(s):
    d = {}
    for c in s :
        # if c not in d :
        #     d[c] = 1
        # else :
        #     d[c] += 1
       d[c] = d.get(c,0)+1
    return d

h=histogram("qwertyuiasdfghjqwearsgfchnvmnqwrehgm")
# print(h)
# print(h.get("e"))

def reverse_loopup(d,v) :
    for k in d :
        if d[k] == v :
            return k
    raise LookupError

# print(reverse_loopup(h,3))

def invert_dict(d) :
    invert = {}
    for k in d :
        val = d[k]
        if  val in invert :
            invert[val].append(k)
        else :
            invert[k] = val
    return invert
print(invert_dict(h))
