
public class Inomsaloob{

    enum Flavor{
        MATCHA, JAVACHIP, TRIPLEFUDGE;
    }

    public static void main(String[] args) {
        Flavor lasa = Flavor.MATCHA;

        if(lasa == lasa.JAVACHIP){
            System.out.println("this is javachip");
        }else if(lasa == lasa.MATCHA){
            System.out.println("hmm masarap ang damo");
        }else if(lasa == lasa.TRIPLEFUDGE){
            System.out.println("Ang tamis diko maubos");
        }

        
    }
}
