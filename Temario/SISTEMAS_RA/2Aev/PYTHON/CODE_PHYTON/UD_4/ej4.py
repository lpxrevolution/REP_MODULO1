from random import randint
lista=[]
cont=0

while(cont<10):
  cont=cont+1
  w=randint(1, 100)
  lista.append(w)
print(lista)
print('Máximo:',max(lista))
print('Mímino:',min(lista))

#Debo buscar un método propio.