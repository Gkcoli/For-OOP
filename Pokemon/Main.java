import java.util.Scanner;
public class Main {


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Pokemon pm1 = new Pokemon();
    pm1.pokeName = "Charizard ";
    pm1.pokeLevel = 45;
    pm1.attack();
    System.out.println("Pokemon Name: " + pm1.pokeName + "\nMonster Level: " + pm1.pokeLevel);

    int aiGenerate = (int) (Math.random()* 4);
    System.out.println(pm1.pokeName + pm1.castSpell(aiGenerate));

    Pokemon pm2 = new Pokemon("Pikachu ",15);
    pm2.attack();
    System.out.println("Pokemon Name: " + pm2.pokeName + "\nMonster Level: " + pm2.pokeLevel);

    int aiGenerate2 = (int) (Math.random()* 4);
    System.out.println(pm2.pokeName + pm2.castSpell(aiGenerate2));

    Pokemon pm3 = new Pokemon("Squirtle ");
    pm3.pokeLevel = 20;
    pm3.attack();
    System.out.println("Pokemon Name: " + pm3.pokeName + "\nMonster Level: " + pm3.pokeLevel);

    int aiGenerate3 = (int) (Math.random()* 4);
    System.out.println(pm3.pokeName + pm3.castSpell(aiGenerate3));


 }

}
