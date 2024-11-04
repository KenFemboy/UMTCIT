grade = int(input("Enter your grade: "))
#Charles Kent Labrador
if grade >= 96:
    print("Conversion: 4.0")
    print("Grade Description: A || High Distinction")
elif grade <= 95 and grade >= 90:    
    print("Conversion: 3.5")
    print("Grade Description: B+ || Distinction")
elif grade <= 89 and grade >= 85:    
    print("Conversion: 3.0")
    print("Grade Description: B- || Very Good")
elif grade <= 84 and grade >= 80 :    
    print("Conversion: 2.5")
    print("Grade Description: C+ || Good")
elif grade <= 79 and grade >= 75:    
    print("Conversion: 2.0")
    print("Grade Description: C- || Average")
else:    
    print("Conversion: 1.0")
    print("Grade Description: F || Fail")