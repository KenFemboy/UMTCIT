userinput = str(input("Enter your shopping list in this format (Item:Price): "))
items = userinput.split(",")
total = 0
for i in range(len(items)):
    items[i] = items[i].split(":")
    print(items[i])
itemnames = []
itemprice = []
for i in items:
    itemnames.append(i[0])
for i in items:
    itemprice.append(i[1])
total = 0
for i in itemprice:
    total += float(i)
print("The total price is ", total)
findItem = str(input("Enter item name:  "))
index = itemnames.index(findItem)
print(f"Item name: {itemnames[index]} Itemprice: {itemprice[index]}")