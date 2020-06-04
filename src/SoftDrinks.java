public class SoftDrinks extends Product {

    @Override
    public String description (){

        return "This is a Soft Drink";
    }

    private int softDrinkLevel = 0;

    SoftDrinks stockOfDrink = new SoftDrinks();

    void addStock(SoftDrinks softdrink){
        this.stockOfDrink = softdrink;
        softDrinkLevel = 0;
        softDrinkLevel += 3;
        System.out.println();
    }

    int getStock (SoftDrinks softDrinks){
        this.stockOfDrink = softDrinks;
        return softDrinkLevel;
    }
}
