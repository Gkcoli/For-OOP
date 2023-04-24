class Bird{
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}
class Robin extends Bird{
    public void sing(){
        System.out.println("twidddledeedee");
    }

}
class Pelican extends Bird{
    public void sing(){
        System.out.println("KWAAH KWAAH KWAHA");
    }

}
public class Polymorphism{
    public static void main(String[] args) {
        //Bird b = new Bird();
        //Robin b = new Robin();
        //Pelican b = new Pelican();
        //b.sing();
    }
}
