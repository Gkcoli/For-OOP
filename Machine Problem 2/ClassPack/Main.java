package ClassPack;

import java.util.Scanner;

import ClassPack.Rectangle;
import ClassPack.Triangle;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What Shape: ");
        String shape = scanner.nextLine();
        
        System.out.print("Enter Height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter Width: ");
        double width = scanner.nextDouble();
        
        Triangle triangle = new Triangle(height, width);
        

        Rectangle rectangle = new Rectangle(height, width);

        if(shape.equalsIgnoreCase("rectangle")){
            System.out.println("Area: " +  rectangle.getArea());
        }else if(shape.equalsIgnoreCase("triangle")){
            System.out.println("Area: " + triangle.getArea());
         }
              
    scanner.close();
    }
    
}
