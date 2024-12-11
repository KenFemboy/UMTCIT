#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>
#include <string.h>

void randomizeNumList(int *list, int size){
    for (int i = size - 1; i > 0; i--) {
        
        int j = rand() % (i + 1);

       
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
void printList(int *numlist, int size){
    for (int i = 0; i < size; i++) {
        printf("%d ", numlist[i]);
    }
    printf("\n");
}
void reverseFirstN(int *list, int size, int n) {
    int start = 0;
    int end = n - 1;
    while (start < end) {
        int temp = list[start];
        list[start] = list[end];
        list[end] = temp;
        start++;
        end--;
    }
}
bool compareLists(int *list1, int *list2, int size1, int size2) {
    if (size1 != size2) {
        return false;
    }

    for (int i = 0; i < size1; i++) {
        if (list1[i] != list2[i]) {
            return false;
        }
    }
    return true; 
}

int main() {
    int numlist[9] = {1,2,3,4,5,6,7,8,9};
    int correctnumlist[9] = {1,2,3,4,5,6,7,8,9};
    int size = sizeof(numlist)/ sizeof(numlist[0]);
    char input;
    
    int easy, average, difficult,level;
    easy = 20;
    average = 15;
    difficult = 7;
    char tryagain[4];
    srand(time(NULL));
    
    
    while(1){
        int attempt = 1;
        while(1){
            printf("LEVEL: E/A/D\n");
            scanf(" %c", &input);
            if(input == 'E'){
                level = easy;
                break;
            }
            if(input == 'A'){
                level = average;
                break;
            }
            if(input == 'D'){
                level = difficult;
                break;
            }
            else{
                printf("Invalid Input try Again\n\n");
                continue;
            }
        }
        
        printf("The list is: \n");
        randomizeNumList(numlist, size);
        printList(numlist, size);
        
        
        while(1){
            if(attempt > level){
                printf("You Failed!");
                break;
            }
            int numInput;
            
            printf("HOW MANY SHALL I REVERSE? ");
            scanf(" %d", &numInput);
            if(numInput < 2 || numInput > 9){
                printf("Invalid Input!\n");
                continue;
            }
            reverseFirstN(numlist,size,numInput);
            printList(numlist, size);
            
            if(compareLists(numlist, correctnumlist,size,size)){
                printf("You won in %d moves!\n",attempt);
                break;
            }
            else{
                attempt++;
                continue;
            }
            
            
        }
        
        
        
        while(1){
            printf("\n TRY AGAIN?[YES/NO]: ");
            scanf("%s", tryagain);
            if (strcmp(tryagain, "YES") == 0) {
                break;
            }
            else if(strcmp(tryagain, "NO") == 0){
                printf("Program Exited");
                break;
                
            }
            else{
                continue;
            }
        }
    if(strcmp(tryagain, "NO") == 0){
        break;
    }    
        
        
    }
    return 0;
}