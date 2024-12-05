#include <stdio.h>
#include <ctype.h>

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
    char lowerCaseList[100];
    char upperCaseList[100];
    int lowerCount = 0, upperCount = 0;
    
    
    for (int i = 0; i < 1; i + 0) {
        char ch;
        printf("Enter a letter (A-Z or a-z), use '@' to finish: ");
        scanf(" %c", &ch);
        if(ch == 64 || (ch >= 33 && ch <= 47)){
            break;
        }
        if(!isalpha(ch)){
            printf("Error please try again\n");
            continue;
        }
        if (islower(ch)) {
            int isDuplicate = 0;
            for (int i = 0; i < lowerCount; i++) {
                if (lowerCaseList[i] == ch) {
                    isDuplicate = 1;
                    break;
                }
            }
            if(!isDuplicate){
                lowerCaseList[lowerCount++] = ch;
            }
        } 
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
    sortArray(lowerCaseList, lowerCount);
    sortArray(upperCaseList, upperCount);
    
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