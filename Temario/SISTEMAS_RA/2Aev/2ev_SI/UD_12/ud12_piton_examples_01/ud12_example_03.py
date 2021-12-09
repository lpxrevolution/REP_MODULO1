import subprocess

# create N new files based on a numeric variable 
# and how many files the user wants to create
files=input("How many files do you want to create?:")

#validate the files variable contains a number
if files.isnumeric():
    files=int(files)
    while files>0:
        number=input("Enter the end number for the new file:")
        #validate the number variable contains a number
        if number.isnumeric():
            print("It is a number")
            output = subprocess.check_output('echo file'+str(number)+' > file'+ str(number), shell=True)
            files=files-1
        else:
            print("It is NOT a number")
