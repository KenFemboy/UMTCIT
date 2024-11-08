name = str(input("Enter name: "))
age = int(input("Enter age: "))
location = str(input("Enter location: "))
qoute = str(input("Enter quote: "))
# name = "Charles Kent Labrador"
# age = 19
# location =  "Shibuya, Japan"
# qoute ="""One Gear , No Fear. So ride a Fixed Gear🚴‍♀️"""
firstname = name.split(" ")
qoutelength = len(qoute)

print(f"\nWelcome: {firstname[0]}😎😍🥰" )
print("Here is your profile summary\n")
print("-------------------------")
print(f"Name: {name}")
print(f"Age: {age}")
print(f"Location: {location}")
print(f"Favorite Qoute: {qoute}")
print(f"Qoute Length: {qoutelength}")
print("-------------------------")



