import random

secret = random.randint(0, 99)
attemps = 0
print(secret)

used = []
while (attemps < 5):
    ask = int(input('What is the number: '))
    if(ask > secret):
        print("The number you are looking for is less.")
        used.append(ask)
        attemps = attemps+1
        print("Attemps: " + str(used))
    elif(ask < secret):
        print("The number you are looking for is greater.")
        used.append(ask)
        attemps = attemps+1
        print("Attemps: " + str(used))
    else:
        print("Very good!")
        break