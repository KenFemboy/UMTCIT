expenseslist = [("Dinner at ABC Restaurant","Food",20),("Taxi Rides","Travel",15),("Diwata Pares","Food",500)]
def add_expense(description, category , amount):
    itemsToBeAdded = (description,category,amount)
    expenseslist.append(itemsToBeAdded)

def view_all_expenses():
    count = 1
    total = 0
    for x in expenseslist:
        print(f"{count}. Description: {x[0]},", end=' ')
        print(f"Category:  {x[1]},", end=' ')
        print(f"Amount: ${x[2]}")
        count += 1
        total += int(x[2])
    print(f"Total: ${total}")

def view_expenses_by_category(category):
    count = 1
    total = 0
    for x in expenseslist:
        if x[1] == category:
            print(f"{count}. Description: {x[0]}, Amount: ${x[2]}")                                                             #LabradorActivity
            count += 1
            total = int(x[2])
    print(f"Total: ${total}")

def delete_expense(description):
    for x in expenseslist:
        if x[0] == description:
            expenseslist.remove(x)
            break

def generate_report():
    pass
while(True):
    # print("Welcome to Expense Tracker")
    # print("1. Add an Expense")
    # print("2. View All Expenses")
    # print("3. View Expenses by Category")
    # print("4. Delete an expense")
    # print("5. Generate Expense")
    print("6. Exit")

    userinput = int(input("Enter your choice: "))

    if userinput == 1:
        description = str(input("Enter description\n"))
        category = str(input("Enter Category\n"))
        amount = int(input("Enter amount\n"))
        add_expense(description, category, amount)
        print("Expense added successfully!\n")
    if userinput == 2:
        print("\n")
        view_all_expenses()
        print("\n\n")
    if userinput == 3:
        category = str(input("Enter Category: "))
        view_expenses_by_category(category)
        print("\n")
    if userinput == 4:
        description = str(input("Enter Description to Delete: "))
        delete_expense(description)
        print(f"Expense {description} deleted Successfully")
        print("\n")
        
    if userinput == 5:
        generate_report()
    if userinput == 6:
        break
    
