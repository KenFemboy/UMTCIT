package JavaProject;

import java.util.ArrayList;

public class Cars {
    String[] cars;
    


    public Cars() {
        cars= new String[1];
        cars[0] = "Lamborgini";
        
    }

    void showCarCollection(){
        for(int i = 0; i < cars.length; i++){
            System.out.print(cars[i] + " ");
        }
    }
}
