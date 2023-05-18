package ClassPack;

public class Circle extends Shape {
    public Circle(double radius){
        super(radius);
    }
    public double getArea(){
        return Math.PI * getParam1() * getParam1();
    }
    public double getVolume(){
        return 0;
    }

    
}
