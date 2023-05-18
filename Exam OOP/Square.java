package ClassPack;

public class Square extends Shape{
    public Square(double sideLength){
        super(sideLength);
    }
    public double getArea(){
        return getParam1() * getParam1();
    }
    public double getVolume(){
        return 0;
    }
    
}
