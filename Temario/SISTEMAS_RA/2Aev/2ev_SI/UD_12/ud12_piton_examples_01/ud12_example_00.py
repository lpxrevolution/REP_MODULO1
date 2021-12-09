#import libraries to use: os, subprocess, json, etc.
import sys
import os
#initialize variables (if necessary)
result=0

#validate input data (if necessary): 
#   conditionals commonly used, 
#   also user defined functions
#for example: 
#   number of arguments, 
#   range of data such as 'it must be between 1 and 10'

print("Argument List:", str(sys.argv))
num1=int(sys.argv[1])
num2=int(sys.argv[2])

#body of the algorithm: what it must do (or not do)
    #common structures used: 
    #   loops: for, while, 
    #   conditionals: if, 
    #   library functions (lists, commands, string, math, ...)
    #   user defined functions (def)

#show final results (if asked)

if num1>=0 and num2>=0:
    print("El resultado es: " + str(num1*num2))
else:
    print("Los numeros deben ser positivos")



