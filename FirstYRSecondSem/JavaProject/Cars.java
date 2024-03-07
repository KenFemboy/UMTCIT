package JavaProject;

import java.util.ArrayList;

public class Cars {
    private String brand;
    private String model;
    private double price;
    private String country;
    private int platenumber;


    Cars[] cars = new Cars[10];
    public Cars(){
    cars[0] = new Cars("Toyota", "Camry", 35390.0);
    cars[1] = new Cars("Honda", "Civic", 23950.0);
    cars[2] = new Cars("Ford", "Mustang", 36445.0);
    cars[4] = new Cars("Toyota", "Supra", 66370.0);
    cars[5] = new Cars("Porsche", "911 Carrera GTS", 559400.0);
    cars[6] = new Cars("NISSAN", "GTR R34", 116641.0);
    cars[7] = new Cars("Toyota", "Trueno AE86", 20000.0);
    cars[8] = new Cars("Mazda", "RX-7 FD", 43158.0);
    cars[9] = new Cars("Honda", "NSX", 169500.0);
   

}
    
    void CheckImports(){
        System.out.println("Here are the available imports:");
        for(int i = 0; i < cars.length; i++){
            System.out.println("Car " + (i+1) + ":");
            System.out.println("Make: " + cars[i].getBrand());
            System.out.println("Model: " + cars[i].getModel());
            System.out.println("Price: $" + cars[i].getPrice());
            System.out.println();
        }
    }  

    // Constructor
    public Cars(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }
    public String getBrand(int i){
        return cars[i].getBrand();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public String getModel(int i){
        return cars[i].getModel();
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
   
    public double getPrice(int i){
        return cars[i].getPrice();
    }
    public void setPrice(double price) {
        this.price = price;
    }
}


