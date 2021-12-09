import platform
import subprocess

#También valido mkdir.

#import os
sistema = platform.system()
#print("Estamos en {}".format(sistema))

if sistema == 'Windows':
    output = subprocess.check_output('md EXERCISE_6', shell=True)
    print(output)
    print("Windows")


elif sistema == 'Linux':
    output = subprocess.check_output('pwd', shell=True)
    print(output)


elif sistema == 'Darwin':
    output = subprocess.check_output('pwd', shell=True)
    print(output)
