#include <stdio.h>
#include <stdlib.h> // para sa rand() na method na naa sa randomizeNumList() line 7
#include <time.h> //para sa pag generate ug random number line 57
#include <stdbool.h> // para sa bool method line 33
#include <string.h> // para sa pag check sa input sa user sa "TRY AGAIN" line 117

//method para ma randomize ang order sa list
void randomizeNumList(int *list, int size){
    for (int i = size - 1; i > 0; i--) {
        int j = rand() % (i + 1);
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
//method para ma-print ang list
void printList(int *numlist, int size){
    for (int i = 0; i < size; i++) {
        printf("%d ", numlist[i]);
    }
    printf("\n");
}
//i reverse ang mga sulod sa list depende sa input sa user
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
//i compare ang na randomized na list sa list na ordered(1-2) line 47
bool compareLists(int *list1, int *list2, int size) {
    for (int i = 0; i < size; i++) {
        if (list1[i] != list2[i]) {
            return false;
        }
    }
    return true; 
}

//main code
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
    
    srand(time(NULL)); //pang generate ug random number para gamiton sa randomizeNumlist na method
    
    
    while(1){ // magloop siya pirme
        int attempt = 1; // ihapon ang attempt sa user
        while(1){
            printf("LEVEL: E/A/D\n");
            scanf(" %c", &input);
            //i check ang input ni user
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
        randomizeNumList(numlist, size); // i randomize ang list
        printList(numlist, size);//i print ang list na naka randomize
        
        
        while(1){
            // i check kung lapas naba ang attempt ni user
            if(attempt > level){
                printf("You Failed!");
                break; //stop ang loop then proceed to line 123
            }
            int numInput;
            printf("HOW MANY SHALL I REVERSE? ");
            scanf(" %d", &numInput);
            //i check if ang input ni user is valid bawal 1 or lapas 9
            if(numInput < 2 || numInput > 9){
                printf("Invalid Input!\n");
                continue;
            }
            
            reverseFirstN(numlist,size,numInput);// i reverse ang mga number na gi dictate ni user na i reverse
            printList(numlist, size);//i print ang list 
            
            // i check if ang ang list kay inorder
            if(compareLists(numlist, correctnumlist, size)){
                printf("You won in %d moves!\n",attempt);
                break;//stop ang loop
            }
            else{
                attempt++;
                continue;//balik sugod (balik to line 61)
            }
            
            
        }
        
        
        //ask ang user kung mu usab o di
        while(1){
            printf("\n TRY AGAIN?[YES/NO]: ");
            scanf("%s", tryagain);
            if (strcmp(tryagain, "YES") == 0) {
                break;//i stop ni na loop then balik to line 60
            }
            else if(strcmp(tryagain, "NO") == 0){
                printf("Program Exited");
                break;//stop ni na loop
                
            }
            else{//balik to line 124
                continue;
            }
        }
    
    //if NO na ang input ni user, stop na ang loop/program
    if(strcmp(tryagain, "NO") == 0){
        break;
    }    
        
        
    }
    return 0;
}