a=int(input('Enter an integer (A): '))
b=int(input('Enter an integer (B): '))
c=int(input('Enter an integer (C): '))

if (a==b):
    print(str(a) + " A is equal to B " + str(b))
if (a==c):
    print(str(a) + " A is equal to C " + str(c))
if (b == c):
     print(str(b)+ " B is equal to C " + str(c))
if ( a!=b and a!=c and b!=a):
    print("None equal")