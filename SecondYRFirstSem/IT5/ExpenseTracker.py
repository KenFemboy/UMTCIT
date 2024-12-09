expenseslist = []
def add_expense(description, category , amount):
    itemsToBeAdded = (description,category,amount)
    expenseslist.append(itemsToBeAdded)
    print("Expense added Successfully")
    print("\n")

def view_all_expenses():
    count = 1
    total = 0
    print("All Expenses: ")
    for x in expenseslist:
        print(f"{count}. Description: {x[0]},", end=' ')
        print(f"Category:  {x[1]},", end=' ')
        print(f"Amount: ${x[2]}")
        count += 1
        total += int(x[2])
    
    print(f"Total Spent: ${total}")
    print("\n")

def view_expenses_by_category(category):
    count = 1
    total = 0
    print(f"Expenses in Category '{category}': ")
    for x in expenseslist:
        if x[1] == category:
            print(f"{count}. Description: {x[0]}, Amount: ${x[2]}")                                                             #LabradorActivity
            count += 1
            total = int(x[2])
    print(f"Total in Category: ${total}")
    print("\n")

def delete_expense(description):
    for x in expenseslist:
        if x[0] == description:
            expenseslist.remove(x)
            break
    print(f"Expense {description} deleted Successfully")
    print("\n")

def generate_report():
    count = len(expenseslist)
    total = 0
    highest = 0
    category = ""
    for x in expenseslist:
        total += x[2]
    for x in expenseslist:
        if x[2] > highest:
            highest = x[2]
            category = x[1]
    print("Expense Report")
    print(f"Total Expenses:{count}")
    print(f"Total Amount Spent: ${total}")
    print(f"Category with Highest Spending :{category} ( ${highest} )")
    print("\n")


    
while(True):
    print("Welcome to Expense Tracker")
    print("1. Add an Expense")
    print("2. View All Expenses")
    print("3. View Expenses by Category")
    print("4. Delete an expense")
    print("5. Generate Expense")
    print("6. Exit")

    userinput = int(input("Enter your choice: "))

    if userinput == 1:
        description = str(input("Enter description:\n"))
        category = str(input("Enter Category:\n"))
        amount = int(input("Enter amount:\n"))
        add_expense(description, category, amount)
    if userinput == 2:
        print("\n")
        view_all_expenses()
    if userinput == 3:
        category = str(input("Enter Category: "))
        view_expenses_by_category(category)
    if userinput == 4:
        description = str(input("Enter Description to Delete: "))
        delete_expense(description)
    if userinput == 5:
        generate_report()
        
    if userinput == 6:
        print("Thank you for using Expenses Tracker!")
        break
    
