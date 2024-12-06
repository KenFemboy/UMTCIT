#include <stdio.h>
#include <ctype.h>
//Bubble sort but sorted in reversed
void sortArray(char arr[], int count) {
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                char temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
int main() {
    //variables
    char lowerCaseList[100];
    char upperCaseList[100];
    //variable for counting input
    int lowerCount = 0, upperCount = 0;
    
    //infinite loop
    while (1) {
        //variable for user input
        char ch;
        printf("Enter a letter (A-Z or a-z), use '@' to finish: ");
        scanf(" %c", &ch);
        //check for special characters using acsii 
        if(ch == 64 || (ch >= 33 && ch <= 47)){
            break;
        }
        //check if user input is a char/alphabet type
        if(!isalpha(ch)){
            printf("Error please try again\n");
            continue;
        }
        //check if the user input is a lowercase
        if (islower(ch)) {
            
            int isDuplicate = 0;
            //loop through the list
            for (int i = 0; i < lowerCount; i++) {
                //check if user input is already in the list
                if (lowerCaseList[i] == ch) {
                    isDuplicate = 1;
                    break;
                }
            }
            //check if user input is NOT on the list
            if(!isDuplicate){
                //add user input to the list
                lowerCaseList[lowerCount++] = ch;
            }
        } 
        //check if the user input is a uppercase
        else if (isupper(ch)) {
            int isDuplicate = 0;
            for (int i = 0; i < upperCount; i++) {
                if (upperCaseList[i] == ch) {
                    isDuplicate = 1;
                    break;
                }
            }
            if (!isDuplicate) {
                upperCaseList[upperCount++] = ch;
            }
        }
    }
    //sort list using sortArrat function
    sortArray(lowerCaseList, lowerCount);
    sortArray(upperCaseList, upperCount);
    
    //loop to print lists
    printf("Lower Case Letters: ");
    for (int i = 0; i < lowerCount; i++) {
        printf("%c ", lowerCaseList[i]);
    }
    printf("\n");
    printf("Upper Case Letters: ");
    for (int i = 0; i < upperCount; i++) {
        printf("%c ", upperCaseList[i]);
    }
    return 0;
}