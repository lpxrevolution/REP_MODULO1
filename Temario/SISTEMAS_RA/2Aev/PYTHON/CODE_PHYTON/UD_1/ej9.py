myNumber = int(input('Enter an integer: '))
long = len(str(myNumber))


if (long == 1):
    print("{0:0=3d}".format(myNumber))
elif(long == 2):
    print("{0:0=3d}".format(myNumber))
else :
    print(myNumber)
