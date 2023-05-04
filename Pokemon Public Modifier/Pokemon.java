public class Pokemon {
    public String pokeName;
    public int pokeLevel;
    public String[] ability = new String [4];

    public void attack(){
        System.out.println(pokeName + "atttack your opponent!");
    }
    public String castSpell(int randomInt){
        String skills = ability[randomInt];
        return "used " + skills;

    }
    public Pokemon(){
        pokeLevel = 1;
        ability[0] = "Air Slash";
        ability[1] = "Dragon's Breath";
        ability[2] = "Wing Slash";
        ability[3] = "Ember";
    }
    public Pokemon(String pokeName, int pokeLevel){
        this.pokeName = pokeName;
        this.pokeLevel = pokeLevel;
        ability[0] = "Quick Attack";
        ability[1] = "Thunder Shock";
        ability[2] = "Wild Charge";
        ability[3] = "Thunder Bolt";
        
    }
    public Pokemon(String pokeName){
        this.pokeName = pokeName;
        this.pokeLevel = pokeLevel;
        ability[0] = "Frustration Shadow";
        ability[1] = "Aqua Jet";
        ability[2] = "Aqua Tail";
        ability[3] = "Water Pulse";
    }
}
