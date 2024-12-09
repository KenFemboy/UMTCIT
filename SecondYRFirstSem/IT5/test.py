expenseslist = [("Dinner at ABC Restaurant","Food",20),("Taxi Rides","Travel",15)]
category = "Food"
description = "Taxi Rides"
# for x in expenseslist:
#     if x[1] == category:
#         print(x[0], x[1], x[2])
print(expenseslist)
# print(expenseslist[0].index(description))

for x in expenseslist:
        if x[0] == description:
            expenseslist.remove(x)
            break
print(expenseslist)