public class Array_Labrador{


public static void main(String[] args){
    int[] number = {1,2,3,4,5,6,7,8,9,10};

    int i;
    for(i = 0; i < number.length; i++){
        if(number[i] % 2 == 0){
            System.out.println(number[i] + " is an even number");
        }
        else{
            System.out.println(number[i] + " is an odd number");
        }
    }
}
}