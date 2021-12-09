
import platform
import os
import subprocess
sistema = platform.system()
#print("Estamos en {}".format(sistema))

if sistema == 'Windows':
    output = subprocess.check_output('cd', shell=True)
    print(output)



elif sistema == 'Linux':
    output = subprocess.check_output('pwd', shell=True)
    print(output)



elif sistema == 'Darwin':
    output = subprocess.check_output('pwd', shell=True)
    print(output)


