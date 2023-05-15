package ClassPack;
public class Rectangle {
    
    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }
    public double getArea(){
        return length * width;
    }

}

