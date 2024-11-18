given = 'ProductA:10/20/30;ProductB:15/25/35'
product = given.split(';')
print(product)

for i in range(len(product)):
    product[i] = product[i].split(':')
print(product)        