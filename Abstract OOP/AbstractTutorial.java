  interface DogInterface{
   
    void poop();
 }
  abstract class Dog{
    String breed;

    public void bark(){
        System.out.println("Bark!");
    }
    public abstract void poop();
   
}
class Chihuahua extends Dog{
    public void poop(){
        System.out.println("Tumae si jake");
    }

}
public class AbstractTutorial{
    public static void main(String[] args) {
        //Dog d = new Dog();
        Chihuahua c = new Chihuahua();
        
        c.bark();
        c.poop();
        //System.out.println(c.breed);
        
    }
  
}
