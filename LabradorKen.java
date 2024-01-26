
public class LabradorKen {
    static int AdditionMethod(int x, int y){
        return x+y;
    }
   
    static int SubtractionMethod(int x, int y){
        return x-y;
    }
    static int MultiplicationMethod(int x, int y){
        return x*y;
    }
    static int DivisionMethod(int x, int y){
        return x/y;
    }
   public static void main(String[] args){
    int num1 = AdditionMethod(5,3);
    int num2 = SubtractionMethod(5,3);
    int num3 = MultiplicationMethod(5,3);
    int num4 = DivisionMethod(5,3);

    System.out.println("The sum is: " + num1);
    System.out.println("The difference is: " + num2);
    System.out.println("The product is: " + num3);
    System.out.println("The qoutient is: " + num4);


}
    
}
