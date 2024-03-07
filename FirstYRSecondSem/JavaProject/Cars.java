package JavaProject;

import java.util.ArrayList;

public class Cars {
    private String brand;
    private String model;
    private double price;


    Cars[] cars = new Cars[3];
    public Cars(){
    cars[0] = new Cars("Toyota", "Camry", 25000.0);
    cars[1] = new Cars("Honda", "Civic", 22000.0);
    cars[2] = new Cars("Ford", "Mustang", 35000.0);
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


