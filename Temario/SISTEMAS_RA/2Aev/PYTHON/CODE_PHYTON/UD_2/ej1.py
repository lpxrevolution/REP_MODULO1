import subprocess
output = subprocess.check_output('cd', shell=True)
print(output)