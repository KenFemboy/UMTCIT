numlist = []

input = str(input("Enter num list:\n"))
numlist = input.split(" ")
print(len(numlist))
print(numlist[len(numlist)- 1])
numlist.sort(reverse=True)
for num in numlist:
    print(num, end=" ")
print()
for num in numlist:
    if int(num) == 5:
        print("Yes")
        break 
count = 0
for num in numlist:
    if int(num) == 5:
        count += 1
print(count)
numlist.pop(0)
numlist.pop(len(numlist) - 1)
numlist.sort()
for num in numlist:
    print(num, end=" ")