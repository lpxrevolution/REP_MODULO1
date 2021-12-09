a = int(input('Enter an integer: '))
b = int(input('Enter an integer: '))
c = int(input('Enter an integer: '))

print(" ")

if (a>b and a>c):
    print("El mayor es: " + str(a))
elif (b>a and b>c):
    print("El mayor es: " + str(b))
elif(c>a and c>b):
    print("El mayor es: "+str(c))


print(" ")

if (a < b and a < c):
    print("El menor es: " + str(a))

elif(b < a and b < c):
    print("El menor es: " + str(b))
elif(c < a and c < b):
    print("El menor es: "+str(c))
    

