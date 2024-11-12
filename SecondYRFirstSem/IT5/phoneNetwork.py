cpnum= input("Enter your Cellphone number")
cpnumInt = int(cpnum[2:4])
if (len(cpnum)> 11 or len(cpnum) < 11):
    print("Incorrect cellphone number format")
elif cpnumInt in [13 ,14 ,20 ,21 ,28 ,29]:
    print("Smart")
elif cpnumInt in [8 ,9, 10, 11, 12, 18, 19]:
    print("Tnt")
elif cpnumInt in [22, 23, 32, 33]:
    print("Sun")
elif cpnumInt in [15, 16, 17, 25, 26, 27]:
    print("Globe")
elif cpnumInt in [3, 4, 5, 6, 7]:
    print("TM")
elif cpnumInt in [1, 2, 24]:
    print("Red")
else:
    print("Unknown network")
