import math
def a(x,y,n):
    return (x-2**(n-1))**2+(y-2**(n-1))**2 <= 2**(2*n-2)

def do(x1, x2, y1, y2,n):
    data = [a(x1,y1,n),a(x1,y2,n),a(x2,y1,n),a(x2,y2,n)]

    print(x1,x2,y1,y2)
    print(data)
    if int(x1) == int(x2):
        print("add2")
        return 2
    elif data[1:] == data[:-1]:
        print("add2")
        return 2
    else:
        xn = int(math.floor((x1+x2)/2))
        xx = int(math.ceil((x1+x2)/2))
        yn = int(math.floor((y1+y2)/2))
        yx = int(math.ceil((y1+y2)/2))
        return 1 + do(x1,xn,y1,yn,n) + do(xx,x2,y1,yn,n) + do(x1,xn,yx,y2,n) + do(xx,x2,yx,y2,n)

print(do(0,3,0,3,2))



