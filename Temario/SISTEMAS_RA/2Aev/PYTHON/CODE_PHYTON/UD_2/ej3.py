import subprocess
output = subprocess.check_output('dir /A:H', shell=True)
print(output)
