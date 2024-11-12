import math

print("Welome to the python calculator!")

print("Select an option\n")
print("1. Addition\n")
print("2. Subtaction\n")
print("3. Multiplication\n")
print("4. Division\n")
print("5. Modulus\n")
print("6.Exponentiation\n")
print("7. Square root\n")
print("8. Sine\n")
print("9. Cosine\n")
print("10 Tangent\n")
print("11. Logarithm (natural)\n")
print("12. Logaritm (base 10)\n")
print("13. Exit\n")

choice = int(input("Enter your choice: "))

if choice == 1:
    num1 = float(input("Enter first number: "))
    num2 = float(input("Enter second number: "))
    print("Result: ", num1 + num2)
elif choice == 2:
    num1 = float(input("Enter first number: "))
    num2 = float(input("Enter second number: "))
    print("Result: ", num1 - num2)
elif choice == 3:
    num1 = float(input("Enter first number: "))
    num2 = float(input("Enter second number: "))
    print("Result: ", num1 * num2)
elif choice == 4:
    num1 = float(input("Enter first number: "))
    num2 = float(input("Enter second number: "))
    print("Result: ", num1 / num2)
elif choice == 5:
    num1 = float(input("Enter first number: "))
    num2 = float(input("Enter second number: "))
    print("Result: ", num1 % num2)
elif choice == 6:
    num1 = float(input("Enter first number: "))
    num2 = float(input("Enter second number: "))
    print("Result: ", num1 ** num2)
elif choice == 7:
    num1 = float(input("Enter a number: "))
    print("Result: ", math.sqrt(num1))
elif choice == 8:
    num1 = float(input("Enter a number: "))
    print("Result: ", math.sin(num1))
elif choice == 9:
    num1 = float(input("Enter a number: "))
    print("Result: ", math.cos(num1))
elif choice == 10:
    num1 = float(input("Enter a number: "))
    print("Result: ", math.tan(num1))
elif choice == 11:
    num1 = float(input("Enter a number: "))
    print("Result: ", math.log(num1))
elif choice == 12:
    num1 = float(input("Enter a number: "))
    print("Result: ", math.log(num1, 10))))
elif choice == 13:
    print("Program Terminated")
else:
    print("Try again")




