
import platform
import os
import subprocess
#from colorama import Fore

sistema = platform.system()
#print("Estamos en {}".format(sistema))

if sistema == 'Windows':
    output = subprocess.check_output('dir', shell=True)
    #print(Fore.GREEN+str(output))
   


elif sistema == 'Linux':
    output = subprocess.check_output('ls -l', shell=True)
    #print(Fore.GREEN+str(output))


elif sistema == 'Darwin':
    output = subprocess.check_output('ls -l', shell=True)
    #print(Fore.GREEN+str(output))
