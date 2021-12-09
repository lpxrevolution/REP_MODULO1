import os

name = input("What's your name:")
age = int(input("How old are you?"))
member = int(input("How many years have you been working in this company?"))
exp=age+member
private = name+"/private"

if (exp>35):
    os.makedirs(private)
else:
    os.mkdir(name)