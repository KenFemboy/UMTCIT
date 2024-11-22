itemnum = int(input("Enter the number of items: "))
itemname = []
itemStockLvl = []
itemLowStockThreshold = []

for i in range(itemnum):
    print(f"\nEnter details for item {i + 1}")
    input1 = str(input("Name: "))
    input2 = int(input("Stock Level: "))
    input3 = int(input("Low Stock Threshold: "))
    itemname.append(input1)
    itemStockLvl.append(input2)
    itemLowStockThreshold.append(input3)

print("\nInventory Status")
for i in range(len(itemname)):
    status = ""
    if itemStockLvl[i] == 0:
        status = "Out of Stock"
    elif itemStockLvl[i] <= itemLowStockThreshold[i]:
        status = "Low Stock"
    else:
        status = "In Stock"
    print(f"{itemname[i]}: {status} ({itemStockLvl[i]} units)")

print("\nInventory Summary")
outofStock = 0
lowStock = 0
inStock = 0

for i in range(len(itemname)):
    status = ""
    if itemStockLvl[i] == 0:
        outofStock += 1
        status = "Out of Stock"
    elif itemStockLvl[i] <= itemLowStockThreshold[i]:
        lowStock += 1
        status = "Low Stock"
    else:
        inStock += 1
        status = "In Stock"

print(f"Out of Stock: {outofStock} Items")
print(f"Low Stock: {lowStock} items")
print(f"In Stock: {inStock} items")
