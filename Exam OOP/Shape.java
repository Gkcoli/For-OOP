package ClassPack;

public class Shape {
    private double param1;
    private double param2;

    public Shape(double param1, double param2){
        this.param1 = param1;
        this.param2 = param2;
    }

    public Shape(double param1){
        this(param1, 0);
    }
    public double getParam1(){
        return param1;
    }
    public double getParam2(){
        return param2;
    }
    public double getArea(){
        return 0; // to overridden by subclass
    }
    public double getVolume(){
        return getParam1() * getParam2();
    }
    
}
