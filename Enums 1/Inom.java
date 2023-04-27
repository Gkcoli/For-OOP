enum Difficulties{
    EASY, AVERAGE, EXPERT;
}
public class Inom{

    

    public static void main(String[] args) {
        
        Difficulties d = Difficulties.EXPERT;
        
      

        switch(d){
        case EASY:
        System.out.println("Easy difficulty");
        break;
        case AVERAGE:
        System.out.println("Average difficulty");
        break;
        case EXPERT:
        System.out.println("Expert difficulty");
        break;
        }

        
    }
}
