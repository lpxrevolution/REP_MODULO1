# Create a script that asks for a car model.
# It must return 1 if exists in a list of car models, or 0 if it does not exist,
# and so, add it to the list

modList=["ford","seat","fiat"]

model=input("Type a car model to search...")

bolFound=0
for item in modList:
    if model==item:
        bolFound=1
        exit

print(bolFound)

if bolFound==0:
    modList.append(model)
    print(modList)
        
