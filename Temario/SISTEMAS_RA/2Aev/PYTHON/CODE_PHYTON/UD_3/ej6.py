import random

temp = random.randint(-30, 40)
hum = random.randint(75,90)

print(str(temp)+" "+str(hum))

if (temp >= 40):
    print("Cancel School")
elif (temp < 40 and temp > 32 and hum > 75 ):
    print("Cancel School")
elif (temp < 32 and temp > 28 and hum > 88):
    print("Cancel School")
elif(temp<-25):
    print("OMFG!")
else:
    print("Go to School!")