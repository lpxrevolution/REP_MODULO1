import subprocess

#create a new file based on a variable

number=input("Enter the end number for the new file:")

#validate the number variables contains a number

if number.isnumeric():
    print("It is a number")
    #output = subprocess.check_output('echo file'+str(number)+' > file'+ str(number), shell=True)
else:
    print("It is NOT a number")