interface Dog{
    public void bark();
       
    

}
class Bulldog implements Dog{
    public void bark(){
        System.out.println("BARK!");
    }
}
 
public class MyObject{
    public static void main(String[] args) {
        
        Bulldog b = new Bulldog();
        System.out.println(b instanceof Dog);
       
    }
}
