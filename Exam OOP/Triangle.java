package ClassPack;

public class Triangle extends Shape {

    public Triangle(double param1, double param2){
        super(param1, param2);
    }
    public double getArea(){
        return 0.5 * getParam1() * getParam2();
    } 
}
