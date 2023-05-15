package ClassPack;

public class Triangle extends Shape {
    public Triangle(double height, double width){
        super(height, width);
        
    } 
    public double getArea(){
        return (getHeight() * getWidth())/2;
   }
}

