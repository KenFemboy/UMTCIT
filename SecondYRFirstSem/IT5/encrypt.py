userinput = str(input("Input password to encrypt: "))
alphabet = "bcdfghjklmnpqrtvwxyz"
vowels = "aeiou"
special ="s"
shiftkey = 2
output = ""
for i in range(len(userinput)):
    c = userinput[i]
    
    if c in alphabet:
        index = alphabet.index(c)
        newIndex = (index + shiftkey) % 26
        output += alphabet[newIndex] 
    elif c in vowels:
        index = vowels.index(c)
        newIndex = (index + 1) % 26
        output += vowels[newIndex]
    elif c in special:
        c = "$"
        output += c
    elif c.isnumeric:
        c = int(c) * shiftkey
        output += str(c)
    else:
        output += c

for j in range(len(output)):
    if j == 0:
        print(output[j].upper(), end="")
    else:
        print(output[j], end="")
#labrador