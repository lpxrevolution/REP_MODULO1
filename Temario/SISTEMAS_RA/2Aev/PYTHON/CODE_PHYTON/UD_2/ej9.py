import subprocess
import platform
sistema = platform.system()
#También valido mkdir.



if sistema == 'Windows':
    output = subprocess.check_output(
        'md   SIN\BLOCK2\ACTIVITY1  SIN\BLOCK3\ACTIVITY1', shell=True)
    print(output)
    print("Windows")


elif sistema == 'Linux':
    output = subprocess.check_output(
        'mkdir -R   SIN/BLOCK2/ACTIVITY1  SIN/BLOCK3/ACTIVITY1', shell=True)
    print(output)


elif sistema == 'Darwin':
    output = subprocess.check_output(
        'mkdir -R   SIN/BLOCK2/ACTIVITY1  SIN/BLOCK3/ACTIVITY1', shell=True)
    print(output)
