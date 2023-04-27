public class food {
    int foodPrice;
    String foodName;

    food(int foodPrice, String foodName){
        this.foodPrice = foodPrice;
        this.foodName = foodName;

    }
    public String toString(){
        return  foodPrice + " " + foodName;
    }
    
}
