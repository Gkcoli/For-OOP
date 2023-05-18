package ClassPack;

public class Rectangle extends Shape {
    private double height;

    public Rectangle(double length, double width, double height){
        super(length, width);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return getParam1() * getParam2();
    }
    public double getVolume(){
        return getArea() * getHeight();
    }  
}
