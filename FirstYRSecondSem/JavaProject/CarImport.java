package JavaProject;

import java.util.Scanner;

public class CarImport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("Welcome to Luxury Cars Import");
        
        menu.Login();
        menu.CheckImports();

    }
}
